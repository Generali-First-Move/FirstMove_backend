package de.FirstMove.demo.controller;

import de.FirstMove.demo.MarkerService.MarkerService;
import de.FirstMove.demo.entity.Marker;
import de.FirstMove.demo.repository.MarkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/api")

public class MarkerContoller {

    /* Test classes für GoogleMarker
    Marker super_marker = new Marker();
    @Autowired
   MarkerRepository markerRepository;

    @RequestMapping(method = RequestMethod.POST, value="/result")

    public Marker SetMarker(@RequestBody Marker new_marker) {
        super_marker.setMarker(new_marker.getMarker());
        return super_marker;
    }


    @RequestMapping(method = RequestMethod.POST, value="/result")

    public Marker SetMarker(@RequestBody Marker new_marker) {
        super_marker.setMarker(new_marker.getMarker());
        return super_marker;
    }

@PostMapping(path = "/result/view")
public Marker setMarker(@RequestBody Marker new_marker) {
    super_marker = new_marker;
    markerRepository.save(super_marker);
    return super_marker;
}


    @GetMapping(path = "/result/view")
    public Marker GetFullMarker() {
        return super_marker;
    }
*/
    //////////////////////////////////////////////////////////////////
    ///////// Marker Service  Frontend /////////////////////////////
    //////////////////////////////////////////////////////////////////
    @Autowired
    MarkerService markerService;

    @RequestMapping("/markers")
    public List<Marker> getAllMarkers() {
        return markerService.getAllMarkers();
    }

    @RequestMapping("/markers/{id}")
    public Marker getMarker(@PathVariable Integer id) {
        return markerService.getMarker(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/markers")
    public void addMarker(@RequestBody Marker marker) {
        markerService.addMarker(marker);

    }
/*
    @RequestMapping(method = RequestMethod.PUT, value = "/markers/{id}")
    public void updateMarker(@RequestBody Marker marker, @PathVariable Integer id) {
        markerService.updateMarker(marker, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/markers/{id}")
    public void deleteMarker(@PathVariable Integer id) {
        markerService.deleteMarker(id);
    }

*/
    //////////////////////////////////////////////////////////////////
    ///////// HTTP Requests für Frontend /////////////////////////////
    //////////////////////////////////////////////////////////////////

    // Getter für Marker in  Result View

    //@GetMapping(path = "/result")
    @RequestMapping(method = RequestMethod.GET, value="/result")
    public List<Marker> getMarker() {
        return markerService.getAllMarkers();
    }

    // Marker setzen

    //@PostMapping(path = "/result")
    @RequestMapping(method = RequestMethod.POST, value="/result")
/*
    public Marker SetMarker(@RequestBody Marker new_marker) {
        super_marker.setMarker(new_marker.getMarker());
        return super_marker;
    }
*/

public void SetMarker(@RequestBody Marker new_marker)
    {
        markerService.addMarker(new_marker);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/result/{id}")
    public void updateMarker(@RequestBody Marker marker, @PathVariable Integer id) {
        markerService.updateMarker(marker, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/result/{id}")
    public void deleteMarker(@PathVariable Integer id) {
        markerService.deleteMarker(id);
    }

}