package org.kyungmin0729.models.chat;

import lombok.RequiredArgsConstructor;
import org.kyungmin0729.controllers.chat.ChatMessageForm;
import org.kyungmin0729.entities.ChatHistory;
import org.kyungmin0729.entities.ChatRoom;
import org.kyungmin0729.repositories.ChatHistoryRepository;
import org.kyungmin0729.repositories.ChatRoomRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatMessageService {
    private final ChatRoomRepository roomRepository;
    private final ChatHistoryRepository historyRepository;

    public void save(ChatMessageForm form) {
        Long roomNo = form.roomNo();
        ChatRoom room = roomRepository.findById(roomNo).orElseThrow(RoomNotFoundException::new);

        ChatHistory history = ChatHistory.builder()
                .nickNm(form.nickNm())
                .message(form.message())
                .room(room)
                .build();
        historyRepository.saveAndFlush(history);
    }
}