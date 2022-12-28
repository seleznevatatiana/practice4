package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class RateAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        return mapping.findForward("success");


        //      OmikujiForm omikujiForm=(OmikujiForm)form;
        //      String birthday =omikujiForm.getBirthday();
        //
        //      birthday = request.getParameter("birthday");
        //
        //      //誕生日の形式が正しいかどうかをチェックする
        //      boolean check;
        //      CheckBirthday checkBirthday = new CheckBirthday(); //staticにできるならstaticメソッドを使った方がいい、newは自分専用の領域を作るという意味
        //      check = checkBirthday.checkBirthday(birthday); //newはメモリーを使い、staticは共有のもので、メモリー効率がいいわけ
        //
        //      if (!check) {
        //          request.setAttribute("errorMsg", "*正しい生年月日を入力してください。");
        //          RequestDispatcher dispatcher2 = request.getRequestDispatcher("/omikuji");
        //          dispatcher2.forward(request, response);
        //          return;
        //      }
        //
        //      //占い日を指定
        //      Date date = new Date(); // 今日の日付
        //      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //      String uranaiDate = dateFormat.format(date);
        //
        //      //omikujiIdの宣言
        //      String omikujiId = null;
        //
        //
        //      //入力した誕生日の結果がある場合はresultテーブルから取得
        //      omikujiId = ResultDAO.selectFromResult(birthday, uranaiDate);
        //
        //      //データ有無のチェック
        //      int count = OmikujiDAO.selectCountFromOmikuji();
        //      //データがない場合はcsvファイルから取得
        //      if (count == 0) {
        //          String realPath = this.getServletContext().getRealPath("/WEB-INF/fortune.csv");
        //          count = CSVReader.csvRead(realPath);
        //      }
        //      // resultデータ有無フラグ
        //      boolean resultFlag = false;
        //
        //      //結果がない場合はomikujiテーブルのデータチェックを実施
        //      if (omikujiId == null) {
        //          // ランダムの数字を取得
        //          int num = new Random().nextInt(count + 1);
        //          omikujiId = Integer.toString(num);
        //      }
        //      else { //resultテーブルにデータがある人を示す
        //          resultFlag = true;
        //      }
        //
        //      // omikujiIdを元におみくじ情報を取得
        //      Omikuji omikuji = OmikujiDAO.selectFromOmikuji(omikujiId);
        //      //falseの場合はデータ登録する
        //      if (!resultFlag) {
        //          //resultテーブルにデータを登録
        //          ResultDAO.insertResult(birthday, uranaiDate, omikujiId);
        //      }
        //
        //      HttpSession session = request.getSession();
        //      session.setUnsei(session.getUnsei());
        //      session.setNegaigoto(session.getNegaigoto());
        //      session.setAkinai(session.getAkinai());
        //      session.setGakumon(session.getGakumon());
        //
        //      request.setAttribute("omikujiBean", bean);
        //      request.getRequestDispatcher("/WEB-INF/OmikujiResult.jsp").forward(request, response);
        //  }
        //
        //  //Omikujiクラスをnewするためのメソッド
        //  public static Omikuji getInstance(String unseimei) {
        //      Omikuji omikuji = null;
        //      switch (unseimei) {
        //      //大吉の場合
        //      case "大吉":
        //          omikuji = new Daikichi();
        //          break;
        //
        //      //中吉の場合
        //      case "中吉":
        //          omikuji = new Chukichi();
        //          break;
        //
        //      //小吉の場合
        //      case "小吉":
        //          omikuji = new Shokichi();
        //          break;
        //
        //      //吉の場合
        //      case "吉":
        //          omikuji = new Kichi();
        //          break;
        //
        //      //末吉の場合
        //      case "末吉":
        //          omikuji = new Suekichi();
        //          break;
        //
        //      //凶の場合
        //      case "凶":
        //          omikuji = new Kyo();
        //          break;
        //      }
        //      return omikuji;

    }
}
