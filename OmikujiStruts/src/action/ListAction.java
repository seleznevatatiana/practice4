package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.ListForm;
import omikuji.ResultStrutsDAO;

public class ListAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        String birthday = null;

        HttpSession session = request.getSession();
        birthday = (String) session.getAttribute("birthday");

        ListForm listForm = null;

        if (birthday != null) {
            List<ListForm> list= ResultStrutsDAO.selectFromResultForList(birthday);
//                    listForm.setUranaiDate(list.getUranaiDate());
//                    listForm.setUnsei(list.getUnsei());
//                    listForm.setNegaigoto(list.getNegaigoto());
//                    listForm.setAkinai(list.getAkinai());
//                    listForm.setGakumon(list.getGakumon());
        }

//        if (list == null) {
//            request.setAttribute("errorMsg", "*結果がありません");
//            return mapping.findForward("list");
//        }

        //セッションを取得
        session = request.getSession();
        session.setAttribute("listForm", listForm);
        return mapping.findForward("success");

    }

}
