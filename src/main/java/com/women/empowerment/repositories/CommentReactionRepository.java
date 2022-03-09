package com.women.empowerment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.women.empowerment.entites.CommentReaction;


@Repository
public interface CommentReactionRepository extends JpaRepository<CommentReaction, Long> {
}
