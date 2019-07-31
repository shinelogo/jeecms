package com.jeecms.cms.dao.assist;

import com.jeecms.cms.entity.assist.CmsSensitivity;
import com.jeecms.common.hibernate4.Updater;

import java.util.List;

public interface CmsSensitivityDao {
	public List<CmsSensitivity> getList(boolean cacheable);

	public CmsSensitivity findById(Integer id);

	public CmsSensitivity save(CmsSensitivity bean);

	public CmsSensitivity updateByUpdater(Updater<CmsSensitivity> updater);

	public CmsSensitivity deleteById(Integer id);
}