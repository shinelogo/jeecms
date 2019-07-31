package com.jeecms.cms.manager.assist;

import com.jeecms.cms.entity.assist.CmsDirectiveTpl;
import com.jeecms.common.page.Pagination;

import java.util.List;

public interface CmsDirectiveTplMng {
	public Pagination getPage(int pageNo, int pageSize);
	
	public List<CmsDirectiveTpl> getList(int count);

	public CmsDirectiveTpl findById(Integer id);

	public CmsDirectiveTpl save(CmsDirectiveTpl bean);

	public CmsDirectiveTpl update(CmsDirectiveTpl bean);

	public CmsDirectiveTpl deleteById(Integer id);
	
	public CmsDirectiveTpl[] deleteByIds(Integer[] ids);
}