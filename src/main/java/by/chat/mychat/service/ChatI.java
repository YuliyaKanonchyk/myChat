package by.chat.mychat.service;

import by.chat.mychat.entity.Chat;

public interface ChatI {
    void add (Chat chat);
    Chat getChatById(int id);
}
