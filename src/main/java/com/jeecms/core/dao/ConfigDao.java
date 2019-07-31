package com.jeecms.core.dao;

import com.jeecms.core.entity.Config;

import java.util.List;

public interface ConfigDao {
	public List<Config> getList();

	public Config findById(String id);

	public Config save(Config bean);

	public Config deleteById(String id);
}