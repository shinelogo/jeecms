package com.jeecms.core.dao;

import com.jeecms.common.hibernate4.Updater;
import com.jeecms.core.entity.CmsGroup;

import java.util.List;

public interface CmsGroupDao {
	public List<CmsGroup> getList();

	public CmsGroup getRegDef();

	public CmsGroup findById(Integer id);
	
	public CmsGroup findByName(String name);

	public CmsGroup save(CmsGroup bean);

	public CmsGroup updateByUpdater(Updater<CmsGroup> updater);

	public CmsGroup deleteById(Integer id);
}