package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.ResultForm;
import omikuji.OmikujiDAO;

public class ListAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

      //omikujiIdの宣言
        String omikujiId = null;

        ResultForm resultForm=(ResultForm)form;

        ResultForm omikuji = OmikujiDAO.selectFromOmikuji(omikujiId);
        resultForm.setBirthday(omikuji.getBirthday());
        resultForm.setCreatedDate(omikuji.getCreatedDate());
        resultForm.setUnsei(omikuji.getUnsei());
        resultForm.setNegaigoto(omikuji.getNegaigoto());
        resultForm.setAkinai(omikuji.getAkinai());
        resultForm.setGakumon(omikuji.getGakumon());

      //セッションを取得
    HttpSession session = request.getSession();
    session.setAttribute("resultForm", resultForm);
        request.setAttribute("resultForm", resultForm);
        return mapping.findForward("success");

    }
}
