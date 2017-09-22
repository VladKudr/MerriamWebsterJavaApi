package org.merriam_api.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"org.merriam_api.db"})
public class DbConfiguration {


    @Bean(name = "MySQL_bean")
    public DataSource dataSourceMySQL(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/words");
        driverManagerDataSource.setUsername("SimpleUser");
        driverManagerDataSource.setPassword("SimpleUser01");

        return driverManagerDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(@Qualifier("MySQL_bean") DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }





}
