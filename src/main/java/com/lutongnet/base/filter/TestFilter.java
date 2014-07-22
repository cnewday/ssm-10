package com.lutongnet.base.filter;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lutongnet.base.customAnnotation.ErrorLog;

/**
 * Servlet Filter implementation class TestFilter
 */
@WebFilter(urlPatterns="/abc",
    initParams={@WebInitParam(name="exclude",value="/login.do,/logout.do,/index.jsp")}
)
public class TestFilter implements Filter {
    
    private static List<String> excludeUrlList;
    
    /**
     * Default constructor. 
     */
    public TestFilter() {
        // TODO Auto-generated constructor stub
        System.err.println("----构造filter开始----");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	@ErrorLog(value="收到请求",desc="请求过滤",debug=true)
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
	    System.err.println("----开始filter----");
	    HttpServletRequest req = (HttpServletRequest) request;
	    String curUrl = req.getServletPath();
	    boolean isSessionExist= req.isRequestedSessionIdValid();
	    boolean isExcludeUrl = excludeUrlList.contains(curUrl);
	          
	    //调用下个过滤器
        chain.doFilter(request, response);
        
	    /*//不过滤路径且session合法
        if(isExcludeUrl && isSessionExist){
            System.err.println("==>不过滤,session合法 ");
            
        //过滤路径,session合法
        }else if(!isExcludeUrl && isSessionExist){
            System.err.println("==>已过滤,session合法");
            
        //过滤路径，session不合法
        }else if(!isExcludeUrl && !isSessionExist){
        
            HttpServletResponse resp = (HttpServletResponse) response;
            resp.sendRedirect("http://www.baidu.com");
            System.err.println("filter-end");
        }*/
        System.err.println("----结束filter----");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	    String excludeUrls = fConfig.getInitParameter("exclude");
	    excludeUrlList = new LinkedList<String>();
	    String[] strArray = excludeUrls.split(",");
	    for(String excludeUrl : strArray){
	        excludeUrlList.add(excludeUrl);
	    }
	    System.err.println("----filter自定义参数"+excludeUrls+"----");
	    System.err.println("----初始化filter----");
	}

}
