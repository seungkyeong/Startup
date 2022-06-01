package com.nakwon.persistence;

import java.util.Map;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.nakwon.domain.ReservationConfirmVO;

@Repository
public class ReservationConfirmDAOImpl implements ReservationConfirmDAO{
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.nakwon.mapper.ReservationConfirmMapper";
	
	
	@Override
	public ReservationConfirmVO userReservationCheck(Map<String,String> Check) throws Exception {
		return sqlSession.selectOne(namespace+".userReservationCheck", Check);
	}
}
