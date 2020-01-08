package de.FirstMove.demo.MarkerService;

import de.FirstMove.demo.entity.Marker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service

public class MarkerService {

    List<Marker> markerList = new ArrayList<Marker>(Arrays.asList(
            // new Marker(1, "marker1", 50.0, 7.0, 50.0, 7.0, 0, 0, 0, 17, 2500),
            // new Marker(2, "marker2", 51.0, 8.0, 51.0, 8.0, 1, 0, 0, 17, 2500)
            //new Marker(0, " ", 0.0, 0.0, 0.0, 0.0, 0, 0, 0, 0, 0)
   // new Marker()
    ));


    public List<Marker> getAllMarkers() {
        return markerList;
    }


    public Marker getMarker(Integer id) {
        return markerList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }


    public void addMarker(Marker marker) {
        markerList.add(marker);
    }

    public void updateMarker(Marker mar, Integer id) {

        for (int i = 0; i < markerList.size(); i++) {
            Marker marker = markerList.get(i);
            if (marker.getId().equals(id)) {
                markerList.set(i, mar);
            }
        }
    }

    public void deleteMarker(Integer id) {
        markerList.removeIf(t -> t.getId().equals(id));

    }
}
