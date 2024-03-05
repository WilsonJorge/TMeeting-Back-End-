package TConference.BackEnd;

import TConference.BackEnd.model.Room;
import TConference.BackEnd.repository.RoomRepository;
import TConference.BackEnd.service.RoomService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoomServiceTest {

    @Mock
    private RoomRepository roomRepository;

    @InjectMocks
    private RoomService roomService;

    public RoomServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllRooms() {
        // Simula o comportamento do repositório
        Mockito.when(roomRepository.findAll()).thenReturn(Arrays.asList(new Room(), new Room()));

        List<Room> rooms = roomService.getAllRooms();

        // Verifica se a lista contém dois elementos
        assertEquals(2, rooms.size());
    }

    // Outros testes para os métodos de serviço podem ser adicionados aqui
}

