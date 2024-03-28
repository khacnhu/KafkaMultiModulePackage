package com.example.cabbookuser.controller;

import com.example.cabbookuser.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/location")
public class CabLocationController {

    @Autowired
    private CabLocationService cabLocationService;


    @PutMapping
    public ResponseEntity<?> updateLocation() throws InterruptedException {
        int range = 20;

        while (range > 0) {
//            System.out.println(Math.random() + " , " + Math.random());
            cabLocationService.updateLocation("cuoc song khong nhu la mo");
            Thread.sleep(1000);
            range--;
        }

        return new ResponseEntity<>(Map.of("message", "location new"),  HttpStatus.OK);
    }




}
