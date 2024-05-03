package com.example.Hotel__Management.Controller;

import com.example.Hotel__Management.Model.Room;
import com.example.Hotel__Management.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    RoomService roomService;

    @PostMapping("room")
    public String addRoom(@RequestBody Room room){
        return roomService.addRoom(room);
    }

    @GetMapping("rooms")
    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }

    @PostMapping("rooms")
    public String addRooms(@RequestBody List<Room> rooms){
        return roomService.addRooms(rooms);
    }

    @GetMapping("room/id/{id}")
    public Room getroomById(@PathVariable Integer id){
        return roomService.getRoomById(id);
    }

    @GetMapping("rooms/available")
    public List<Room> getAllAvailableRooms(){
        return roomService.getAllAvailableRooms();
    }

}
