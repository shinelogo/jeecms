package com.jeecms.cms.dao.main;

import com.jeecms.cms.entity.main.ContentCount;
import com.jeecms.common.hibernate4.Updater;
import net.sf.ehcache.Ehcache;

public interface ContentCountDao {
	public int clearCount(boolean week, boolean month);

	public int copyCount();

	public int freshCacheToDB(Ehcache cache);

	public ContentCount findById(Integer id);

	public ContentCount save(ContentCount bean);

	public ContentCount updateByUpdater(Updater<ContentCount> updater);
}