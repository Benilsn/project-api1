package com.recycle.Recycle.controllers;

import com.recycle.Recycle.models.Client;
import com.recycle.Recycle.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @GetMapping("/{id}")
    public Client getById(@PathVariable(value = "{id}") Long id){
        return clientService.getClientById(id);
    }
}
