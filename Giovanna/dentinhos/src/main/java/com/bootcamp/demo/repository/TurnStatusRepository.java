package com.bootcamp.demo.repository;

import com.bootcamp.demo.model.TurnStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurnStatusRepository extends JpaRepository<TurnStatus,Long> {
}
