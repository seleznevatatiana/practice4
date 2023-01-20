package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import omikuji.ResultDAO;

public class ListAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //omikujiIdの宣言
        String omikujiId = null;
        String birthday = null;

        while (birthday != null) {
            ResultDAO.selectFromResultForList(birthday);

            listForm.setUnsei(list.getUnsei());
            listForm.setNegaigoto(list.getNegaigoto());
            listForm.setAkinai(list.getAkinai());
            listForm.setGakumon(list.getGakumon());

            if (birthday == null) {
                request.setAttribute("errorMsg", "*結果がありません");
                return mapping.findForward("result");
                break;
            }

        }
        return mapping.findForward("success");

    }
}
