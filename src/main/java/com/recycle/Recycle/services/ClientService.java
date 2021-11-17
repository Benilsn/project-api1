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

        for (Client c : clientRepository.findAll()){
            list.add(convert(c));
        }
        return list;
    }

    public ClientDTO getById(Integer id){
        return convert(clientRepository.getById(id));
    }


    public void addClient(ClientDTO cd){
        var client = new Client();
        client.setClientId(cd.getClientId());
        client.setFirstName(cd.getFirstName());
        client.setLastName(cd.getLastName());
        client.setAge(cd.getAge());
        client.setEmail(cd.getEmail());

        clientRepository.save(client);
    }

}
