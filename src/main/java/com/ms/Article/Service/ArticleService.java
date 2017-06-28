package com.ms.Article.Service;

import java.util.List;

import com.ms.domain.Article;

public interface ArticleService {
	//文章发布
	public void add(Article article);
	//文章删除
	public void delete(Integer articleId);
	//文章搜索
	public List<Article> get(Article article);
	//文章点赞
	public void like(Integer articleId);
	//文章举报
	public void report(Integer articleId);
	//文章检查，如果该文章的文章名已存在就不能发布
	public Article check(Article article);
}
