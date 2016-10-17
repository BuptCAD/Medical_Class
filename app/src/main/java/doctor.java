/**
 * Created by caosh on 2016/10/16.
 */

public class doctor {
    private String doctorId; //主键（string类型）
    private String outpatientId; //:门诊表主键（外键）
    private String doctorName; //:医生姓名
    private String picHead;//医生头像路径
    private String position;  //:医生职称
    private String special;  //:医生特长
    private String section;  //:所属科室
    private String doctorIntro;//:医生简介
    private int flag;  //:是否为特需医生（1为特需医生，2为普通医生）
    private String sex;   //:性别
    private String graduInstitution;//:毕业院校
    private String tutorQualification;//:导师资格
    private String degree;  //:学位
    private String margor;  //:专业
    private String partTimeAcademic; //：兼职学术
    private String certificateHold; //:所持资格证
    private boolean isFamilyDoc;//：是否为家庭医生
    private String telephone; //:联系电话
    private int relNubCount; //：放号数量

    public String getOutpatientId() {
        return outpatientId;
    }

    public void setOutpatientId(String outpatientId) {
        this.outpatientId = outpatientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPicHead() {
        return picHead;
    }

    public void setPicHead(String picHead) {
        this.picHead = picHead;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getDoctorIntro() {
        return doctorIntro;
    }

    public void setDoctorIntro(String doctorIntro) {
        this.doctorIntro = doctorIntro;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGraduInstitution() {
        return graduInstitution;
    }

    public void setGraduInstitution(String graduInstitution) {
        this.graduInstitution = graduInstitution;
    }

    public String getTutorQualification() {
        return tutorQualification;
    }

    public void setTutorQualification(String tutorQualification) {
        this.tutorQualification = tutorQualification;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMargor() {
        return margor;
    }

    public void setMargor(String margor) {
        this.margor = margor;
    }

    public String getPartTimeAcademic() {
        return partTimeAcademic;
    }

    public void setPartTimeAcademic(String partTimeAcademic) {
        this.partTimeAcademic = partTimeAcademic;
    }

    public String getCertificateHold() {
        return certificateHold;
    }

    public void setCertificateHold(String certificateHold) {
        this.certificateHold = certificateHold;
    }

    public boolean isFamilyDoc() {
        return isFamilyDoc;
    }

    public void setFamilyDoc(boolean familyDoc) {
        isFamilyDoc = familyDoc;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getRelNubCount() {
        return relNubCount;
    }

    public void setRelNubCount(int relNubCount) {
        this.relNubCount = relNubCount;
    }



}
