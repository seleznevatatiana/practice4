package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

        String birthday =listForm.getBirthday();
        birthday = request.getParameter("birthday");

        if (birthday != null) {
           listForm =   ResultDAO.selectFromResultForList(birthday);

//            listForm.setUnsei(listForm.getUranaiDate());
//            listForm.setUnsei(listForm.getUnsei());
//            listForm.setNegaigoto(listForm.getNegaigoto());
//            listForm.setAkinai(listForm.getAkinai());
//            listForm.setGakumon(listForm.getGakumon());

            if (listForm == null) {
                request.setAttribute("errorMsg", "*結果がありません");
                return mapping.findForward("result");
            }
        }
        //セッションを取得
        HttpSession session = request.getSession();
        session.setAttribute("listForm", listForm);
        return mapping.findForward("success");

    }

}
