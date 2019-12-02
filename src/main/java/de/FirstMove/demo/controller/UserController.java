package de.FirstMove.demo.controller;

//import de.FirstMove.demo.UserService.UserService;
import de.FirstMove.demo.UserService.UserService;
import de.FirstMove.demo.entity.User;
import de.FirstMove.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.jnlp.UnavailableServiceException;
import javax.jws.soap.SOAPBinding;
import javax.transaction.Transactional;
import java.util.*;

@RestController
public class UserController {

    User super_user = new User();
    @Autowired
    UserRepository userRepository;
    //////////////////////////////////////////////////////////////////
    ///////// HTTP Requests für Frontend /////////////////////////////
    //////////////////////////////////////////////////////////////////

    //Getter für Stadtname in Show-Preference View
    @GetMapping(path = "/api/user")
    public String GetCity(){
        return super_user.getCity();
    }

    //Stadtname von Home in User ablegen für Getter Stadtname
    @PostMapping(path = "/api/user", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User getCity(@RequestBody User new_user){
        super_user.setCity(new_user.getCity());
        return super_user;
    }
    /*@GetMapping(path = "/api/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public User GetCity(){
        return user;
    }*/


    //////////////////////////////////////////////////////////////////
    ////////////// TEST Funktionen aus dem Tutorial //////////////////
    //////////////////////////////////////////////////////////////////

    @GetMapping(path = "/person/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserById (@PathVariable("id") Integer id){

        List<User> allUser = getUserList();
        for (User u:allUser) {
            if(id == u.getId())
            {
                UserService userService = new UserService();
                userService.locate_city_area(u);
                return u;
            }
        }
        User a = null;
        return a;
    }
    @GetMapping(path = "/person", produces = MediaType.APPLICATION_JSON_VALUE)
    @Cacheable("user")
    public List<User> getUserList(){
        List<User> userList = userRepository.findAll();
        return userList;
    }
    @PostMapping(path = "/person", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public User saveUser(@RequestBody User user){

        return userRepository.save(user);
    }
    @PutMapping(path = "/person", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Transactional
    public User updateUser (@RequestBody User user){

        User new_user = userRepository.getOne(user.getId());
        new_user.setId(user.getId());
        new_user.setName(user.getName());
        new_user.setSurname(user.getSurname());
        new_user.setCity(user.getCity());

        return userRepository.saveAndFlush(new_user);
    }
    @DeleteMapping("/person/{id}")
    public void deleteUser (@PathVariable("id") Integer id){

        userRepository.deleteById(id);
    }


}