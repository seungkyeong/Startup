package com.nakwon.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.nakwon.domain.ReservationVO;
import com.nakwon.persistence.ReservationDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class ReservationDAOTest {
	@Inject
	private ReservationDAO dao;
	
	@Test
	public void insertReservation() throws Exception {
		ReservationVO vo = new ReservationVO();
		vo.setPhone("01012345678");
		vo.setName("���°�");
		vo.setEmail("skyeong1003@naver.com");
		vo.setPnum(1);
		vo.setMessage("�ȳ�ȳ�ȳ�");
		
		dao.insertReservation(vo);
	}
}
