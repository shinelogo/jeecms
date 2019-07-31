package com.jeecms.core.dao;

import com.jeecms.common.hibernate4.Updater;
import com.jeecms.core.entity.CmsConfigItem;

import java.util.List;

public interface CmsConfigItemDao {
	public List<CmsConfigItem> getList(Integer configId,Integer category);

	public CmsConfigItem findById(Integer id);

	public CmsConfigItem save(CmsConfigItem bean);

	public CmsConfigItem updateByUpdater(Updater<CmsConfigItem> updater);

	public CmsConfigItem deleteById(Integer id);
}