package jp.co.nts.app.bl.test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import java.util.List;

import javax.jws.soap.SOAPBinding;
import javax.xml.ws.ServiceMode;

import jp.co.nts.app.bl.SampleLogic;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleLogicTest {
	private SampleLogic sl;
	
	
	@Before
	public void setUp() { 
		sl = new SampleLogic();
	}
	
	@Test
	public void 素朴なDBアクセスを行うテスト() {
		/*
		 * テスト開始前にデータ削除して
		 * 必要なデータInsertして
		 * などの処理が必要になる。
		 */
		List<String> list =	sl.getMappedDatas();
		
		assertThat(list.size(), is(3));
		
		assertThat(list.get(0), is("Hello, Axel"));
		assertThat(list.get(1), is("Hello, Mr. Foo"));
		assertThat(list.get(2), is("Hello, Ms. Bar"));
	}
}
