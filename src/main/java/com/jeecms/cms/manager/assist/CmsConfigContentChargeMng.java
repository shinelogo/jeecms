package com.jeecms.cms.manager.assist;

import com.jeecms.cms.entity.assist.CmsConfigContentCharge;

import java.util.Map;

public interface CmsConfigContentChargeMng {
	
	public CmsConfigContentCharge findById(Integer id) ;
	
	public CmsConfigContentCharge getDefault();

	public CmsConfigContentCharge update(CmsConfigContentCharge bean
			,String payTransferPassword,Map<String,String> keys,Map<String,String>fixVal);
	
	public CmsConfigContentCharge afterUserPay(Double payAmout);

}