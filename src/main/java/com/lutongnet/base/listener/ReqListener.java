package com.lutongnet.base.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

import com.lutongnet.base.customAnnotation.ErrorLog;

/**
 * Application Lifecycle Listener implementation class ReqListener
 *
 */
@WebListener
public class ReqListener implements ServletRequestListener, ServletRequestAttributeListener {

    /**
     * Default constructor. 
     */
    public ReqListener() {
        // TODO Auto-generated constructor stub
        System.err.println("----构造req请求开始----");
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre) {
        // TODO Auto-generated method stub
        
        System.err.println("----req请求结束----");
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre) {
        // TODO Auto-generated method stub
        System.err.println("----req请求初始化----");
        HttpServletRequest req = (HttpServletRequest) sre.getServletRequest();
        System.err.println(req.getRemoteHost());
        System.err.println(req.getContextPath());
        System.err.println(req.getServletPath());
        System.err.println(req.getQueryString());
        
        boolean validFlag = req.isRequestedSessionIdValid();
        System.err.println("----请求合法标识:"+validFlag+"----");
    }
	
}
