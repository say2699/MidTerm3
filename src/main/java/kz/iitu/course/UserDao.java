package kz.iitu.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public void getDevById(Long id) {
        jdbcTemplate.query("select * from dev", new UserMapper());
    }
}
