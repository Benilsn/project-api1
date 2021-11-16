package com.recycle.Recycle.controllers;

import com.recycle.Recycle.models.Client;
import com.recycle.Recycle.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping(path = "/")
    public List<Client> getAllClients(){
        return clientService.getAll();
    }

}
