package com.jeecms.common.web;

/**
 * @author Tom
 */
import com.jeecms.core.web.util.URLHelper;
import org.apache.commons.lang.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class XssFilter implements Filter {
	private String excludeUrls;
	FilterConfig filterConfig = null;
	public void init(FilterConfig filterConfig) throws ServletException {
		this.excludeUrls=filterConfig.getInitParameter("excludeUrls");
		this.filterConfig = filterConfig;
	}

	public void destroy() {
		this.filterConfig = null;
	}

	public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {
		if(isExcludeUrl(request)){
			chain.doFilter(request, response);
		}else{
			HttpServletRequest req=(HttpServletRequest)request;
			chain.doFilter(new XssHttpServletRequestWrapper(req), response);
		}
	}
	
	private boolean isExcludeUrl(ServletRequest request){
		boolean exclude=false;
		if(StringUtils.isNotBlank(excludeUrls)){
			 String[]excludeUrl=excludeUrls.split("@");
			 if(excludeUrl!=null&&excludeUrl.length>0){
				 for(String url:excludeUrl){
					 if(URLHelper.getURI((HttpServletRequest)request).startsWith(url)){
						 exclude=true;
					 }
				 }
			 }
		}
		return exclude;
	}

}
