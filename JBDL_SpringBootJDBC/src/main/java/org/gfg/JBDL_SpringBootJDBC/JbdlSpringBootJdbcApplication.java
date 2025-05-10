package org.gfg.JBDL_SpringBootJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JbdlSpringBootJdbcApplication implements CommandLineRunner {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(JbdlSpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	int row =	jdbcTemplate.update("insert into student (id, name, email) values (?,?,?)",7,"kajal","kajal@gmail.com");
		System.out.println(row);
	}
}
