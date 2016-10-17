/**
 * Created by caosh on 2016/10/16.
 */

public class outpatient {
    private String outpatientId;//：主键
    private String sectionId;//：科室主键（外键）
    private String outpatientName;//：门诊名称
    private String sectionName;//：科室名称
    private String outpatientLoc;//：门诊位置
    private int count;//：放号数量

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getOutpatientId() {
        return outpatientId;
    }

    public void setOutpatientId(String outpatientId) {
        this.outpatientId = outpatientId;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getOutpatientName() {
        return outpatientName;
    }

    public void setOutpatientName(String outpatientName) {
        this.outpatientName = outpatientName;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getOutpatientLoc() {
        return outpatientLoc;
    }

    public void setOutpatientLoc(String outpatientLoc) {
        this.outpatientLoc = outpatientLoc;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private String telephone;//:门诊联系电话（预约电话）
}
