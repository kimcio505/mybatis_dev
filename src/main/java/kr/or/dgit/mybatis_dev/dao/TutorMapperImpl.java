package kr.or.dgit.mybatis_dev.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class TutorMapperImpl implements TutorMapper {
	private String namespace = "kr.or.dgit.mybatis_dev.dao.TutorMapper";
	private static final Log log = LogFactory.getLog(CourseMapperImpl.class);
	private SqlSession sqlSession;

	@Override
	public Tutor findTutorById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertSetTutor(Tutor tutor) {
		log.debug("insertTutor()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			int res = sqlSession.getMapper(TutorMapper.class).insertSetTutor(tutor);
			sqlSession.commit();
			return res;
		}

	}
}
