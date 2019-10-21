package cn.test.springboot_jdbc;

import cn.test.springboot_jdbc.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJdbcApplicationTests {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
//        Connection connection = dataSource.getConnection();
//        System.out.println("当前使用的连接池:"+connection.getClass());
//        jdbcTemplate.update("insert into student values(null,?,?)","赵六",12);
//        Long count = jdbcTemplate.queryForObject("select count(*) from student", Long.class);
//        System.out.println(count);
        List<Student> studentList = jdbcTemplate.query("select * from student", new BeanPropertyRowMapper<Student>(Student.class));
        System.out.println(studentList);
        System.out.println("a second test for git");

    }

}
