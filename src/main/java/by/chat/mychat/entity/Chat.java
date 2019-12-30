package by.chat.mychat.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chat {
    private static int incId = 1;
    private int id = incId++;
    private User user1;
    private User user2;
    private List<Message> messageList;
    private ChatName chatName;

    public Chat(User user1, User user2, List<Message> messageList, ChatName chatName) {
        this.user1 = user1;
        this.user2 = user2;
        this.messageList = messageList;
        this.chatName = chatName;
    }
}
