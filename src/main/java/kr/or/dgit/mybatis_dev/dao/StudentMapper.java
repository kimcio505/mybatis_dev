package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

import kr.or.dgit.mybatis_dev.dto.Student;

public interface StudentMapper {
	Student selectStudentByNoForResultMap(Student student);

	List<Student> selectStudentByAllForResultMap();

	Student selectStudentByNoForHashMap(Student student);

	List<Map<String, Object>> selectStudentByAllForHashMap();

	Student selectStudentByNoWithAddress(Student student);
	
	Student selectStudentByNoAssociationAddress(Student student);

	int updateSetStudent(Student student);
	int insertSetStudent(Student student);
	int deleteSetStudent(Student student);
	
	
	
}
