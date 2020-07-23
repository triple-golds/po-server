package cn.com.boe.b5.fwp.poserver.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class TradeUnionMarriage {
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
    //籍贯
    private String nativePlace;
    //配偶姓名
    private String coupleName;
    //是否是BOE员工
    private String boe;
    //结婚日期
    private Date marriageDate;
    //生育日期
    private Date reproductionDate;
    //联系方式
    private String phone;
    //生育慰问时间
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

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getCoupleName() {
        return coupleName;
    }

    public void setCoupleName(String coupleName) {
        this.coupleName = coupleName;
    }

    public String getBoe() {
        return boe;
    }

    public void setBoe(String boe) {
        this.boe = boe;
    }

    public Date getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(Date marriageDate) {
        this.marriageDate = marriageDate;
    }

    public Date getReproductionDate() {
        return reproductionDate;
    }

    public void setReproductionDate(Date reproductionDate) {
        this.reproductionDate = reproductionDate;
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
