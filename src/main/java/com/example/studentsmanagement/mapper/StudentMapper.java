package com.example.studentsmanagement.mapper;

import com.example.studentsmanagement.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Mapper
public interface StudentMapper {
    // select * from student where name Like %T%
    @Select("SELECT * FROM student where name LIKE #{name}")
    List<Student> getStudentsContainStrInName(@Param("name") String name);

    // SELECT * from student where university_class_id IN
    // (SELECT id FROM university_class where year = 2022 AND number = 1);
    @Select("SELECT * FROM student where university_class_id IN" +
    "(SELECT id FROM university_class where year = #{year} AND number = #{number})")
    List<Student> getStudentsInClass(@Param("year") int year, @Param("number") int number);
}
