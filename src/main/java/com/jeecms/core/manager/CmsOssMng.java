package com.jeecms.core.manager;

import com.jeecms.common.page.Pagination;
import com.jeecms.core.entity.CmsOss;

import java.util.List;

public interface CmsOssMng {
	public Pagination getPage(int pageNo, int pageSize);
	
	public List<CmsOss> getList();

	public CmsOss findById(Integer id);

	public CmsOss save(CmsOss bean);

	public CmsOss update(CmsOss bean);

	public CmsOss deleteById(Integer id);
	
	public CmsOss[] deleteByIds(Integer[] ids);
}