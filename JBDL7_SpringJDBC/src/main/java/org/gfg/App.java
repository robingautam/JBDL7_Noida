package org.gfg;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App
{

    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        // Insert
      /* int row = jdbcTemplate.update("insert into student (id,name,email) values (1,'Robin','robin@gmail.com')");
        int row = jdbcTemplate.update("insert into student (id, name, email) values (?,?,?)",2,"Aakash","aakash@gmail.com");
        System.out.println("Rows Updated: "+row);*/


        // Read
      /* Student data = jdbcTemplate.queryForObject("select * from student where id = 1", new RowMapperImpl());

        System.out.println(data);*?


     */

        // Update
        /*int row = jdbcTemplate.update("update student set name=? where id=?","Preeti",2);
        System.out.println(row);*/

        // delete
        int row = jdbcTemplate.update("delete from student where id=2");
        System.out.println(row);
    }
}
