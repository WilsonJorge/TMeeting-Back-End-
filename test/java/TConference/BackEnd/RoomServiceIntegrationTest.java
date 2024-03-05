package TConference.BackEnd;

import TConference.BackEnd.model.Room;
import TConference.BackEnd.repository.RoomRepository;
import TConference.BackEnd.service.RoomService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RoomServiceIntegrationTest {

    @Autowired
    public RoomService roomService;

    @Autowired

    private RoomRepository roomRepository;

    @Test
    void testPutAllRooms() {

        Room room1 = new Room("Room A", 10, "Available");
        Room room2 = new Room("Room B", 20, "Available");

        if (roomService.getAllRooms().size() != 0) {
            roomService.createRoom(room1);
            roomService.createRoom(room2);
        }

    }

    @Test
    void testGetAllRooms() {

        List<Room> rooms = roomService.getAllRooms();
        //assertEquals(2, rooms.size());
    }
}

