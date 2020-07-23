package cn.com.boe.b5.fwp.poserver.repository;

import cn.com.boe.b5.fwp.poserver.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

    public UserInfo findByUsername(String username);

    @Query("select u from UserInfo u where u.username = ?#{ principal?.username }")
    public UserInfo findByCurrentUser();
}
