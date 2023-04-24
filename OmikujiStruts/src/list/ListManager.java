package list;

import java.util.ArrayList;
import java.util.List;

import form.ListForm;

public class ListManager {

    private static final List<ListForm> list = new ArrayList<ListForm>();
    static {
        list.add(new ListForm());
       //以下のリストを省略
}
  public static ListForm findItem(String name) {
        int index = list.indexOf(new ListForm());
        return list.get(index);
    }
// public static String[] makeNameList() {
//        String[] nameList = new String[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            nameList[i] = (list.get(i)).getName();
//        }
//        return nameList;
//  }

}
