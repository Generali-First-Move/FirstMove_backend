package de.FirstMove.demo;

import de.FirstMove.demo.controller.UserController;
import de.FirstMove.demo.entity.Cell;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) { SpringApplication.run(DemoApplication.class, args);



	Cell tmp = new Cell();
	Cell[][] raster_2 = new Cell[20][24];
	raster_2 = tmp.createGrid(50.790819, 6.034769);
	UserController testuser = new UserController();

	testuser.test_kästchen(raster_2);


	}

}
