package com.ms.Advertisement.Service;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import com.ms.domain.Advertisement;
@Service("advertisementServiceImp")
public class AdvertisementServiceImp implements AdvertisementService{
	/*@Resource(name="sqlSessionFactory")
	private SqlSessionFactory s;*/
	
	@Override
	public void add(Advertisement advertisement) {
		//SqlSession openSession = s.openSession();
		//openSession.insert("", advertisement);
	}

	@Override
	public void update(Advertisement advertisement) {
		//SqlSession openSession = s.openSession();
		//openSession.update("", advertisement);
	}

	@Override
	public void delete(Integer advertisementId) {
		//SqlSession openSession = s.openSession();
		//openSession.delete("", advertisementId);
	}

	@Override
	public void get(Advertisement advertisement) {
		//SqlSession openSession = s.openSession();
		//openSession.selectList("", advertisement);
	}

	@Override
	public void show(Integer advertisementId) {
		//SqlSession openSession = s.openSession();
		//openSession.update("", advertisementId);
	}

	@Override
	public void off(Integer advertisementId) {
		//SqlSession openSession = s.openSession();
		//openSession.update("", advertisementId);
	}

	@Override
	public void check(Advertisement advertisement) {
		//SqlSession openSession = s.openSession();
		//openSession.selectOne("", advertisement);
	}

}
