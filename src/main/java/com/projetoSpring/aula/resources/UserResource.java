package com.projetoSpring.aula.resources;


import com.projetoSpring.aula.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user  = new User(1L,"Itachi","Itachi@gmail.com", "41999","1234567");
        return ResponseEntity.ok().body(user);
    }

}
