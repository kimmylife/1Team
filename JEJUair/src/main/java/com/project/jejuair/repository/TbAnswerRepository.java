package com.project.jejuair.repository;

import com.project.jejuair.model.entity.TbAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbAnswerRepository extends JpaRepository<TbAnswer, Long> {
}
