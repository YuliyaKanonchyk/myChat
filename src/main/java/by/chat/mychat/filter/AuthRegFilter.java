package by.chat.mychat.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "AuthRegFilter", servletNames = {"AuthorizationServlet", "RegistrationServlet"})
public class AuthRegFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        if (((boolean) req.getSession().getAttribute("isAuth"))) {
            res.sendRedirect("/main");
        } else {
            chain.doFilter(req, res);
        }
    }
}
