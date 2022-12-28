package form;

import org.apache.struts.action.ActionForm;

public class RateForm extends ActionForm {

    private String birthday;

    /**
    * @return unsei
    */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @param unsei セットする unsei
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

}
