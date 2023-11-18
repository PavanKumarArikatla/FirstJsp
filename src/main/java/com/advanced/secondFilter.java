package com.advanced;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


@WebFilter("/1stservlet")
public class secondFilter extends HttpFilter implements Filter {
    
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		HttpServletRequest req = (HttpServletRequest) request;
		String name = req.getParameter("name");
		
		if(name.length()>3)
			chain.doFilter(request, response);
		else
			out.println("invalid name");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
