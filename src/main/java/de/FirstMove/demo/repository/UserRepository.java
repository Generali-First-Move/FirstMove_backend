package de.FirstMove.demo.repository;

import de.FirstMove.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

public interface UserRepository extends JpaRepository<User, Integer> {

  /*  @Modifying
    @Query("UPDATE User u SET u.name = ?2, u.surname = ?3, u.city = ?4 WHERE u.id = ?1")
    Integer updateUser(Integer id, String name, String surname, String city);*/
}
