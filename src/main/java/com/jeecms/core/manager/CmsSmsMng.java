package com.jeecms.core.manager;

import com.jeecms.common.page.Pagination;
import com.jeecms.core.entity.CmsSms;

import java.util.List;

public interface CmsSmsMng {
public Pagination getPage(Byte source,int pageNo, int pageSize);
	
	public List<CmsSms> getList();

	public CmsSms findById(Integer id);

	public CmsSms save(CmsSms bean);

	public CmsSms update(CmsSms bean);

	public CmsSms deleteById(Integer id);
	
	public CmsSms[] deleteByIds(Integer[] ids);

	public CmsSms findBySource(Byte source);
}
