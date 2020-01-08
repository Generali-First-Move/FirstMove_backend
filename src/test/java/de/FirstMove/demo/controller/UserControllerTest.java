package de.FirstMove.demo.controller;

import de.FirstMove.demo.UserService.UserService;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class UserControllerTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(UserController.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Autowired
    private UserService userService;


    @Test
    public void getCity() throws Exception {

    }

    @Test
    public void postCity() {
    }

    @Test
    public void addPreferences() {
    }

    @Test
    public void getFullUser() {
    }

    @Test
    public void user_to_service() {
    }

    @Test
    public void getUserList() {
    }

    @Test
    public void saveUser() {
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void deleteUser() {
    }
}
