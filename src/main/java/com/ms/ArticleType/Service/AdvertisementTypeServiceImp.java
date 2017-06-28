package com.ms.ArticleType.Service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.ms.domain.ArticleType;

public class AdvertisementTypeServiceImp implements AdvertisementTypeService {
	//@Resource(name="sqlSessionFactory")
	//private SqlSessionFactory s;
	
	@Override
	public void add(ArticleType articleTypeId) {
		//SqlSession openSession = s.openSession();
		//openSession.insert("", articleTypeId);
	}

	@Override
	public void update(ArticleType articleType) {
		//SqlSession openSession = s.openSession();
		//openSession.update("", articleType);
	}

	@Override
	public void delete(Integer articleTypeId) {
		//SqlSession openSession = s.openSession();
		//openSession.delete("", articleTypeId);
	}

	@Override
	public List<ArticleType> get(ArticleType ArticleType) {
		//SqlSession openSession = s.openSession();
		//openSession.selectList("", ArticleType);
		return null;
	}

	@Override
	public void check(ArticleType articleType) {
		//SqlSession openSession = s.openSession();
		//openSession.selectOne("", articleType);
	}

}
