package com.recycle.Recycle.services;

import com.recycle.Recycle.models.Client;
import com.recycle.Recycle.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAll(){
        return clientRepository.getAll();
    }


    public Client getClientById(Integer id){
        return clientRepository.getById(id);
    }
}
