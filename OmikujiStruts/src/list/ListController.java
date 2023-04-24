package list;

import org.springframework.web.bind.annotation.RequestMapping;

import form.ListForm;

public class ListController {

    @RequestMapping(params = "add")
    public String add(ListForm form, Model model) {
    ListForm listForm = ListManager.findItem(form.getUranaiDate());
    listForm = ListManager.findItem(form.getUranaiDate());
    listForm = ListManager.findItem(form.getUnsei());
    listForm = ListManager.findItem(form.getNegaigoto());
    listForm = ListManager.findItem(form.getAkinai());
    model.addAttribute("listForm", form.getGakumon());
//    form.getGoodsName();
//    form.setPoint(form.getPoint());
//    model.addAttribute("nameList", ListManager.makeNameList());
    return "add";
    }

}
