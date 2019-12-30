package by.chat.mychat.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "ChatFilter", servletNames = "ChatServlet")
public class ChatFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        if (((boolean) req.getSession().getAttribute("isAuth"))) {
            chain.doFilter(req, res);
        } else {
            res.sendRedirect("/auth");
        }
    }
}
