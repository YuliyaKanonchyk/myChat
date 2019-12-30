package by.chat.mychat.servlet;

import by.chat.mychat.entity.User;
import by.chat.mychat.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AuthorizationServlet", urlPatterns = "/auth")
public class AuthorizationServlet extends HttpServlet {
    private UserService userService = new UserService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        User user = userService.getUser(login, password);
        if (user != null){
            request.getSession().setAttribute("currentUser", user);
            request.getSession().setAttribute("isAuth", true);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/auth.jsp").forward(request, response);
    }
}
