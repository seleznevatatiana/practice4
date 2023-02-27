package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.ListForm;
import omikuji.ResultDAO;

public class ListAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ListForm listForm=(ListForm)form;

        //omikujiIdの宣言
        String omikujiId = null;
        String birthday =listForm.getBirthday();
        birthday = request.getParameter("birthday");

        while (birthday != null) {
            ResultDAO.selectFromResultForList(birthday);

            listForm.setUnsei(listForm.getUranaiDate());
            listForm.setUnsei(listForm.getUnsei());
            listForm.setNegaigoto(listForm.getNegaigoto());
            listForm.setAkinai(listForm.getAkinai());
            listForm.setGakumon(listForm.getGakumon());


//            if (birthday == null) {
//                request.setAttribute("errorMsg", "*結果がありません");
//                return mapping.findForward("result");
//                break;
//            }
        }
        return mapping.findForward("success");

    }

}
