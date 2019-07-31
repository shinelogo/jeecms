package com.jeecms.core.dao;

import com.jeecms.common.hibernate4.Updater;
import com.jeecms.core.entity.CmsRole;

import java.util.List;

public interface CmsRoleDao {
	public List<CmsRole> getList(Integer level);

	public CmsRole findById(Integer id);

	public CmsRole save(CmsRole bean);

	public CmsRole updateByUpdater(Updater<CmsRole> updater);

	public CmsRole deleteById(Integer id);
}