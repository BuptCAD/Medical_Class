/**
 * Created by caosh on 2016/10/16.
 */

public class hospital {
    private String hosId;//：主键
    private String hosName;//：名称
    private String hosGrade;//：等级
    private String hosAddr;//：位置
    private String hosTel;//：联系电话
    private String hosIntro;//：医院简介
    private String hosUrl;//：医院网址
    private String dean;//：院长
    private String deanIntro; //：院长简介
    private String hosTraffic;//：医院交通
    private String hosSpecial;//：特色科室

    public String getHosEstablished() {
        return hosEstablished;
    }

    public void setHosEstablished(String hosEstablished) {
        this.hosEstablished = hosEstablished;
    }

    public String getHosId() {
        return hosId;
    }

    public void setHosId(String hosId) {
        this.hosId = hosId;
    }

    public String getHosName() {
        return hosName;
    }

    public void setHosName(String hosName) {
        this.hosName = hosName;
    }

    public String getHosGrade() {
        return hosGrade;
    }

    public void setHosGrade(String hosGrade) {
        this.hosGrade = hosGrade;
    }

    public String getHosAddr() {
        return hosAddr;
    }

    public void setHosAddr(String hosAddr) {
        this.hosAddr = hosAddr;
    }

    public String getHosTel() {
        return hosTel;
    }

    public void setHosTel(String hosTel) {
        this.hosTel = hosTel;
    }

    public String getHosIntro() {
        return hosIntro;
    }

    public void setHosIntro(String hosIntro) {
        this.hosIntro = hosIntro;
    }

    public String getHosUrl() {
        return hosUrl;
    }

    public void setHosUrl(String hosUrl) {
        this.hosUrl = hosUrl;
    }

    public String getDean() {
        return dean;
    }

    public void setDean(String dean) {
        this.dean = dean;
    }

    public String getDeanIntro() {
        return deanIntro;
    }

    public void setDeanIntro(String deanIntro) {
        this.deanIntro = deanIntro;
    }

    public String getHosTraffic() {
        return hosTraffic;
    }

    public void setHosTraffic(String hosTraffic) {
        this.hosTraffic = hosTraffic;
    }

    public String getHosSpecial() {
        return hosSpecial;
    }

    public void setHosSpecial(String hosSpecial) {
        this.hosSpecial = hosSpecial;
    }

    private String hosEstablished;//：成立时间
}
