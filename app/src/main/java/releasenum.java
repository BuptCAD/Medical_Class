/**
 * Created by caosh on 2016/10/16.
 */

public class releasenum {
    private String id;//:主键
    private String doctorId;//:医生主键（外键）
    private String date; //：放号日期????date?? string??
    private String remark;//:备注
    private boolean isSuccess;//:是否被成功预约

    public boolean isFamilyNum() {
        return isFamilyNum;
    }

    public void setFamilyNum(boolean familyNum) {
        isFamilyNum = familyNum;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    private boolean isFamilyNum;//:放号类型（是否是家庭医生号）
}
