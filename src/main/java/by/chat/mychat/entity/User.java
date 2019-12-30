package by.chat.mychat.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private static int incId =1;
    private int id = incId++;
    private String login;
    private String password;
    private List<Integer> chatId;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
