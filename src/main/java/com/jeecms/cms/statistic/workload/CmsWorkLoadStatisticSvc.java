package com.jeecms.cms.statistic.workload;

import com.jeecms.cms.statistic.workload.CmsWorkLoadStatistic.CmsWorkLoadStatisticDateKind;
import com.jeecms.cms.statistic.workload.CmsWorkLoadStatistic.CmsWorkLoadStatisticGroup;

import java.util.Date;
import java.util.List;

public interface CmsWorkLoadStatisticSvc {
	public List<CmsWorkLoadStatistic> statistic(Integer channelId,
			Integer reviewerId, Integer authorId, Date beginDate, Date endDate,
			CmsWorkLoadStatisticGroup group,CmsWorkLoadStatisticDateKind kind);
	
	public List<Object[]> statisticByTarget(Integer target,
			Integer channelId,Integer reviewerId, 
			Integer authorId, Date beginDate, Date endDate);
}
