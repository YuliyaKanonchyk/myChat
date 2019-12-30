package by.chat.mychat.service;

import by.chat.mychat.entity.Chat;

import java.util.ArrayList;
import java.util.List;

public class ChatService implements ChatI {
    private static List<Chat> chats = new ArrayList<>();

    @Override
    public void add(Chat chat){
        chats.add(chat);
    }
    @Override
    public Chat getChatById(int id){
        for (Chat chat : chats) {
            if (chat.getId() == id) {
                return chat;
            }
        }
        return null;
    }
}
