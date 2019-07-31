package com.jeecms.cms.entity.assist;

import com.jeecms.cms.entity.assist.base.BaseCmsTask;
import com.jeecms.common.util.DateUtils;
import com.jeecms.core.entity.CmsSite;
import com.jeecms.core.entity.CmsUser;
import org.apache.commons.lang.StringUtils;
import org.json.JSONObject;

import java.util.Calendar;
import java.util.Map;



public class CmsTask extends BaseCmsTask {
	/**
	 * 任务执行周期cron表达式
	 */
	public static int EXECYCLE_CRON=2;
	/**
	 * 任务执行周期自定义
	 */
	public static int EXECYCLE_DEFINE=1;
	/**
	 * 执行周期-分钟
	 */
	public static int EXECYCLE_MINUTE=1;
	/**
	 * 执行周期-小时
	 */
	public static int EXECYCLE_HOUR=2;
	/**
	 * 执行周期-日
	 */
	public static int EXECYCLE_DAY=3;
	/**
	 * 执行周期-月
	 */
	public static int EXECYCLE_WEEK=4;
	/**
	 * 执行周期-月
	 */
	public static int EXECYCLE_MONTH=5;
	/**
	 * 首页静态任务
	 */
	public static int TASK_STATIC_INDEX=1;
	/**
	 * 栏目页静态化任务
	 */
	public static int TASK_STATIC_CHANNEL=2;
	/**
	 * 内容页静态化任务
	 */
	public static int TASK_STATIC_CONTENT=3;
	/**
	 * 采集类任务
	 */
	public static int TASK_ACQU=4;
	/**
	 * 分发类任务
	 */
	public static int TASK_DISTRIBUTE=5;
	/**
	 * 采集源ID
	 */
	public static String TASK_PARAM_ACQU_ID="acqu_id";
	/**
	 * 分发FTP ID
	 */
	public static String TASK_PARAM_FTP_ID="ftp_id";
	/**
	 * 站点 ID
	 */
	public static String TASK_PARAM_SITE_ID="site_id";
	/**
	 * 栏目 ID
	 */
	public static String TASK_PARAM_CHANNEL_ID="channel_id";
	/**
	 * 分发到FTP 的文件夹参数前缀
	 */
	public static String TASK_PARAM_FOLDER_PREFIX="floder_";
	
	private static final long serialVersionUID = 1L;
	public void init(CmsSite site,CmsUser user){
		if(getCreateTime()==null){
			setCreateTime(Calendar.getInstance().getTime());
		}
		if(getUser()==null){
			setUser(user);
		}
		if(getSite()==null){
			setSite(site);
		}
	}
	public boolean getEnable () {
		return super.isEnable();
	}

	public JSONObject convertToJson(){
		JSONObject json = new JSONObject();
		if (getId()!=null) {
			json.put("id", getId());
		}else{
			json.put("id", "");
		}
		if (StringUtils.isNotBlank(getTaskCode())) {
			json.put("taskCode", getTaskCode());
		}else{
			json.put("taskCode", "");
		}
		if (getType()!=null) {
			json.put("type", getType());
		}else{
			json.put("type", "");
		}
		if (StringUtils.isNotBlank(getName())) {
			json.put("name", getName());
		}else{
			json.put("name", "");
		}
		if (StringUtils.isNotBlank(getJobClass())) {
			json.put("jobClass", getJobClass());
		}else{
			json.put("jobClass", "");
		}
		if (getExecycle()!=null) {
			json.put("execycle", getExecycle());
		}else{
			json.put("execycle", "");
		}
		if (getDayOfMonth()!=null) {
			json.put("dayOfMonth", getDayOfMonth());
		}else{
			json.put("dayOfMonth", "");
		}
		if (getDayOfWeek()!=null) {
			json.put("dayOfWeek", getDayOfWeek());
		}else{
			json.put("dayOfWeek", "");
		}
		if (getHour()!=null) {
			json.put("hour", getHour());
		}else{
			json.put("hour", "");
		}
		if (getMinute()!=null) {
			json.put("minute", getMinute());
		}else{
			json.put("minute", "");
		}
		if (getIntervalHour()!=null) {
			json.put("intervalHour", getIntervalHour());
		}else{
			json.put("intervalHour", "");
		}
		if (getIntervalMinute()!=null) {
			json.put("intervalMinute", getIntervalMinute());
		}else{
			json.put("intervalMinute", "");
		}
		if (getIntervalUnit()!=null) {
			json.put("intervalUnit", getIntervalUnit());
		}else{
			json.put("intervalUnit", "");
		}
		if (StringUtils.isNotBlank(getCronExpression())) {
			json.put("cronExpression", getCronExpression());
		}else{
			json.put("cronExpression", "");
		}
		json.put("enable", getEnable());
		if (StringUtils.isNotBlank(getRemark())) {
			json.put("remark", getRemark());
		}else{
			json.put("remark", "");
		}
		if (getCreateTime()!=null) {
			json.put("createTime", DateUtils.parseDateToTimeStr(getCreateTime()));
		}else{
			json.put("createTime", "");
		}
		if (getAttr()!=null) {
			Map<String, String> map = getAttr();
			for(String key : map.keySet()){
				json.put("attr_"+key, map.get(key));
			}
		}
		if (getUser()!=null&&StringUtils.isNotBlank(getUser().getUsername())) {
			json.put("username", getUser().getUsername());
		}else{
			json.put("username", "");
		}
		if (getUser()!=null&&getUser().getId()!=null) {
			json.put("userId", getUser().getId());
		}else{
			json.put("userId", "");
		}
		return json;
	}
	
/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsTask () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsTask (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsTask (
		java.lang.Integer id,
		com.jeecms.core.entity.CmsUser user,
		com.jeecms.core.entity.CmsSite site,
		java.lang.Integer type,
		java.lang.String name,
		java.lang.String jobClass,
		boolean enable,
		java.util.Date createTime) {

		super (
			id,
			user,
			site,
			type,
			name,
			jobClass,
			enable,
			createTime);
	}

/*[CONSTRUCTOR MARKER END]*/


}