package com.jeecms.core.dao;

import com.jeecms.common.hibernate4.Updater;
import com.jeecms.common.page.Pagination;
import com.jeecms.core.entity.CmsOss;

import java.util.List;

public interface CmsOssDao {
	public Pagination getPage(int pageNo, int pageSize);
	
	public List<CmsOss> getList();

	public CmsOss findById(Integer id);

	public CmsOss save(CmsOss bean);

	public CmsOss updateByUpdater(Updater<CmsOss> updater);

	public CmsOss deleteById(Integer id);
}