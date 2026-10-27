package ie.atu.sample;

import ie.atu.sample.model.Room;
import ie.atu.sample.repository.RoomRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RoomDataLoader implements CommandLineRunner {

    private final RoomRepository roomRepository;

    public RoomDataLoader(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public void run(String... args) {

        if (roomRepository.count() > 0) {
            return;
        }

        Room room1 = new Room();
        room1.setName("Lab 201");
        room1.setCapacity(24);
        roomRepository.save(room1);

        Room room2 = new Room();
        room2.setName("Meeting Room 3");
        room2.setCapacity(10);
        roomRepository.save(room2);

        Room room3 = new Room();
        room3.setName("Seminar 14");
        room3.setCapacity(40);
        roomRepository.save(room3);
    }
}