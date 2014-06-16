package com.tenm.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.tenm.domain.Beacon;
import com.tenm.domain.LocationInfo;
import com.tenm.service.TourDao;

@Repository("tourDaoImpl")
public class TourDaoImpl implements TourDao {

	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
		
	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public TourDaoImpl() {
		System.out.println("========== TourDaoImpl Constructor ==========");
	}

	//Method
	/**�����̼� ������ ����Ʈ*/
	public List<LocationInfo> getLocationDataList(String areaName) {	
		return sqlSession.selectList("Mapper.getLocationInfo", areaName);
	}

	/**�����̼� ������ ��*/
	public Map<String, LocationInfo> getLocationDataMap(String areaName) {
		return sqlSession.selectMap("Mapper.getLocationInfo", "locationName");
	}

	/**���� ��������*/
	public Beacon getBeaconRegion(Beacon beacon) {
		return sqlSession.selectOne("Mapper.getBeaconInfo", beacon);
	}
	
}
