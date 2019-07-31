package com.jeecms.core.dao.impl;

import com.jeecms.common.hibernate4.HibernateBaseDao;
import com.jeecms.core.dao.CmsSiteCompanyDao;
import com.jeecms.core.entity.CmsSiteCompany;
import org.springframework.stereotype.Repository;

@Repository
public class CmsSiteCompanyDaoImpl extends
		HibernateBaseDao<CmsSiteCompany, Integer> implements CmsSiteCompanyDao {

	public CmsSiteCompany save(CmsSiteCompany bean) {
		getSession().save(bean);
		return bean;
	}

	@Override
	protected Class<CmsSiteCompany> getEntityClass() {
		return CmsSiteCompany.class;
	}
}