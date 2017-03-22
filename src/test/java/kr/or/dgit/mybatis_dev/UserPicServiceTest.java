package kr.or.dgit.mybatis_dev;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.ibatis.session.SqlSession;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.UserPic;
import kr.or.dgit.mybatis_dev.services.UserPicService;


public class UserPicServiceTest {
	private static UserPicService userPicService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		userPicService = new UserPicService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		userPicService = null;
	}
	/*@Test
	public void TestInsertUserPic(){
		byte[] pic = null;
		File file = new File(System.getProperty("user.dir") + "\\DataFiles\\common66N6NGYD.jpg");
		
		try {
			InputStream is = new FileInputStream(file);
			pic = new byte[is.available()];
			is.read(pic);
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		UserPic userPic= new UserPic();
		userPic.setName("Park Bo Young");
		userPic.setBio("put some lengthy bio here");
		userPic.setPic(pic);
		
		int result = userPicService.insertUserPic(userPic);
		Assert.assertSame(1, result);
	}
	@Test
	public void TestFindUserPic(){
		UserPic userPic = userPicService.findUserPicById(1);
		Assert.assertNotNull(userPic);
		byte[] pic = userPic.getPic();
		try{
			File file = new File(System.getProperty("user.dir")+"\\Datafiles\\common66N6NGYD.jpg");
			OutputStream os = new FileOutputStream(file);
			os.write(pic);
			os.close();
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();			                     
		}
		System.out.println("testFindUserPic " + userPic);
	}*/
	
	
}
