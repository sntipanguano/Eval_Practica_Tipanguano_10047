package com.proyecto.samanthatipanguano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.samanthatipanguano.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
