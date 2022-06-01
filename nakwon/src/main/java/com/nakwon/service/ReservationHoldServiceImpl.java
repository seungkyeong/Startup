package com.nakwon.service;

import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.nakwon.domain.Criteria;
import com.nakwon.domain.ReservationHoldVO;
import com.nakwon.persistence.ReservationHoldDAO;

@Service
public class ReservationHoldServiceImpl implements ReservationHoldService {
	@Inject
	ReservationHoldDAO dao;
	
	@Override
	public void insertReservationHold(ReservationHoldVO vo) throws Exception{
		dao.insertReservationHold(vo);
	}
	
	@Override
	public List<ReservationHoldVO> rsrvHoldListAll() throws Exception {
		return dao.rsrvHoldListAll();
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		return dao.listCountPaging(cri);
	}
	
	@Override
	public List<ReservationHoldVO> listCriteria(Criteria cri)throws Exception {
		return dao.listCriteria(cri);
	}
	
	@Override
	public ReservationHoldVO userReservationCheck(Map<String,String> Check) throws Exception{
		return dao.userReservationCheck(Check);
	}
}
