package com.jeecms.cms.dao.assist;

import com.jeecms.cms.entity.assist.CmsAcquisitionShield;
import com.jeecms.common.hibernate4.Updater;

import java.util.List;

public interface CmsAcquisitionShieldDao {
	
	public CmsAcquisitionShield save(CmsAcquisitionShield bean);
	
	public CmsAcquisitionShield updateByUpdater(Updater<CmsAcquisitionShield> updater);
	
	public List<CmsAcquisitionShield> getList(Integer acquisitionId);
}
