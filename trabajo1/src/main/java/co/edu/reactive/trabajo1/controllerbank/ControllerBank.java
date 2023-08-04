package co.edu.reactive.trabajo1.controllerbank;

import co.edu.reactive.trabajo1.model.Buy;
import co.edu.reactive.trabajo1.model.Product;
import co.edu.reactive.trabajo1.model.Type;
import co.edu.reactive.trabajo1.model.Users;
import co.edu.reactive.trabajo1.repository.BuyRepository;
import co.edu.reactive.trabajo1.repository.ProductRepository;
import co.edu.reactive.trabajo1.repository.TypeRepository;
import co.edu.reactive.trabajo1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bank")
@RequiredArgsConstructor
public class ControllerBank {
    private final UserRepository userRepository;
    private final BuyRepository buyRepository;
    private final TypeRepository typeRepository;
    private final ProductRepository productRepository;

    @GetMapping("/user/{id}")
    public Mono<Users> getUserById(@PathVariable Integer id){
        System.out.println("Errror");
        return userRepository.findById(id)
                .doOnNext(System.out::println);
    }

    @GetMapping("/user")
    public Flux<Users> getUserAll(){
        return userRepository.findAll();
    }

    @PostMapping("/user/create")
    public Mono<Users> setUser (@RequestBody Users user){
        return userRepository.save( user);
    }

    @PutMapping("/user/update")
    public Mono<Users> updateUser (@RequestBody Users user){
        return userRepository.save(user);
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
    public Mono<Type> getTypeById(@PathVariable Integer id){
        return typeRepository.findById(id);
    }

    @GetMapping("/type")
    public Flux<Type> getTypeAll(){
        return typeRepository.findAll();
    }

    @GetMapping("/product/{id}")
    public Mono<Product> getProductById(@PathVariable Integer id){
        return productRepository.findById(id);
    }

    @GetMapping("/product")
    public Flux<Product> getProductAll(){
        return productRepository.findAll();
    }

}
