package com.example.Hotel__Management.Repo;

import com.example.Hotel__Management.Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepo extends JpaRepository<Room,Integer> {
    List<Room> findByRoomAvailable(boolean b);
}
