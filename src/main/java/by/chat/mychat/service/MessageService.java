package by.chat.mychat.service;

import by.chat.mychat.entity.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageService implements MessageI{
    private static List<Message> messageList = new ArrayList<>();

    @Override
    public void add(Message message) {
        messageList.add(message);
    }

    @Override
    public void delete(int id) {
        messageList.remove(id);
    }
}
