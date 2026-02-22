package com.hotel.Nexus.repositories;

import com.hotel.Nexus.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
