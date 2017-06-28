package com.ms.Advertisement.Service;

import com.ms.domain.Advertisement;

public interface AdvertisementService {
	//广告添加
	public void add(Advertisement advertisement);
	//广告修改
	public void update(Advertisement advertisement);
	//广告删除
	public void delete(Integer advertisementId);
	//搜索广告
	public void get(Advertisement advertisement);
	//广告推送到轮播图
	public void show(Integer advertisementId);
	//广告下架
	public void off(Integer advertisementId);
	//广告检查，如果该广告的广告名称已存在则不能被发布
	public void check(Advertisement advertisement);
}
