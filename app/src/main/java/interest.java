/**
 * Created by caosh on 2016/10/16.
 */

public class interest {
    private String id;//:主键
    private String customerId;//：客户Id（外键）
    private String doctorId;//:关注医生ID（外键）
    private String hosId;//:关注医院ID（外键）
    private int type;//:关注类型（1是关注医院，2是关注医生）

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getHosId() {
        return hosId;
    }

    public void setHosId(String hosId) {
        this.hosId = hosId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private String date;//:关注时间
}
