package com.spring.jdbc;

import java.util.List;
import java.util.function.IntConsumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.jdbc.dao.StudentDao;
/**
 * Hello world!
 *
 */
public class App 
{   
	static ApplicationContext con ; 
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        con = new ClassPathXmlApplicationContext("com/spring/jdbc/awconfig.xml");
       //JdbcTemplate template = con.getBean("jdbctemplate",JdbcTemplate.class);
        
          StudentDao studentdao = con.getBean("impl",StudentDao.class);
        
        
//        String query = "insert into st_info(id,name,city) values(?,?,?) " ; 
//       
//        int result = template.update(query,151,"Sanidhya","Delhi");
        
//         Student st = new Student();
//         st.setId(153);
//         st.setName("Ramesh");
//         st.setCity("Punjab");
//         
//         int result = studentdao.insert(st);
          
//          Student st = new Student();
//          st.setId(152);
//          st.setName("Rohit");
//          st.setCity("Harayana");
//         
//          int result = studentdao.change(st) ;
//          Student st = new Student();
//          st.setId(152);
//          int result = studentdao.delete(st);
//          System.out.println(result);
          
          // call  one row
//           
          
          // get all info 
          List<Student> list = studentdao.getList();
          for(Student l : list)
        	  System.out.println(l);
        	  
         // to update  
         
    }
}
