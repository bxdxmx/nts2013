package jp.co.nts.app;

import java.sql.SQLException;
import java.util.List;

import jp.co.nts.app.bl.SampleLogic;
import jp.co.nts.app.dao.SampleDAO;

public class SampleV2 {
	public static void main(String[] args) {
		SampleLogic sl = new SampleLogic();
		List<String> list =	sl.getMappedDatas();
		
		for( String str : list) {
			System.out.println(str);
		}
	}
}
