package com.jeecms.cms.dao.assist;

import com.jeecms.cms.entity.assist.CmsUserMenu;
import com.jeecms.common.hibernate4.Updater;
import com.jeecms.common.page.Pagination;

import java.util.List;

public interface CmsUserMenuDao {
	public Pagination getPage(Integer userId,int pageNo, int pageSize);
	
	public List<CmsUserMenu> getList(Integer userId,int count);

	public CmsUserMenu findById(Integer id);

	public CmsUserMenu save(CmsUserMenu bean);

	public CmsUserMenu updateByUpdater(Updater<CmsUserMenu> updater);

	public CmsUserMenu deleteById(Integer id);
}