package kr.or.dgit.mybatis_dev;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Address;
import kr.or.dgit.mybatis_dev.services.AddressService;

public class AddressServiceTest {
	private static AddressService addressService;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		addressService = AddressService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		addressService = null;
	}

	/*@Test
	public void aTestSelectAddressByAddIdAndState() {
		Address address = addressService.selectAddressByAddrIdAndState("CA","92110");
		Assert.assertNotNull(address);
	}
	@Test
	   public void aTestselectAddressByAddrIdAndStateForMap(){
	     Map<String,Object> param = new HashMap<>();
	     param.put("state", "CA");
	     param.put("zip", "92110");
	     
	     Address address = addressService.selectAddressByAddrIdAndStateForMap(param);
	     Assert.assertNotNull(address);
	      
	   }*/
	@Test
	public void aTestSelectAddressByAll(){
		RowBounds rowbounds = new RowBounds(0, 3);
		
		List<Address> list = addressService.findAllAddressLimit(rowbounds);
		Assert.assertNotNull(list);
		
		/*for(Address add : list){
			System.out.println(add);
		}*/
	}
}












