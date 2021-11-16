package com.recycle.Recycle.services;

import com.recycle.Recycle.models.Client;
import com.recycle.Recycle.repositories.ClientRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }


    public Client getClientById(Long id){
        return clientRepository.getById(id);
    }
}
