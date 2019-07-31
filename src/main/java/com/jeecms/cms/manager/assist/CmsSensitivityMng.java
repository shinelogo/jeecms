package com.jeecms.cms.manager.assist;

import com.jeecms.cms.entity.assist.CmsSensitivity;

import java.util.List;

public interface CmsSensitivityMng {

	public String replaceSensitivity(String s);
	
	public boolean haveSensitivity(String... arrays);

	public List<CmsSensitivity> getList(boolean cacheable);

	public CmsSensitivity findById(Integer id);

	public CmsSensitivity save(CmsSensitivity bean);

	public void updateEnsitivity(Integer[] ids, String[] searchs,
			String[] replacements);

	public CmsSensitivity deleteById(Integer id);

	public CmsSensitivity[] deleteByIds(Integer[] ids);
}