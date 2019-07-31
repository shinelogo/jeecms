package com.jeecms.core.dao.impl;

import com.jeecms.common.hibernate4.Finder;
import com.jeecms.common.hibernate4.HibernateBaseDao;
import com.jeecms.common.page.Pagination;
import com.jeecms.core.dao.CmsOssDao;
import com.jeecms.core.entity.CmsOss;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CmsOssDaoImpl extends HibernateBaseDao<CmsOss, Integer> implements CmsOssDao {
	public Pagination getPage(int pageNo, int pageSize) {
		Criteria crit = createCriteria();
		Pagination page = findByCriteria(crit, pageNo, pageSize);
		return page;
	}
	
	public List<CmsOss> getList(){
		String hql="from CmsOss";
		Finder f=Finder.create(hql);
		f.setCacheable(true);
		return find(f);
	}

	public CmsOss findById(Integer id) {
		CmsOss entity = get(id);
		return entity;
	}

	public CmsOss save(CmsOss bean) {
		getSession().save(bean);
		return bean;
	}

	public CmsOss deleteById(Integer id) {
		CmsOss entity = super.get(id);
		if (entity != null) {
			getSession().delete(entity);
		}
		return entity;
	}
	
	@Override
	protected Class<CmsOss> getEntityClass() {
		return CmsOss.class;
	}
}