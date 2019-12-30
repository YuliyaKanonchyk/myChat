package by.chat.mychat.service;

import by.chat.mychat.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements UserI {
    private static List<User> userList = new ArrayList<>();

    @Override
    public void addUser(User user) {
        userList.add(user);
    }

    @Override
    public User getUser(String login, String password) {
        for (User user : userList) {
            if (user.getLogin().equalsIgnoreCase(login)) {
                if (user.getPassword().equals(password)) {
                    return user;
                }
            }
        }
        return null;
    }
}
