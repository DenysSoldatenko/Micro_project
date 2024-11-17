package com.example.servicenotification.repositories;

import com.example.servicenotification.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for accessing and managing {@link Notification} entities in the database.
 */
public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
