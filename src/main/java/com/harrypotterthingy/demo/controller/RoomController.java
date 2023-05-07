package com.harrypotterthingy.demo.controller;

import com.harrypotterthingy.demo.controller.exception.RoomNotFound;
import com.harrypotterthingy.demo.model.Room;
import com.harrypotterthingy.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {

    RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }

    @PostMapping
    public void addRoom(@RequestBody Room room){
        roomService.addRoom(room);
    }

    @GetMapping("/{id}")
    public Room getRoomById(@PathVariable("id") Long id) throws RoomNotFound {
        return roomService.getRoomById(id);
    }

    @PutMapping("/{id}")
    public void updateRoomById(@PathVariable("id") Long id, @RequestBody Room updatedRoom) throws RoomNotFound {
        roomService.updateRoomById(id, updatedRoom);
    }

    @DeleteMapping("/{id}")
    public void deleteRoomById(@PathVariable("id") Long id){
        roomService.deleteRoomById(id);
    }

}

