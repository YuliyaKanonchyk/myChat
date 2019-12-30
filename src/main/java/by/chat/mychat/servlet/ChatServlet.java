package by.chat.mychat.servlet;

import by.chat.mychat.entity.Chat;
import by.chat.mychat.entity.User;
import by.chat.mychat.service.ChatService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


// TODO: 28.12.2019 На писать фильтры к сервлетам
// TODO: 28.12.2019 Написать личный кабинет
// TODO: 28.12.2019 Написать к чату jsp + jstl
// TODO: 28.12.2019 Доделать чат

@WebServlet(name = "ChatServlet", urlPatterns = "/chat")
public class ChatServlet extends HttpServlet {
    private ChatService chatService = new ChatService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User currentUser = (User) req.getSession().getAttribute("currentUser");
        List<Integer> chatId = currentUser.getChatId();
        for (Integer integer : chatId) {
            Chat chatById = chatService.getChatById(integer);
            if (chatById != null) {
                req.setAttribute("messages", chatById.getMessageList());
            }
        }
    }
}
