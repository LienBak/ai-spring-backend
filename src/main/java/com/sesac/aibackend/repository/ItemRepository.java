package com.sesac.aibackend.repository;

import com.sesac.aibackend.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}

// JpaRepository 상속받고 CRUD 끝(이것만 상속받더라도 CRUD 끝남), 관리 객체: Item
