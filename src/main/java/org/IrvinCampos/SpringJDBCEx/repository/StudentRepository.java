package org.IrvinCampos.SpringJDBCEx.repository;

import org.IrvinCampos.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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

    public void save(Student student) {
        String sql = "Insert into Student (rollNo, name, marks) values(?,?,?)";
       int rows = jdbcTemplate.update(sql, student.getRollNo(), student.getName(), student.getMarks());
        System.out.println(rows+ " effected");
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        for (Student student: students) {
            System.out.println(student);
        }
        return students;

    }

}
