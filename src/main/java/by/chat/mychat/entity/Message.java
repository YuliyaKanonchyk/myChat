package by.chat.mychat.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private static int incId = 1;
    private int id = incId++;
    private String body;
    private User user;

    public Message(String body, User user) {
        this.body = body;
        this.user = user;
    }
}
