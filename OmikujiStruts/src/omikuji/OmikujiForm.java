package omikuji;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;



public class OmikujiForm extends ActionForm {
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException{

OmikujiForm omikujiForm=(OmikujiForm)form;
String name=omikujiForm.getUnsei();


return(mapping.findForward("input"));
}

    public void setUnsei() {
    }

    public String unsei;

    /**
    * @return unsei
    */
    public String getUnsei() {
        return unsei;
    }

    }

