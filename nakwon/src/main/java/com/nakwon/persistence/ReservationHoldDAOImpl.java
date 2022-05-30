package com.nakwon.persistence;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.nakwon.domain.Criteria;
import com.nakwon.domain.ReservationVO;

@Repository
public class ReservationHoldDAOImpl implements ReservationHoldDAO{
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.nakwon.mapper.ReservationHoldMapper";
	
	//���� ���
	@Override
	public void insertReservationHold(ReservationVO vo) throws Exception { 
		sqlSession.insert(namespace+".insertReservationHold", vo);
	}
	
	//���� ���� ����Ʈ
	@Override
	public List<ReservationVO> rsrvHoldListAll()throws Exception {
		return sqlSession.selectList(namespace+".rsrvHoldListAll");
	}
	
	//���� ���� ����Ʈ ����
	@Override
	public int listCountPaging(Criteria cri) throws Exception {
		return sqlSession.selectOne(namespace+".listCountPaging", cri);
	}

	@Override
	public List<ReservationVO> listCriteria(Criteria cri)throws Exception {
		return sqlSession.selectList(namespace+".listCriteria", cri);
	}
}