package cm.advanced;

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

//THIS IS A FILTER

@WebFilter("/1stservlet")
public class servletFilter extends HttpFilter implements Filter {
       
	private static final long serialVersionUID = 1L;

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		HttpServletRequest req = (HttpServletRequest) request;
		int nmbr = Integer.parseInt(req.getParameter("id"));
		if(nmbr>1)
			chain.doFilter(request, response);
		else
			out.println("invalid number");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
