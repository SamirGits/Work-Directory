package com.cts.training.mavenweb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cts.training.mavenweb.entity.Users;

// @Component
@Repository
public class StudentDaoJdbcTemplateImpl implements IStudentDao {

	// has the dependency on DataSource
	// works on raw sql queries (templated)
	private JdbcTemplate jdbcTemplate;
	
	// SQL templates
	private final String SQL_FETCH_ALL = "select * from student";
	private final String SQL_FETCH_BY_ID = "select * from student where id=?";
	private final String SQL_INSERT = "insert into student(name,email) values(?, ?)";
	private final String SQL_UPDATE = "update student set name=?, email=? where id=?";
	private final String SQL_DELETE = "delete from student where id=?";
	
	// custom row mapper class
	// we can define custom logic to map ResultSet data into Student object
	class StudentRowMapper implements RowMapper<Users>{

		// walk through function, will be called for all records
		// ResultSet rs : will be an active ResultSet
		// rowNum : Record number
		@Override
		public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Users users = new Users();
			
			// mapping
			users.setId(rs.getInt("id"));
			users.setName(rs.getString("name").toUpperCase());
			users.setEmail(rs.getString("email"));
			
			return users;
		}
		
	}
	
	@Autowired
	public StudentDaoJdbcTemplateImpl(DataSource dataSource) {
		// TODO Auto-generated constructor stub
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		// this.jdbcTemplate.query(<raw query>, <mapper>);
		// raw query : will be used to retrieve ReusltSet
		// mapper  : will be used to map it into List<Student>
		// BeanPropertyRowMapper : converts each record from ResultSet into Student object
		// and assembles them as a collection
		List<Users> users = this.jdbcTemplate.query(this.SQL_FETCH_ALL,
														 new StudentRowMapper());				
														 // new BeanPropertyRowMapper<Student>(Student.class));
		
		return users;
	}

	@Override
	public Users findById(Integer id) {
		// TODO Auto-generated method stub
		Users users =  this.jdbcTemplate.queryForObject(this.SQL_FETCH_BY_ID,
										 new Object[] {id}, // place holder values
										 new BeanPropertyRowMapper<Users>(Users.class));
		System.out.println(users);
		return users;
	}

	@Override
	public boolean add(Users users) {
		// TODO Auto-generated method stub
		int n = this.jdbcTemplate.update(this.SQL_INSERT, new Object[] {users.getName(), users.getEmail()});
		// n : number of rows affected
		if(n>0)
			return true;
		return false;
	}

	@Override
	public boolean update(Users users) {
		// TODO Auto-generated method stub
		int n = this.jdbcTemplate.update(this.SQL_UPDATE, new Object[] {users.getName(), users.getEmail(), users.getId()});
		// n : number of rows affected
		if(n>0)
			return true;
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		int n = this.jdbcTemplate.update(this.SQL_DELETE, new Object[] {id});
		// n : number of rows affected
		if(n>0)
			return true;
		return false;
	}

}































