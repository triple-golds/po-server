package cn.com.boe.b5.fwp.poserver.model;

import javax.persistence.*;

@Entity
public class TradeUnionPropagate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //宣传活动名称
    private String name;
    //宣传日期
    private String date;
    //企业文化\生产经营
    private String type;
    //宣传方式
    private String method;
    //宣传人
    private String people;
    //活动概述
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
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
