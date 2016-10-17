package com.example.caosh.myapplication;

/**
 * Created by caosh on 2016/10/16.
 */

public class appointMem {
    private String id;//:主键（string类型）
    private String doctorId;//：医生主键（外键）
    private String customerId;//：客户主键（外键）
    private String realseId;//：放号主键（外键）
    private String idCard;//：客户身份证号
    private int type;//:预约类型（1：普通预约2：特需预约）
    private String sectionName;//：科室名称
    private String outpatientName;//：门诊名称
    private String appointDate;//:预约时间
    private double cost;//:
    private String doctorName;//:医生姓名
    private String telephone;//:门诊联系电话

    public String getSectionArea() {
        return sectionArea;
    }

    public void setSectionArea(String sectionArea) {
        this.sectionArea = sectionArea;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getRealseId() {
        return realseId;
    }

    public void setRealseId(String realseId) {
        this.realseId = realseId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getOutpatientName() {
        return outpatientName;
    }

    public void setOutpatientName(String outpatientName) {
        this.outpatientName = outpatientName;
    }

    public String getAppointDate() {
        return appointDate;
    }

    public void setAppointDate(String appointDate) {
        this.appointDate = appointDate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    private String sectionArea;//:科室所在位置（图片显示各科室下门诊的位置分布）
}
