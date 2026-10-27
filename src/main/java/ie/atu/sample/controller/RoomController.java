
package ie.atu.sample.controller;

import ie.atu.sample.model.Room;
import ie.atu.sample.repository.RoomRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    private final RoomRepository roomRepository;

    public RoomController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @GetMapping
    public List<Room> getRooms() {
        return roomRepository.findAll();
    }

    @GetMapping("/{id}")
    public Room getRoom(@PathVariable Long id) {

        return roomRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Room not found"));
    }
}

