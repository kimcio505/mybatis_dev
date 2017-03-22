package kr.or.dgit.mybatis_dev.services;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.mybatis_dev.dao.UserPicMapper;
import kr.or.dgit.mybatis_dev.dao.UserPicMapperImpl;
import kr.or.dgit.mybatis_dev.dto.UserPic;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class UserPicService {
	private static final Logger logger = Logger.getLogger(UserPicService.class);
	private static final UserPicService instance = new UserPicService();

	public UserPicService() {
	}

	public static UserPicService getInstance() {
		return instance;
	}

	public UserPic findUserPicById(int id) {
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		try{
			UserPicMapper userPicMapper = sqlSession.getMapper(UserPicMapper.class);
			return userPicMapper.selectUserPicById(id);
		} finally{
			
			sqlSession.close();
		}
	}
	

	public int insertUserPic(UserPic userPic) {
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		try{
			UserPicMapper userPicMapper = sqlSession.getMapper(UserPicMapper.class);
			int res = userPicMapper.insertUserPic(userPic);
			sqlSession.commit();
			return res;
		} catch(Exception e){
			sqlSession.rollback();
			e.printStackTrace();
			throw new RuntimeException(e.getCause());
		} finally {
			sqlSession.close();
		}
		
		
	}
}
			