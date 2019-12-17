package com.naver.erp;

import java.util.*;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoomListDAOImpl implements RoomListDAO{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private RoomListDTO roomListDTO;
	public RoomListDTO getRoomListDTO(int sr_no){

		System.out.println("dao");
		RoomListDTO roomList=this.sqlSession.selectOne(
				
				"com.naver.erp.RoomListDAO.getRoomList"
				,sr_no
				);
		
		return roomList;
	}	
	

}
