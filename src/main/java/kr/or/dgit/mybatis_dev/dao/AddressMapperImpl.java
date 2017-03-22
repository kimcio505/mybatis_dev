package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Address;

public class AddressMapperImpl implements AddressMapper {
	private String namespace = "kr.or.dgit.mybatis_dev.dao.AddressMapper";
	private static final Log log = LogFactory.getLog(AddressMapperImpl.class);
	private SqlSession sqlSession;

	public AddressMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public Address selectAddressByAddrIdAndState(String state, String zip) {
		log.debug("selectAddressByAddrIdAndState()");
		return sqlSession.getMapper(AddressMapper.class).selectAddressByAddrIdAndState(state, zip);
	}

	@Override
	public Address selectAddressByAddrIdAndStateForMap(Map<String, Object> param) {
		log.debug("selectAddressByAddrIdAndStateForMap()");
		return sqlSession.selectOne(namespace+".selectAddressByAddrIdAndStateForMap",param);
	}
	@Override
	public List<Address> findAllAddressLimit(RowBounds rowBound) {
		log.debug("findAllAddressLimit()");
		return sqlSession.selectList(namespace+".findAllAddressLimit",null,rowBound);
	}

}












