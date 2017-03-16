package kr.or.dgit.mybatis_dev.services;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.mybatis_dev.dao.TutorMapper;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class TutorService {
	private static final Logger logger = Logger.getLogger(TutorService.class);
	private static final TutorService instance = new TutorService();

	public static TutorService getInstance() {
		return instance;
	}

	public TutorService() {
	}

	public Tutor findTutorById(int id) {
		logger.debug("findTutorById()");
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		try {
			TutorMapper tutorMapper = sqlSession.getMapper(TutorMapper.class);
			return tutorMapper.findTutorById(id);
		} finally {
			sqlSession.close();
		}
	}

	public int insertSetTutor(Tutor tutor) {
		logger.debug("insertTutor()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			int res = sqlSession.getMapper(TutorMapper.class).insertSetTutor(tutor);
			sqlSession.commit();
			return res;
		}
	}
}
