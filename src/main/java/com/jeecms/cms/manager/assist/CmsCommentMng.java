package com.jeecms.cms.manager.assist;

import com.jeecms.cms.entity.assist.CmsComment;
import com.jeecms.cms.entity.assist.CmsCommentExt;
import com.jeecms.common.page.Pagination;
import com.jeecms.core.entity.CmsUser;

import java.util.List;

public interface CmsCommentMng {
	public Pagination getPage(Integer siteId, Integer contentId,
			Integer greaterThen, Short checked, Boolean recommend,
			boolean desc, int pageNo, int pageSize);

	public Pagination getNewPage(Integer siteId, Integer contentId,
			Short checked, Boolean recommend,int pageNo, int pageSize);
	
	public Pagination getPageForTag(Integer siteId, Integer contentId,
			Integer greaterThen, Short checked, Boolean recommend,
			boolean desc, int pageNo, int pageSize);
	
	/**
	 * 
	 * @param siteId
	 * @param contentId
	 * @param toUserId 写评论的用户
	 * @param fromUserId 投稿的信息接收到的相关评论
	 * @param greaterThen
	 * @param checked
	 * @param recommend
	 * @param desc
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public Pagination getPageForMember(Integer siteId, Integer contentId,Integer toUserId,Integer fromUserId,
			Integer greaterThen, Short checked, Boolean recommend,
			boolean desc, int pageNo, int pageSize);
	
	public List<CmsComment> getListForMember(Integer siteId, Integer contentId,
			Integer toUserId,Integer fromUserId,Integer greaterThen,
			Short checked, Boolean recommend,
			boolean desc, Integer first, Integer count);
	/**
	 * 
	 * @param siteId
	 * @param userId 发表信息用户id
	 * @param commentUserId 评论用户id
	 * @param ip  评论来访ip
	 * @return
	 */
	public List<CmsComment> getListForDel(Integer siteId, Integer userId,Integer commentUserId,String ip);

	public List<CmsComment> getListForTag(Integer siteId, Integer contentId,
			Integer parentId,Integer greaterThen, Short checked, Boolean recommend,
			boolean desc, Integer first,int count);

	public CmsComment findById(Integer id);

	public CmsComment comment(Integer score,String text, String ip, Integer contentId,
			Integer siteId, Integer userId, short checked, boolean recommend,Integer parentId);

	public CmsComment update(CmsComment bean, CmsCommentExt ext);

	public int deleteByContentId(Integer contentId);

	public CmsComment deleteById(Integer id);

	public CmsComment[] deleteByIds(Integer[] ids);

	public void ups(Integer id);

	public void downs(Integer id);

	public CmsComment[] checkByIds(Integer[] ids, CmsUser user, short checked);
}