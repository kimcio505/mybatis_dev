package kr.or.dgit.mybatis_dev.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.mybatis_dev.dao.AddressMapper;
import kr.or.dgit.mybatis_dev.dao.AddressMapperImpl;
import kr.or.dgit.mybatis_dev.dao.TutorMapper;
import kr.or.dgit.mybatis_dev.dto.Address;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class AddressService {
	private static final Logger logger = Logger.getLogger(AddressService.class);
	private static final AddressService instance = new AddressService();

	public Address selectAddressByAddrIdAndState(String state, String zip) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {

			AddressMapper addressMapper = new AddressMapperImpl(sqlSession);
			return addressMapper.selectAddressByAddrIdAndState(state, zip);
		}
	}

	public static AddressService getInstance() {
		return instance;
	}

	public Address selectAddressByAddrIdAndStateForMap(Map<String, Object> param) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			AddressMapper addressMapper = new AddressMapperImpl(sqlSession);
			return addressMapper.selectAddressByAddrIdAndStateForMap(param);
		}
	}
	public List<Address> findAllAddressLimit(RowBounds rowBound) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			AddressMapper addressMapper = new AddressMapperImpl(sqlSession);
			return addressMapper.findAllAddressLimit(rowBound);
		}
	}

	
}
