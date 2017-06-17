package com.umnix.phonebook.service;

import com.umnix.phonebook.model.TrackFile;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MusicServiceImpl implements MusicService {

    @Override
    public TrackFile getTrackFile() {
        try {
            String fullPath = "";
            File file = new File(fullPath);

            HttpHeaders respHeaders = new HttpHeaders();
            respHeaders.setContentType(MediaType.ALL);
            respHeaders.setContentLength(file.length());
            respHeaders.setContentDispositionFormData("attachment", "fileName.mp3");

            return new TrackFile(new InputStreamResource(new FileInputStream(file)),
                                 respHeaders);

        } catch(FileNotFoundException e) {
            System.out.println(e);
            return null;
        } finally {
            System.out.println(this);
        }

    }

    @Override
    public void getTrackParts() {

    }
}
