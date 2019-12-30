package by.chat.mychat.service;

import by.chat.mychat.entity.User;

public interface UserI {
    void addUser (User user);
    User getUser (String login, String password);
}
