package cn.com.boe.b5.fwp.poserver.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

//会员名册
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(name = "uk_code_team", columnNames = {"code", "team_id"})})
public class TradeUnionStaff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //员工编号
    @Column(length = 40, nullable = false)
    private String code;

    //姓名
    @Column(length = 100, nullable = false)
    private String name;

    //性别
    @Column(columnDefinition = "tinyint unsigned")
    private int sex;

    //民族
    @Column(columnDefinition = "tinyint unsigned")
    private int nation;

    //政治面貌
    @Column(columnDefinition = "tinyint unsigned")
    private int political;

    //出生日期
    @JsonFormat(timezone = "GMT+8")
    private Date birthDate;

    //婚否
    @Column(columnDefinition = "tinyint unsigned")
    private int isMarriage;

    //育否
    @Column(columnDefinition = "tinyint unsigned")
    private int isGiveBirth;

    //入司日期
    @JsonFormat(timezone = "GMT+8")
    private Date entryDate;

    //科室
    @Column(length = 100)
    private String department;

    //宿舍号码
    @Column(length = 100)
    private String dormitory;

    //爱好特长
    @Column(length = 100)
    private String hobby;

    //家庭住址
    @Column(length = 100)
    private String address;

    //联系方式
    @Column(length = 100)
    private String phone;

    //所属工会小组
    @ManyToOne(optional = false)
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getNation() {
        return nation;
    }

    public void setNation(int nation) {
        this.nation = nation;
    }

    public int getPolitical() {
        return political;
    }

    public void setPolitical(int political) {
        this.political = political;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getIsMarriage() {
        return isMarriage;
    }

    public void setIsMarriage(int isMarriage) {
        this.isMarriage = isMarriage;
    }

    public int getIsGiveBirth() {
        return isGiveBirth;
    }

    public void setIsGiveBirth(int isGiveBirth) {
        this.isGiveBirth = isGiveBirth;
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

    public String getDormitory() {
        return dormitory;
    }

    public void setDormitory(String dormitory) {
        this.dormitory = dormitory;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public TradeUnionTeam getTeam() {
        return team;
    }

    public void setTeam(TradeUnionTeam team) {
        this.team = team;
    }
}
