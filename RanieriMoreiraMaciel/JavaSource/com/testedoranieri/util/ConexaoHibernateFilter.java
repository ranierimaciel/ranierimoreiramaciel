package com.testedoranieri.util;

import java.io.IOException;
import javax.servlet.*;
import org.hibernate.*;

import com.testedoranieri.HibernateUtil;


public class ConexaoHibernateFilter implements javax.servlet.Filter{
	private SessionFactory sf;

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest servletFilter, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		try {
					
		this.sf.getCurrentSession().beginTransaction();
		chain.doFilter(servletFilter, servletResponse);
		this.sf.getCurrentSession().getTransaction().commit();
		this.sf.getCurrentSession().close();

		} catch (Throwable ex) {
			try {
				if(this.sf.getCurrentSession().getTransaction().isActive()) {
					this.sf.getCurrentSession().getTransaction().rollback();
				}
			} catch (Throwable t) {
				t.printStackTrace();
			}
		
			throw new ServletException();
			
		}
			
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		
		this.sf=HibernateUtil.getSession();
		
	}

}
