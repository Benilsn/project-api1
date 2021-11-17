package com.recycle.Recycle.services;

import com.recycle.Recycle.DTO.ClientDTO;
import com.recycle.Recycle.models.Client;
import com.recycle.Recycle.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public ClientDTO convert(Client c){

        ClientDTO clientdto = new ClientDTO();
        clientdto.setClientId(c.getClientId());
        clientdto.setFirstName(c.getFirstName());
        clientdto.setLastName(c.getLastName());
        clientdto.setEmail(c.getEmail());

        return clientdto;
    }

    public List<ClientDTO> getAll(){

        List<ClientDTO> list = new ArrayList<>();

        if (!clientRepository.getAll().isEmpty()){
            for (Client c : clientRepository.getAll()){
                list.add(convert(c));
            }
        }
        return list;
    }

}
