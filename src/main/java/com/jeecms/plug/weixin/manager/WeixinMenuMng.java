package com.jeecms.plug.weixin.manager;

import com.jeecms.common.page.Pagination;
import com.jeecms.plug.weixin.entity.WeixinMenu;

import java.util.List;

public interface WeixinMenuMng {
	
	public Pagination getPage(Integer siteId,Integer parentId
			,int pageNo,int pageSize);
	
	public List<WeixinMenu> getList(Integer siteId,Integer count);
	
	public String getMenuJsonString(Integer siteId);
	
	public WeixinMenu findById(Integer id);
	
	public WeixinMenu save(WeixinMenu bean);
	
	public WeixinMenu update(WeixinMenu bean);
	
	public WeixinMenu deleteById(Integer id);
	
	public WeixinMenu[] deleteByIds(Integer[] ids);
}
