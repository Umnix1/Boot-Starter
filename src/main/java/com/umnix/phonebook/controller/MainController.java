package com.umnix.phonebook.controller;

import com.umnix.phonebook.model.TrackFile;
import com.umnix.phonebook.model.User;
import com.umnix.phonebook.service.MusicService;
import com.umnix.phonebook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    UserService userService;
    @Autowired
    MusicService musicService;

    // -------------------Retrieve All Users---------------------------------------------
    @RequestMapping(
            value = "/user/",
            method = RequestMethod.GET
    )
    public ResponseEntity<List<User>> findAllUsers() {
        List<User> users = userService.findAllUsers();
        if (users.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }


    @RequestMapping(
            value = "/get/{trackId}/parts",
            method = RequestMethod.GET
    )
    @ResponseBody
    public ResponseEntity<InputStreamResource> getFullTrack(
            @PathVariable Integer trackId
    ) {

        TrackFile tf = musicService.getTrackFile();
        HttpStatus status;
        if (null == tf.getIsr()){
            status = HttpStatus.BAD_REQUEST;
        } else {
            status = HttpStatus.OK;
        }

        return new ResponseEntity<>(
                tf.getIsr(),
                tf.getHeaders(),
                status);
    }



}
