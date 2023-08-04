package co.edu.reactive.trabajo1.controllerbank;

import co.edu.reactive.trabajo1.model.Buy;
import co.edu.reactive.trabajo1.model.User;
import co.edu.reactive.trabajo1.repository.BuyRepository;
import co.edu.reactive.trabajo1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping("/bank")
@RequiredArgsConstructor
public class ControllerBank {
    private final UserRepository userRepository;
    private final BuyRepository buyRepository;

    @GetMapping("/user/{id}")
    public Mono<User> getUserById(@PathVariable Integer id){
        return userRepository.findById(id);
    }

    @GetMapping("/user")
    public Flux<User> getUserAll(){
        return userRepository.findAll();
    }

    @PostMapping("/user/create")
    public Mono<User> setUser (@RequestBody User user){
        return userRepository.save( user);
    }

    @GetMapping("/buy/{id}")
    public Mono<Buy> getBuyById(@PathVariable Integer id){
        return buyRepository.findById(id);
    }

    @GetMapping("/buy")
    public Flux<Buy> getBuyAll(){
        return buyRepository.findAll();
    }

    @GetMapping("/type/{id}")
    public Mono<Buy> getTypeById(@PathVariable Integer id){
        return buyRepository.findById(id);
    }

    @GetMapping("/type")
    public Flux<Buy> getTypeAll(){
        return buyRepository.findAll();
    }

    @GetMapping("/product/{id}")
    public Mono<Buy> getProductById(@PathVariable Integer id){
        return buyRepository.findById(id);
    }

    @GetMapping("/product")
    public Flux<Buy> getProductAll(){
        return buyRepository.findAll();
    }

}
