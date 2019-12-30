package by.chat.mychat.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "LogOutFilter", servletNames = "LogOutServlet")
public class LogOutFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        if (((boolean) req.getSession().getAttribute("isAuth"))) {
            chain.doFilter(req, res);
        }else {
            res.sendRedirect("/main");
        }
    }
}
