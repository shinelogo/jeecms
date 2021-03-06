package com.jeecms.cms.staticpage;

import com.jeecms.cms.entity.main.Channel;
import com.jeecms.cms.entity.main.Content;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

public interface StaticPageDao {

	public int channelStatic(HttpServletRequest request, HttpServletResponse response,
			Integer siteId, Integer channelId, boolean containChild, Configuration conf, Map<String, Object> data)
			throws IOException, TemplateException;

	public void channelStatic(Channel c, boolean firstOnly, Configuration conf,
			Map<String, Object> data) throws IOException, TemplateException;

	public int contentStatic(HttpServletRequest request, HttpServletResponse response,
			Integer siteId,Integer channelId, Date start, 
			Configuration conf, Map<String, Object> data) throws IOException,
			TemplateException;
	
	public boolean contentStatic(Content c, Configuration conf,
			Map<String, Object> data) throws IOException, TemplateException;

	public int contentsOfChannel(Integer channelId);

	public int childsOfChannel(Integer channelId);
}
