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
	/**로케이션 데이터 리스트*/
	public List<LocationInfo> getLocationDataList(String areaName) {	
		System.out.println(areaName);
		return sqlSession.selectList("Mapper.getLocationInfo", areaName);
	}

	/**로케이션 데이터 맵*/
	public Map<String, LocationInfo> getLocationDataMap(String areaName) {
		return sqlSession.selectMap("Mapper.getLocationInfo", areaName, "locationName");
	}

	/**비콘 지역정보*/
	public Beacon getBeaconRegion(Beacon beacon) {
		return sqlSession.selectOne("Mapper.getBeaconInfo", beacon);
	}
	
}
