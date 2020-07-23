package cn.com.boe.b5.fwp.poserver.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(name="uk_team_name_sub_union", columnNames = {"teamName", "subUnion"})})
public class TradeUnionTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40)
    private String teamName;

    @Column(length = 40)
    private String subUnion;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<TradeUnionStaff> tradeUnionStaffs;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<TradeUnionFund> tradeUnionFunds;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<TradeUnionSympathy> tradeUnionSympathies;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<TradeUnionMarriage> tradeUnionMarriages;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<TradeUnionPropagate> tradeUnionPropagates;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getSubUnion() {
        return subUnion;
    }

    public void setSubUnion(String subUnion) {
        this.subUnion = subUnion;
    }
}
