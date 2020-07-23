package cn.com.boe.b5.fwp.poserver.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class TradeUnionSympathy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //员工编号
    private String code;
    //姓名
    private String name;
    //性别
    private String sex;
    //年龄
    private String age;
    //科室岗位
    private String department;
    //生病日期
    private Date illDate;
    //病症名称
    private String illName;
    //发病原因
    private String illCause;
    //是否住院
    private String hospital;
    //联系方式
    private String phone;
    //慰问时间
    private Date sympathyDate;
    //慰问人
    private String sympathyPeople;
    //花费费用
    private String cost;
    //备注
    private String remark;
    //所属工会小组
    @ManyToOne
    private TradeUnionTeam team;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getIllDate() {
        return illDate;
    }

    public void setIllDate(Date illDate) {
        this.illDate = illDate;
    }

    public String getIllName() {
        return illName;
    }

    public void setIllName(String illName) {
        this.illName = illName;
    }

    public String getIllCause() {
        return illCause;
    }

    public void setIllCause(String illCause) {
        this.illCause = illCause;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getSympathyDate() {
        return sympathyDate;
    }

    public void setSympathyDate(Date sympathyDate) {
        this.sympathyDate = sympathyDate;
    }

    public String getSympathyPeople() {
        return sympathyPeople;
    }

    public void setSympathyPeople(String sympathyPeople) {
        this.sympathyPeople = sympathyPeople;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public TradeUnionTeam getTeam() {
        return team;
    }

    public void setTeam(TradeUnionTeam team) {
        this.team = team;
    }
}
