package action;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.ResultForm;
import omikuji.CSVReader;
import omikuji.CheckBirthday;
import omikuji.Chukichi;
import omikuji.Daikichi;
import omikuji.Kichi;
import omikuji.Kyo;
import omikuji.OmikujiDAO;
import omikuji.ResultStrutsDAO;
import omikuji.Shokichi;
import omikuji.Suekichi;

public class ResultAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

              ResultForm resultForm=(ResultForm)form;
              String birthday =resultForm.getBirthday();

              //誕生日の形式が正しいかどうかをチェックする
              boolean check;
              CheckBirthday checkBirthday = new CheckBirthday(); //staticにできるならstaticメソッドを使った方がいい、newは自分専用の領域を作るという意味
              check = checkBirthday.checkBirthday(birthday); //newはメモリーを使い、staticは共有のもので、メモリー効率がいいわけ

              if (!check) {
                  request.setAttribute("errorMsg", "*正しい生年月日を入力してください。");
                  return mapping.findForward("login");
              }

              //占い日を指定
              Date date = new Date(); // 今日の日付
              SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
              String uranaiDate = dateFormat.format(date);

              //omikujiIdの宣言
              String omikujiId = null;


              //入力した誕生日の結果がある場合はresultテーブルから取得
              omikujiId = ResultStrutsDAO.selectFromResult(birthday, uranaiDate);

              //データ有無のチェック
              int count = OmikujiDAO.selectCountFromOmikuji();
              //データがない場合はcsvファイルから取得
              if (count == 0) {
                  String realPath = this.getServlet().getServletContext().getRealPath("/WEB-INF/fortune.csv");
                  File logFile = new File(realPath);
                  BufferedReader br = new BufferedReader(new FileReader(logFile));
                  count = CSVReader.csvRead(realPath);
              }
              System.out.println(count);

              // resultデータ有無フラグ
              boolean resultFlag = false;

              //結果がない場合はomikujiテーブルのデータチェックを実施
              if (omikujiId == null) {
                  // ランダムの数字を取得
                  int num = new Random().nextInt(count + 1);
                  omikujiId = Integer.toString(num);
              }
              else { //resultテーブルにデータがある人を示す
                  resultFlag = true;
              }
              System.out.println(omikujiId);

              // omikujiIdを元におみくじ情報を取得
              ResultForm omikuji = OmikujiDAO.selectFromOmikuji(omikujiId);
              //falseの場合はデータ登録する
              if (!resultFlag) {
                  //resultテーブルにデータを登録
                  ResultStrutsDAO.insertResult(birthday, uranaiDate, omikujiId);
              }

              resultForm.setUnsei(omikuji.getUnsei());
              resultForm.setNegaigoto(omikuji.getNegaigoto());
              resultForm.setAkinai(omikuji.getAkinai());
              resultForm.setGakumon(omikuji.getGakumon());

            //セッションを取得
          HttpSession session = request.getSession();
          session.setAttribute("resultForm", resultForm);
          session.setAttribute("birthday", birthday);
              return mapping.findForward("success");
          }

        //Omikujiクラスをnewするためのメソッド
          public static ResultForm getInstance(String unseimei) {
              ResultForm omikuji = null;
              switch (unseimei) {
              //大吉の場合
              case "大吉":
                  omikuji = new Daikichi();
                  break;

              //中吉の場合
              case "中吉":
                  omikuji = new Chukichi();
                  break;

              //小吉の場合
              case "小吉":
                  omikuji = new Shokichi();
                  break;

              //吉の場合
              case "吉":
                  omikuji = new Kichi();
                  break;

              //末吉の場合
              case "末吉":
                  omikuji = new Suekichi();
                  break;

              //凶の場合
              case "凶":
                  omikuji = new Kyo();
                  break;
              }
              return omikuji;

    }
}
