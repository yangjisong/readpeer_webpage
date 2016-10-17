package com.sesame.readpeer.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.sesame.readpeer.model.Person;

//@Repository
public class PersonDAOImpl extends JdbcDaoSupport implements PersonDAO{ // extends JdbcDaoSupport

//	   @Autowired
//	   DataSource dataSource;
//	
//
//	   JdbcTemplate getJdbcTemplates(){
//		   return new JdbcTemplate(dataSource);
//	   }
//	
	@Autowired
	PersonDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}
	
//      private JdbcTemplate getJdbcTemplate() {  
//        return jdbcTemplate;  
//     }  
//      //注入  
//     public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
//        this.jdbcTemplate = jdbcTemplate;  
//     }  
     

	   public void create(String name, Integer age) {
		      String SQL = "insert into Person (name, age) values (?, ?)";
		      
		      getJdbcTemplate().update( SQL, name, age);
		      System.out.println("Created Record Name = " + name + " Age = " + age);
		      return;
		}
	   
	   public Person getPerson(Integer id) {
		      String SQL = "select * from Person where id = ?";
		      Person person = (Person)getJdbcTemplate().queryForObject(SQL,
		                        new Object[]{id}, new BeanPropertyRowMapper(Person.class));
		      System.out.println(person.toString());
		      return person;
		}

		public List<Person> listPersons() {
		      String SQL = "select * from Person";
		      List <Person> persons = getJdbcTemplate().queryForList(SQL,Person.class);
		      return persons;
		}

		public void delete(Integer id){
		      String SQL = "delete from Person where id = ?";
		      getJdbcTemplate().update(SQL, id);
		      System.out.println("Deleted Record with ID = " + id );
		      return;
		}

		public void update(Integer id,String name, Integer age){
		      String SQL = "update Person set age = ?,name=? where id = ?";
		      getJdbcTemplate().update(SQL, age,name, id);
		      System.out.println("Updated Record with ID = " + id );
		      return;
		}
		
	     class PersonRowMapper<T> implements RowMapper{  
	         public Object mapRow(ResultSet rs,int index) throws SQLException        {  
	             Person user = new Person();  
	             System.out.println(rs.getInt("id")+"|"+rs.getString("name")+"|"+rs.getInt("age"));
	             user.setId(rs.getInt("id"));  
	             user.setName(rs.getString("name"));  
	             user.setAge(rs.getInt("age"));
	             return user;  
	         }  
	     }

}
