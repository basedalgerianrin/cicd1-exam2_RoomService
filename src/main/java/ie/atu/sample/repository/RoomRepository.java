package ie.atu.sample.repository;

import ie.atu.sample.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository
        extends JpaRepository<Room, Long> {
}
