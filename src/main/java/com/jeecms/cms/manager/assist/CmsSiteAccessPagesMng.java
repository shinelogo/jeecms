package com.jeecms.cms.manager.assist;

import com.jeecms.cms.entity.assist.CmsSiteAccessPages;
import com.jeecms.common.page.Pagination;

import java.util.Date;

/**
 * @author Tom
 */
public interface CmsSiteAccessPagesMng {

	public CmsSiteAccessPages save(CmsSiteAccessPages access);
	
	public CmsSiteAccessPages update(CmsSiteAccessPages access);

	public CmsSiteAccessPages findAccessPage(String sessionId, Integer pageIndex);
	
	public Pagination findPages(Integer siteId,Integer orderBy,Integer pageNo,Integer pageSize);

	public void clearByDate(Date date);
}
