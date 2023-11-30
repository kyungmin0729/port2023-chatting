package org.kyungmin0729.models.chat;

import lombok.RequiredArgsConstructor;
import org.kyungmin0729.controllers.chat.ChatRoomForm;
import org.kyungmin0729.entities.ChatRoom;
import org.kyungmin0729.repositories.ChatRoomRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatRoomSaveService {
    private final ChatRoomRepository repository;

    public ChatRoom save(ChatRoomForm form) {
        Long roomNo = form.roomNo();
        ChatRoom room = null;
        if (roomNo != null) {
            room = repository.findById(roomNo).orElseThrow(RoomNotFoundException::new);
        } else {
            room = new ChatRoom();
        }

        room.setRoomNm(form.roomNm());
        room.setMax(form.max());
        repository.saveAndFlush(room);

        return room;
    }
}