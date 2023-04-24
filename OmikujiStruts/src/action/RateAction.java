package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.RateForm;
import omikuji.ResultStrutsDAO;

public class RateAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        String birthday = null;

        HttpSession session = request.getSession();
        birthday = (String) session.getAttribute("birthday");

        RateForm rateForm = ResultStrutsDAO.selectFromResultForRate(birthday);

      //セッションを取得
        session = request.getSession();
        session.setAttribute("rateForm", rateForm);
        return mapping.findForward("success");

    }
}
