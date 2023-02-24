package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.RateForm;

public class RateAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        RateForm rateForm=(RateForm)form;

        String birthday =rateForm.getBirthday();

//        割合を作る処理
//        int rightAnswer = 4, totalProblem = 12;
//        double rate = (double)rightAnswer/totalProblem;

        //Omikujiクラスをnewするためのメソッド
//        public static RateForm getInstance(String unseimei) {
//            ResultForm omikuji = null;
//            switch (unseimei) {
//            //大吉の場合
//            case "大吉":
//                omikuji = new Daikichi();
//                break;
//
//            //中吉の場合
//            case "中吉":
//                omikuji = new Chukichi();
//                break;
//
//            //小吉の場合
//            case "小吉":
//                omikuji = new Shokichi();
//                break;
//
//            //吉の場合
//            case "吉":
//                omikuji = new Kichi();
//                break;
//
//            //末吉の場合
//            case "末吉":
//                omikuji = new Suekichi();
//                break;
//
//            //凶の場合
//            case "凶":
//                omikuji = new Kyo();
//                break;
//            }


        return mapping.findForward("success");

    }
}
