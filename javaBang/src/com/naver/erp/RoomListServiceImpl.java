package com.naver.erp;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoomListServiceImpl implements RoomListService{
	
	@Autowired
	private RoomListDAO roomListDAO;
	public RoomListDTO getRoomListDTO(int sr_no){
		System.out.println("서비스");
		RoomListDTO roomList=this.roomListDAO.getRoomListDTO(sr_no);
		return roomList;
	}
	
	
}
