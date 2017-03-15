package kr.or.dgit.mybatis_dev.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.CourseMapper;
import kr.or.dgit.mybatis_dev.dao.CourseMapperImpl;
import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class CourseService {

	private static final CourseService instance = new CourseService();

	public static CourseService getInstance() {
		return instance;
	}

	public CourseService() {
	}

	public List<Course> searchCourse(Map<String, Object> param) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchCourse(param);
		}
	}

	public List<Course> searchchooseCourses(Map<String, Object> param) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchChooseCourse(param);
		}
	}

	public List<Course> searchWhereCouses(Map<String, Object> param) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchWhereCourse(param);
		}
	}

	public List<Course> searchTrimCourses(Map<String, Object> param) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchTrimCourses(param);
		}
	}

	public List<Course> searchForeachCourseByTutors(Map<String, Object> param) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchForeachCourseByTutors(param);
		}
	}
}













