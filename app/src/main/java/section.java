/**
 * Created by caosh on 2016/10/16.
 */

public class section {
    private String sectionId;//:主键
    private String hostId;//:医院主键（外键）
    private String sectionCode;//：科室邮编
    private String sectionName;//：科室名称
    private String sectionLoc;//：科室位置
    private String sectionPic;//：科室图片

    public String getSectionIntro() {
        return sectionIntro;
    }

    public void setSectionIntro(String sectionIntro) {
        this.sectionIntro = sectionIntro;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public String getSectionCode() {
        return sectionCode;
    }

    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionLoc() {
        return sectionLoc;
    }

    public void setSectionLoc(String sectionLoc) {
        this.sectionLoc = sectionLoc;
    }

    public String getSectionPic() {
        return sectionPic;
    }

    public void setSectionPic(String sectionPic) {
        this.sectionPic = sectionPic;
    }

    private String sectionIntro;//：科室简介
}
