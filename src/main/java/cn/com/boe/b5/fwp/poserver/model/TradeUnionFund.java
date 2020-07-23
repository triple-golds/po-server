package cn.com.boe.b5.fwp.poserver.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

//阳光基金
@Entity
public class TradeUnionFund {

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
    //个人月收入
    private String salary;
    //家庭人口数
    private String people;
    //入司日期
//    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date entryDate;
    //科室岗位
    private String department;
    //公司慰问次数
    private String sympathyTimes;
    //联系方式
    private String phone;
    //双职工配偶姓名
    private String coupleName;
    //配偶员工编号
    private String coupleCode;
    //出现困难主要原因
    private String reason;
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSympathyTimes() {
        return sympathyTimes;
    }

    public void setSympathyTimes(String sympathyTimes) {
        this.sympathyTimes = sympathyTimes;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCoupleName() {
        return coupleName;
    }

    public void setCoupleName(String coupleName) {
        this.coupleName = coupleName;
    }

    public String getCoupleCode() {
        return coupleCode;
    }

    public void setCoupleCode(String coupleCode) {
        this.coupleCode = coupleCode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public TradeUnionTeam getTeam() {
        return team;
    }

    public void setTeam(TradeUnionTeam team) {
        this.team = team;
    }
}
