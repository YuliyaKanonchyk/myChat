package by.chat.mychat.service;

import by.chat.mychat.entity.Message;

public interface MessageI {
    void add (Message message);
    void delete (int id);
}
