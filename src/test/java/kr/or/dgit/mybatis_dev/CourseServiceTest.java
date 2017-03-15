package kr.or.dgit.mybatis_dev;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.services.CourseService;

public class CourseServiceTest {
	private static CourseService courseService;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		courseService = new CourseService();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		courseService = null;
	}

/*	@Test
	public void aTestSearchCourse() {
		Map<String, Object> param = new HashMap<>();
		param.put("tutorId", 1);
		param.put("courseName", "%java%");
		param.put("startDate", "2013-01-01");
		param.put("endDate", "2013-05-01");
		List<Course> searchCourse = courseService.searchCourse(param);
		Assert.assertNotNull(searchCourse);
	}
	@Test
	public void bTestSearchChooseCourse(){
		Map<String, Object> param = new HashMap<>();
		param.put("searchBy", "Tutor");
		param.put("tutorId", 1);
		
		List<Course> courses = courseService.searchchooseCourses(param);
		System.out.println("testSearchChooseCourses()"+ param);
		
		param.replace("searchBy", "CourseName");
		param.remove("tutorId");
		param.put("courseName", "%java%");
		courses = courseService.searchchooseCourses(param);
	}
	@Test
	public void cTestSearchWhereCourse(){
		Map<String, Object> param = new HashMap<String,Object>();
		
		List<Course> courses = courseService.searchWhereCouses(param);
		
		param.put("tutorId", 1);
		courses = courseService.searchWhereCouses(param);
		
		param.put("courseName", "%java%");
		courses = courseService.searchWhereCouses(param);
		
		param.clear();
		param.put("endDate", new Date());
		courses = courseService.searchWhereCouses(param);
	}
	@Test
	public void dTestSearchTrimCourses(){
		Map<String, Object> param = new HashMap<>();
		List<Course> courses = courseService.searchTrimCourses(param);
		
		param.put("tutorId", 1);
		courses = courseService.searchTrimCourses(param);
		
		param.put("courseName", "%java%");
		courses = courseService.searchTrimCourses(param);
		
	}
	@Test
	public void dTestsearchForeachCourseByTutors(){
		Map<String, Object> param = null;
		List<Course> courses = courseService.searchForeachCourseByTutors(param);
		
		List<Integer> tutorIds = new ArrayList<>();
		tutorIds.add(1);
		
		
		param = new HashMap<String, Object>();
		param.put("tutorIds", tutorIds);
		
		courses = courseService.searchForeachCourseByTutors(param);
		
		tutorIds.add(2);
		courses = courseService.searchForeachCourseByTutors(param);

		Assert.assertNotNull(courses);
		
	}*/
}














