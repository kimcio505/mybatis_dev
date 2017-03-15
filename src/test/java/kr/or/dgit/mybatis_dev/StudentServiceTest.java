package kr.or.dgit.mybatis_dev;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.services.StudentService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentServiceTest {
	private static StudentService studentService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
		studentService = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
		studentService = null;
	}

	@Before
	public void setUp() {
		System.out.println("setUp");
	}

	@After
	public void tearDown() {
		System.out.println("tearDown()");
	}
/*
	@Test
	public void aTestselectStudentByNoForResultMap() {
		Student student = new Student();
		student.setStudId(1);
		Student selectStudent = studentService.selectStudentByNoForResultMap(student);
		Assert.assertNotNull(selectStudent);
	}

	@Test
	public void bTestselectStudentByAllForResultMap() {
		List<Student> lists = studentService.selectStudentByAllForResultMap();
		List<Student> emptyLists = Collections.emptyList();
		Assert.assertNotEquals(emptyLists, lists);
	}

	@Test
	public void cTestselectStudentByNoForHashMap() {
		Student student = new Student();
		student.setStudId(1);
		Map<String, Object> selectStudent = studentService.selectStudentByNoForHashMap(student);
		for (Entry<String, Object> e : selectStudent.entrySet()) {
			System.out.printf("key : %s -> value : %s %n", e.getKey(), e.getValue());
		}
		Assert.assertNotNull(selectStudent);
	}

	@Test
	public void dTestselectStudentByAllForHashMap() {
		List<Map<String, Object>> lists = studentService.selectStudentByAllForHashMap();
		List<Map<String, Object>> emptyLists = Collections.emptyList();
		for (Map<String, Object> map : lists) {
			for (Entry<String, Object> e : map.entrySet()) {
				System.out.printf("key : %s -> value : %s %n", e.getKey(), e.getValue());
			}
		}
		Assert.assertNotEquals(emptyLists, lists);
	}

	@Test
	public void eTestSelectStudentByNoWithAddress() {
		Student student = new Student();
		student.setStudId(1);

		Student student11 = studentService.selectStudentByNoWithAddress(student);
		Assert.assertNotNull(student11);
	}

	@Test
	public void fSelectStudentByNoAssociationAddress() {
		Student student = new Student();
		student.setStudId(1);

		Student student1 = studentService.selectStudentByNoAssociationAddress(student);
		Assert.assertNotNull(student1);
	}*/
	@Test
	public void gTestUpdateSetStudent(){
		Student student = new Student();
		student.setStudId(1);
		student.setEmail("test@test.co.kr");
		student.setPhone(new PhoneNumber("123-2144-1241"));
		student.setDob(new Date());
		
		int result = studentService.updateSetStudent(student);
		System.out.printf("testUpdateStudent %s : result %d%n", student, result);
		Assert.assertSame(1, result);
		student.setEmail("timothy@gmail.com");
		student.setPhone(new PhoneNumber("123-4223-2311"));
		student.setDob(new GregorianCalendar(1988,04,25).getTime());
		
		result = studentService.updateSetStudent(student);
		System.out.printf("testUpdateStudent %s : result %d%n", student, result);
		Assert.assertSame(1, result);
		
	}
}
















