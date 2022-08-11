package com.example.springbootpostgrejpa.domain.board.repository;

import com.example.springbootpostgrejpa.domain.board.domain.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
