package by.chat.mychat.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatName {
    private static int incId = 1;
    private int id = incId++;
    private User user1;
    private User user2;

    public ChatName(User user1, User user2) {
        this.user1 = user1;
        this.user2 = user2;
    }
}
