package form;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.action.ActionForm;

public class ListForm extends ActionForm {

    public String birthday;
    public String uranaiDate;
    public String negaigoto;
    public String akinai;
    public String gakumon;
    public String unseiId;
    public String omikujiId;
    public String updater;
    public java.sql.Timestamp updatedDate;
    public String creator;
    public java.sql.Timestamp createdDate;
    public String unseiName;

    /**
    * @return birthday
    */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @param birthday セットする birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * @return uranaiDate
     */
     public String getUranaiDate() {
         return uranaiDate;
     }

     /**
      * @param uranaiDate セットする uranaiDate
      */
     public void setUranaiDate(String uranaiDate) {
         this.uranaiDate = uranaiDate;
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

    /**
     * @param unsei セットする unsei
     */
    public void setUnsei(String unsei) {
        this.unsei = unsei;
    }

    /**
     * @return negaigoto
     */
    public String getNegaigoto() {
        return negaigoto;
    }

    /**
     * @param negaigoto セットする negaigoto
     */
    public void setNegaigoto(String negaigoto) {
        this.negaigoto = negaigoto;
    }

    /**
     * @return akinai
     */
    public String getAkinai() {
        return akinai;
    }

    /**
     * @param akinai セットする akinai
     */
    public void setAkinai(String akinai) {
        this.akinai = akinai;
    }

    /**
     * @return gakumon
     */
    public String getGakumon() {
        return gakumon;
    }

    /**
     * @param gakumon セットする gakumon
     */
    public void setGakumon(String gakumon) {
        this.gakumon = gakumon;
    }

    /**
     * @return unseiId
     */
    public String getUnseiId() {
        return unseiId;
    }

    /**
     * @param unseiId セットする unseiId
     */
    public void setUnseiId(String unseiId) {
        this.unseiId = unseiId;
    }

    /**
     * @return omikujiId
     */
    public String getOmikujiId() {
        return omikujiId;
    }

    /**
     * @param omikujiId セットする omikujiId
     */
    public void setOmikujiId(String omikujiId) {
        this.omikujiId = omikujiId;
    }

    /**
     * @return updater
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * @param updater セットする updater
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    /**
     * @return updatedDate
     */
    public java.sql.Timestamp getUpdatedDate() {
        return updatedDate;
    }

    /**
     * @param updatedDate セットする updatedDate
     */
    public void setUpdatedDate(java.sql.Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator セットする creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return createdDate
     */
    public java.sql.Timestamp getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate セットする createdDate
     */
    public void setCreatedDate(java.sql.Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return unseiName
     */
     public String getUnseiName() {
         return unseiName;
     }

     /**
      * @param unseiName セットする unseiName
      */
     public void setUnseiName(String unseiName) {
         this.unseiName = unseiName;
     }

     private  List<ListForm> allList = new ArrayList<ListForm>();

     public List<ListForm> getAllList() {
         return allList;
     }
     public void addToAllList(ListForm listForm){
         this.allList.add(listForm);
             }

}
