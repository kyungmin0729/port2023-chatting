package org.kyungmin0729.repositories;

import org.kyungmin0729.entities.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long>, QuerydslPredicateExecutor<ChatRoom> {
}