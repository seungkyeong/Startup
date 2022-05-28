package com.nakwon.persistence;

import java.util.List;

import com.nakwon.domain.ReservationVO;

public interface ReservationHoldDAO {
	public void insertReservationHold(ReservationVO vo)  throws Exception; //���� ���
	
	public List<ReservationVO> rsrvHoldListAll() throws Exception; //���� ����Ʈ ��������
	
	public int listCountPaging(com.nakwon.domain.Criteria cri) throws Exception;
	
	public List<ReservationVO> listCriteria(com.nakwon.domain.Criteria cri) throws Exception;
	
}
