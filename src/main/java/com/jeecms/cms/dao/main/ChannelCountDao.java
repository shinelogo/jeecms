package com.jeecms.cms.dao.main;

import com.jeecms.cms.entity.main.ChannelCount;
import com.jeecms.common.hibernate4.Updater;
import net.sf.ehcache.Ehcache;

public interface ChannelCountDao {
	public int clearCount(boolean week, boolean month);
	
	public int clearContentCount(boolean day,boolean week, boolean month,boolean year);

	public int freshCacheToDB(Ehcache cache);

	public ChannelCount findById(Integer id);

	public ChannelCount save(ChannelCount bean);

	public ChannelCount updateByUpdater(Updater<ChannelCount> updater);
}