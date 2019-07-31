package com.jeecms.core.dao.impl;

import com.jeecms.common.hibernate4.HibernateBaseDao;
import com.jeecms.core.dao.ConfigDao;
import com.jeecms.core.entity.Config;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ConfigDaoImpl extends HibernateBaseDao<Config, String> implements
		ConfigDao {
	@SuppressWarnings("unchecked")
	public List<Config> getList() {
		String hql = "from Config";
		return find(hql);
	}

	public Config findById(String id) {
		Config entity = get(id);
		return entity;
	}

	public Config save(Config bean) {
		getSession().save(bean);
		return bean;
	}

	public Config deleteById(String id) {
		Config entity = super.get(id);
		if (entity != null) {
			getSession().delete(entity);
		}
		return entity;
	}

	@Override
	protected Class<Config> getEntityClass() {
		return Config.class;
	}
}