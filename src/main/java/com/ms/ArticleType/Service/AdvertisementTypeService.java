package com.ms.ArticleType.Service;

import java.util.List;

import com.ms.domain.Advertisement;
import com.ms.domain.ArticleType;

public interface AdvertisementTypeService {
	//文章类别添加
	public void add(ArticleType articleTypeId);
	//文章类别修改
	public void update(ArticleType articleType);
	//文章类别删除
	public void delete(Integer articleTypeId);
	//文章查询
	public List<ArticleType> get(ArticleType ArticleType);
	//文章类别检查，如果该文章类别的文章类别名字已存在，则不能发布
	public void check(ArticleType articleType);
}
