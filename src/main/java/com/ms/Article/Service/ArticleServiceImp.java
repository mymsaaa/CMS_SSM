package com.ms.Article.Service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.ms.domain.Article;

public class ArticleServiceImp implements ArticleService{
	//@Resource(name="sqlSessionFactory")
	//private SqlSessionFactory s;
	
	@Override
	public void add(Article article) {
		//SqlSession openSession = s.openSession();
		//openSession.insert("", article);
	}

	@Override
	public void delete(Integer articleId) {
		//SqlSession openSession = s.openSession();
		//openSession.delete("", articleId);		
	}

	@Override
	public List<Article> get(Article article) {
		//SqlSession openSession = s.openSession();
		//openSession.selectList("", article);			
		return null;
	}

	@Override
	public void like(Integer articleId) {
		//SqlSession openSession = s.openSession();
		//openSession.update("", articleId);		
	}

	@Override
	public void report(Integer articleId) {
		//SqlSession openSession = s.openSession();
		//openSession.update("", articleId);		
	}

	@Override
	public Article check(Article article) {
		//SqlSession openSession = s.openSession();
		//openSession.selectOne("", article);		
		return null;
	}
	
}
