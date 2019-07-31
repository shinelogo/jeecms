package com.jeecms.cms.dao.assist;

import com.jeecms.cms.entity.assist.CmsAdvertisingSpace;
import com.jeecms.common.hibernate4.Updater;

import java.util.List;

public interface CmsAdvertisingSpaceDao {
	public List<CmsAdvertisingSpace> getList(Integer siteId);

	public CmsAdvertisingSpace findById(Integer id);

	public CmsAdvertisingSpace save(CmsAdvertisingSpace bean);

	public CmsAdvertisingSpace updateByUpdater(
			Updater<CmsAdvertisingSpace> updater);

	public CmsAdvertisingSpace deleteById(Integer id);
}