package com.jeecms.cms.manager.assist;

import com.jeecms.cms.entity.assist.CmsSiteAccessCount;

import java.util.Date;
import java.util.List;

/**
 * @author Tom
 */
public interface CmsSiteAccessCountMng {
	public List<Object[]> statisticVisitorCountByDate(Integer siteId,Date begin, Date end);

	public List<Object[]> statisticVisitorCountByYear(Integer siteId,Integer year);

	public CmsSiteAccessCount save(CmsSiteAccessCount count);

	public void statisticCount(Date date, Integer siteId);
}
