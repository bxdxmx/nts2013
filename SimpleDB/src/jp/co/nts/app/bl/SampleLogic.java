package jp.co.nts.app.bl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.nts.app.dao.SampleDAO;

public class SampleLogic {
	private SampleDAO dao;
	
	public SampleLogic() {
		dao = new SampleDAO();
	}
	
	public List<String> getMappedDatas() {
		try {
			List<String> mappedList = new ArrayList<>();
			List<String> list =	dao.getSampleDatas();
			
			for( String str : list) {
				mappedList.add("Hello, " + str);
			}
			
			return mappedList;
		} catch( SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
}
