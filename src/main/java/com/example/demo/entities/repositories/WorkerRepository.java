package com.example.demo.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
