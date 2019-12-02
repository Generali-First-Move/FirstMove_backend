package de.FirstMove.demo.UserService;


import de.FirstMove.demo.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String locate_city_area(User user){
        String city_area = "Test_Burtscheid";
        return city_area;
    };

}
