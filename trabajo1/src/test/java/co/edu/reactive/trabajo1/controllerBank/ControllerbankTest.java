package co.edu.reactive.trabajo1.controllerBank;

import co.edu.reactive.trabajo1.controllerbank.ControllerBank;
import co.edu.reactive.trabajo1.model.Users;
import co.edu.reactive.trabajo1.repository.BuyRepository;
import co.edu.reactive.trabajo1.repository.ProductRepository;
import co.edu.reactive.trabajo1.repository.TypeRepository;
import co.edu.reactive.trabajo1.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)
class ControllerbankTest {
    @InjectMocks
    private ControllerBank controllerbank;

    @Mock
    private  UserRepository userRepository;
    @Mock
    private  BuyRepository buyRepository;
    @Mock
    private  TypeRepository typeRepository;
    @Mock
    private  ProductRepository productRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void userFindIdTest (){
      /*  Users users = new Users(22,1,"12233332","nombre");
        when(userRepository.findById(anyInt())).thenReturn(Mono.just(users));
        StepVerifier.create(controllerbank.getUserById(22))
                .expectNext()
                .verifyComplete();
*/
    }
}
