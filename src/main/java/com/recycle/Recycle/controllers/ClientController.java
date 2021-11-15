package com.recycle.Recycle.controllers;

import com.recycle.Recycle.models.Client;

import org.springframework.http.HttpStatus;import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@RequestMapping("/client")
public class ClientController {

    @GetMapping("/")
    public ResponseEntity<Client> getById(@RequestBody Integer id){
        return new ResponseEntity("clientService.getById(id)", HttpStatus.ACCEPTED);
    }
}
