package kz.iitu.course;
import org.springframework.context.annotation.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.List;


@Configuration
@ComponentScan("kz.iitu.course")
@PropertySource("application.properties")

public class Conf {
    List<Composite> children = Arrays.asList(new WareHouse());
    WareHouse warehouse = WareHouse.getInstance();
    @Bean
    public User user(){
        User user1 = new User();
        user1.setName("Dave");
        return user1;
    }
    @Bean
    public User user2(){
        User user2 = new User();
        user2.setName("Bob");
        return user2;
    }
    @Bean
    public ProductBuilder product1() {
        ProductBuilder productbuilder = new ProductBuilder();
        productbuilder.reset();
        productbuilder.setID(1);
        productbuilder.setName("Retro");
        productbuilder.setPrice(27);
        productbuilder.setAmount(0);

        return productbuilder;
    }
    @Bean
     public ProductBuilder product2() {
        ProductBuilder productbuilder = new ProductBuilder();
        productbuilder.reset();
        productbuilder.setID(2);
        productbuilder.setName("Falcon");
        productbuilder.setPrice(20);
        productbuilder.setAmount(3);

        return productbuilder;
    }

    @Bean
     public Brands brand1() {
        Brands brands = new Brands;
        brands.setId(1);
        brands.setName("Shoes");
        brands.setPop(20);
        return brands;
    }

    @Bean
    public Brands brand1() {
        Brands brands = new Brands;
        brands.setId(2);
        brands.setName("Adidas");
        brands.setPop(30);
        return brands;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/user?useUnicode=true&serverTimezone=UTC&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());

        return jdbcTemplate;
    }

}
