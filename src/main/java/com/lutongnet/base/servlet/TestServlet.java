package com.lutongnet.base.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet(urlPatterns="/servlet",
    initParams={  
        @WebInitParam(name="name",value="/WEB-INF/xiazdong.xml,/WEB-INF/zhangdsan.properties,/lisi.jsp,/index.jsp")
})
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init(ServletConfig config)throws ServletException{
        super.init(config);
        /*Enumeration e = config.getInitParameterNames();
        while(e.hasMoreElements()){
            System.err.println("paramName="+e.nextElement());
        }*/
        String paramValue = config.getInitParameter("name");
        System.err.println("servlet-initValue="+paramValue);
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    response.setCharacterEncoding("utf-8");
	    PrintWriter out = response.getWriter();
	    out.write("<font size=22 color=red>welcome to servlet...</font>");
	    out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    doGet(request,response);
	}

}
