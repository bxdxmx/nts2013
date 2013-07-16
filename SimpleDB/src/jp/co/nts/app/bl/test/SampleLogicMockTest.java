package jp.co.nts.app.bl.test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.nts.app.bl.SampleLogic;
import jp.co.nts.app.dao.SampleDAO;
import mockit.Deencapsulation;
import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.Tested;

import org.junit.Before;
import org.junit.Test;

public class SampleLogicMockTest {
//	@Mocked
//	SampleDAO dao;

	@Tested
	SampleLogic sl = new SampleLogic();

	@Before
	public void setUp() { 
//		Deencapsulation.setField(sl, dao);
	}
	
	@Test
	public void test() throws SQLException {
		final List<String> mockList = new ArrayList<String>();
		mockList.add("a");
		mockList.add("b");
		mockList.add("c");

		new NonStrictExpectations() {
			SampleDAO dao;
			{
//				setField(sl, dao);
				dao.getSampleDatas();
				result = mockList;
			}
		};
		
		
		List<String> list = sl.getMappedDatas();
		assertThat(list.size(), is(3));
	}

}
