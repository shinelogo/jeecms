package com.jeecms.cms.dao.main;

import com.jeecms.cms.entity.main.ApiRecord;
import com.jeecms.common.hibernate4.Updater;
import com.jeecms.common.page.Pagination;

public interface ApiRecordDao {
	public Pagination getPage(int pageNo, int pageSize);
	
	public ApiRecord findBySign(String sign,String appId);

	public ApiRecord findById(Long id);

	public ApiRecord save(ApiRecord bean);

	public ApiRecord updateByUpdater(Updater<ApiRecord> updater);

	public ApiRecord deleteById(Long id);
}