package com.example.washmachine.repositories;

import com.example.washmachine.entities.WashMachine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WashMachineRepo extends JpaRepository<WashMachine, Long> {
}
