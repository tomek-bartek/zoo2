package com.example.demo.animal.rabbit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RabbitRepository extends JpaRepository<Rabbit,Long> {
}
