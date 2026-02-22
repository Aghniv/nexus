package com.hotel.Nexus.repositories;

import com.hotel.Nexus.entities.Room;
import com.hotel.Nexus.enums.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {

    @Query("SELECT DISTINCT r FROM Room r WHERE " +
            "r.id NOT IN (SELECT b.room.id FROM Booking b WHERE " +
            "b.bookingStatus != 'CANCELLED' AND " +
            "((b.checkInDate <= :checkOutDate) AND (b.checkOutDate >= :checkInDate))) " +
            "AND (:roomType IS NULL OR r.type = :roomType)")
    List<Room> findAvailableRooms(@Param("checkInDate") LocalDate checkInDate,
                                   @Param("checkOutDate") LocalDate checkOutDate,
                                   @Param("roomType") RoomType roomType);

    @Query("SELECT r FROM Room r WHERE LOWER(r.description) LIKE LOWER(CONCAT('%', :input, '%')) OR " +
            "LOWER(r.type) LIKE LOWER(CONCAT('%', :input, '%'))")
    List<Room> searchRooms(@Param("input") String input);
}