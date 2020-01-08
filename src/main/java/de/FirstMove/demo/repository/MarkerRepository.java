package de.FirstMove.demo.repository;


import de.FirstMove.demo.entity.Marker;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MarkerRepository extends JpaRepository<Marker, Integer> {


    /*

        @Modifying
        @Query("Update Marker u Set );
        Integer updateMarker(Integer id, String name, String

             */

}
