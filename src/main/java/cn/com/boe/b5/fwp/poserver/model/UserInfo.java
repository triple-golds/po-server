package cn.com.boe.b5.fwp.poserver.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(name="uk_username", columnNames = "username")})
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40)
    private String username;

    @ManyToMany
    private List<TradeUnionTeam> tradeUnionTeam;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<TradeUnionTeam> getTradeUnionTeam() {
        return tradeUnionTeam;
    }

    public void setTradeUnionTeam(List<TradeUnionTeam> team) {
        this.tradeUnionTeam = team;
    }
}
