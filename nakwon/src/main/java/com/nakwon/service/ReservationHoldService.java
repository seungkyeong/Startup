package com.nakwon.service;

import java.util.List;
import java.util.Map;
import com.nakwon.domain.Criteria;
import com.nakwon.domain.ReservationHoldVO;

public interface ReservationHoldService {
	public void insertReservationHold(ReservationHoldVO vo) throws Exception;
	
	public List<ReservationHoldVO> rsrvHoldListAll() throws Exception;
	
	public int listCountCriteria(Criteria cri) throws Exception;
	
	public List<ReservationHoldVO> listCriteria(Criteria cri) throws Exception;
	
	public ReservationHoldVO userReservationCheck(Map<String,String> Check) throws Exception;
	
	public void deleteReservationHold(Map<String,String> DeleteInfo) throws Exception;
	
	public void modifyReservationHold(ReservationHoldVO vo) throws Exception; //예약수정
	
	public ReservationHoldVO reservationRead(String RsrvCode) throws Exception; //관리자 예약 조회
}
