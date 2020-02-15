package com.cts.training.mavenweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cts.training.mavenweb.dao.IStudentDao;
import com.cts.training.mavenweb.entity.Users;

// @Component
@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	@Qualifier("studentDaoHibernateImpl")
	// @Qualifier("studentDaoJdbcTemplateImpl")
	private IStudentDao studentDao;
	
	@Override
	public List<Users> findAllStudents() {
		// add additional logic
		return this.studentDao.findAll();
	}

	@Override
	public Users findStudentById(Integer id) {
		// TODO Auto-generated method stub
		return this.studentDao.findById(id);
	}

	@Override
	public boolean addStudent(Users users) {
		// TODO Auto-generated method stub
		return this.studentDao.add(users);
	}

	@Override
	public boolean updateStudent(Users users) {
		// TODO Auto-generated method stub
		return this.studentDao.update(users);
	}

	@Override
	public boolean deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		return this.studentDao.delete(id);
	}

}
