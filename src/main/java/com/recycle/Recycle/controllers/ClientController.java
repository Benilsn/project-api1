package com.recycle.Recycle.controllers;


import com.recycle.Recycle.DTO.ClientDTO;
import com.recycle.Recycle.models.Client;
import com.recycle.Recycle.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/")
    public ResponseEntity<List<ClientDTO>> getAllClients() {

        if (!clientService.getAll().isEmpty()) {
            return new ResponseEntity<>(clientService.getAll(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientDTO> getById(@PathVariable Integer id){

        if (clientService.getById(id) != null){
            return new ResponseEntity<>(clientService.getById(id), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/")
    public void addClient(@RequestBody ClientDTO clientDTO){


        clientService.addClient(clientDTO);

    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        if (clientService.checkIfExists(id)){
            clientService.deleteById(id);
        }else{
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public void updateClient(@PathVariable Integer id, @RequestBody ClientDTO c){

        if (clientService.checkIfExists(c.getClient_id())){
            clientService.updateById(c);
        }else{
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
