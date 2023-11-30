package org.kyungmin0729.repositories;

import org.kyungmin0729.entities.ChatHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ChatHistoryRepository extends JpaRepository<ChatHistory, Long>, QuerydslPredicateExecutor<ChatHistory> {
}