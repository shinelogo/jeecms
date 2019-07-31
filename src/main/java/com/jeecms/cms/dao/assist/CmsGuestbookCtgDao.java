package com.jeecms.cms.dao.assist;

import com.jeecms.cms.entity.assist.CmsGuestbookCtg;
import com.jeecms.common.hibernate4.Updater;

import java.util.List;

public interface CmsGuestbookCtgDao {
	public List<CmsGuestbookCtg> getList(Integer siteId);

	public CmsGuestbookCtg findById(Integer id);

	public CmsGuestbookCtg save(CmsGuestbookCtg bean);

	public CmsGuestbookCtg updateByUpdater(Updater<CmsGuestbookCtg> updater);

	public CmsGuestbookCtg deleteById(Integer id);
}