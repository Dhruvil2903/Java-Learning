package com.example.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public class StudentRepository {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void save(Student s) {

		String sql = "insert into student(rollNo, name, marks) values(?,?,?)";
		int rows = jdbcTemplate.update(sql, s.getRollNo(), s.getName(), s.getMarks());
		System.out.println(rows + "effected");
	}

	public List<Student> findAll() {
		String sql = "select * from student";

		return jdbcTemplate.query(sql, (rs, rowNum) -> {

			Student s = new Student();
			s.setRollNo(rs.getInt("rollNo"));
			s.setName(rs.getString("name"));
			s.setMarks(rs.getInt("marks"));
			return s;
		});

		
	}

}
