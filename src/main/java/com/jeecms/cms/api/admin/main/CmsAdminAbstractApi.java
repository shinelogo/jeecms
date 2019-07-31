package com.jeecms.cms.api.admin.main;

import com.jeecms.cms.manager.assist.CmsWebserviceMng;
import com.jeecms.cms.manager.main.ChannelMng;
import com.jeecms.core.manager.*;
import com.jeecms.core.security.CmsAuthorizingRealm;
import org.springframework.beans.factory.annotation.Autowired;

public class CmsAdminAbstractApi {
	@Autowired
	protected CmsSiteMng cmsSiteMng;
	@Autowired
	protected ChannelMng channelMng;
	@Autowired
	protected CmsRoleMng cmsRoleMng;
	@Autowired
	protected CmsGroupMng cmsGroupMng;
	@Autowired
	protected CmsLogMng cmsLogMng;
	@Autowired
	protected CmsUserMng manager;
	@Autowired
	protected CmsWebserviceMng cmsWebserviceMng;
	@Autowired
	protected CmsAuthorizingRealm authorizingRealm;
}
