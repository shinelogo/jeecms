package com.jeecms.cms.dao.main.impl;

import com.jeecms.cms.dao.main.ChannelExtDao;
import com.jeecms.cms.entity.main.ChannelExt;
import com.jeecms.common.hibernate4.HibernateBaseDao;
import org.springframework.stereotype.Repository;

@Repository
public class ChannelExtDaoImpl extends HibernateBaseDao<ChannelExt, Integer>
		implements ChannelExtDao {
	public ChannelExt save(ChannelExt bean) {
		getSession().save(bean);
		return bean;
	}

	@Override
	protected Class<ChannelExt> getEntityClass() {
		return ChannelExt.class;
	}
}