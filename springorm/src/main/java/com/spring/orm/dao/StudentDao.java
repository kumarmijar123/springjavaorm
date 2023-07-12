package com.spring.orm.dao;



import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;



public class StudentDao {

	private HibernateTemplate hibernateTemplate;
	
	//save student
	
    @Transactional
	public int insert(Student student)
	{
		//Insert
		Integer i =(Integer) this.hibernateTemplate.save(student);
		return i;
	}
    
    //get the single data(object)
    public Student getStudent(int studentId)
    {
    	Student student = this.hibernateTemplate.get(Student.class, studentId);
    	return student;
    }
    
    //get all student(all rows)
    public List<Student> getAllStudents()
    {
    	List<Student> students = this.hibernateTemplate.loadAll(Student.class);
    	return students;	
    }
    
    //Delete
    @Transactional
    public void deleteStudent(int studentId)
    {
    	Student student = this.hibernateTemplate.get(Student.class, studentId);
        this.hibernateTemplate.delete(student);  
    }
    
    //Update
    @Transactional
    public void updateStudent(Student student)
    {
    	this.hibernateTemplate.update(student);
    }
    
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
