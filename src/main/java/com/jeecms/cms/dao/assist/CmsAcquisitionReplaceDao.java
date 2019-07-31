package com.jeecms.cms.dao.assist;

import com.jeecms.cms.entity.assist.CmsAcquisitionReplace;
import com.jeecms.common.hibernate4.Updater;

import java.util.List;
/**
 * 采集内容关键词替换接口
 * @author Administrator
 *
 */
public interface CmsAcquisitionReplaceDao {
	
	public CmsAcquisitionReplace save(CmsAcquisitionReplace bean);
	
	public CmsAcquisitionReplace updateByUpdater(Updater<CmsAcquisitionReplace> updater);
	
	public List<CmsAcquisitionReplace> getList(Integer acquisitionId);
}
