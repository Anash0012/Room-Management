package com.example.Hotel__Management.Service;

import com.example.Hotel__Management.Model.Room;
import com.example.Hotel__Management.Repo.RoomRepo;
import org.hibernate.type.TrueFalseConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    RoomRepo roomRepo;

    public String addRoom(Room room) {
        roomRepo.save(room);
        return "Room added Successfully.";
    }

    public List<Room> getAllRooms() {
        return roomRepo.findAll();
    }

    public String addRooms(List<Room> rooms) {
        roomRepo.saveAll(rooms);
        return rooms.size()+" rooms were added.";
    }

    public Room getRoomById(Integer id) {
        return roomRepo.findById(id).orElseThrow();
    }

    public List<Room> getAllAvailableRooms() {
        return roomRepo.findByRoomAvailable(true);
    }
}
