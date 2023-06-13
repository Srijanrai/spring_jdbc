package com.spring.jdbc.dao;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import  com.spring.jdbc.Student;
public  class StudentDaoImpl implements StudentDao {

	public JdbcTemplate temp ; 
	
	public JdbcTemplate getTemp() {
		return temp;
	}

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}

	public int insert(Student student) {
		 String query = "insert into st_info(id,name,city) values(?,?,?) " ; 
		 int res = this.temp.update(query,student.getId(),student.getName(),student.getCity());
		 return res ;
	}

	public int change(Student st) {
		String query = "update st_info set name =? , city =?  where id =? "; 
		int res = this.temp.update(query,st.getName(),st.getCity(),st.getId());
		return res;
	}

	public int delete(Student st) {
		String query = "delete from st_info where id =?";
		int res  = temp.update(query,st.getId());
		return res;
	}

	public Student getInfo(int studentId) {
		String query = "select * from st_info where id =?"; 
		Student st = new Student ();
		RowMapper<Student> rowMapper = new  RowMapperImpl();
		st = temp.queryForObject(query, rowMapper,studentId);
		return st;
	}

	public List<Student> getList() {
		String query = "select * from st_info" ; 
		 List<Student> list = temp.query(query, new RowMapperImpl());
		return list ; 
	}
	

	
	

	
  
}
