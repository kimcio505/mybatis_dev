package kr.or.dgit.mybatis_dev;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.dto.Gender;
import kr.or.dgit.mybatis_dev.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.services.TutorService;

public class TutorServiceTest {
	private static TutorService tutorService;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		tutorService = TutorService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		tutorService = null;
	}

/*	@Test
	public void testFindTutorById() {
		Tutor tutor = tutorService.findTutorById(1);
		Assert.assertNotNull(tutor);
		System.out.println("testFindTutorById()"+ tutor);
		List<Course> courses = tutor.getCourses();
		Assert.assertNotNull(courses);
		for(Course course : courses){
			Assert.assertNotNull(course);
			System.out.println(course);
		}
	}
	@Test
	   public void testinsertSetTutor(){
	      Tutor tutor = new Tutor(8, "설동훈", "sdh@test.co.kr",Gender.FEMALE, new PhoneNumber("010-0000-0000"));
	      int res =tutorService.insertSetTutor(tutor);
	   }
*/
}
