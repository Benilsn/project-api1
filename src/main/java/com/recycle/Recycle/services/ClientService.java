package com.recycle.Recycle.services;

import com.recycle.Recycle.DTO.ClientDTO;
import com.recycle.Recycle.config.SecurityConfig;
import com.recycle.Recycle.models.Client;
import com.recycle.Recycle.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    protected ClientRepository clientRepository;

    public ClientDTO findById(Integer id){
        var client = clientRepository.findById(id);

        if (client.isPresent()){
            return ClientDTO.convert(client.get());
        }else{
            return null;
        }
    }

    public List<ClientDTO> getAll(){
        List<ClientDTO> list = new ArrayList<>();

        for (Client c : clientRepository.findAll()){
            list.add(ClientDTO.convert(c));
        }
        return list;
    }

    public ClientDTO getById(Integer id){
        return ClientDTO.convert(clientRepository.getById(id));
    }

    public void addClient(ClientDTO cd){

        var client = new Client();
        client.setFirstName(cd.getFirstName());
        client.setLastName(cd.getLastName());
        client.setAge(cd.getAge());
        client.setEmail(cd.getEmail());
        client.setRole(cd.getRole());
        client.setUserName(cd.getUserName());
        client.setUserPassword(SecurityConfig.hashPassword(cd.getUserPassword()));

        clientRepository.save(client);
    }

    public void deleteById(Integer id){
        clientRepository.deleteById(id);
    }

    public void updateById(ClientDTO c){

        var client = clientRepository.findById(c.getClientId()).get();

        client.setClientId(c.getClientId());
        client.setFirstName(c.getFirstName());
        client.setLastName(c.getLastName());
        client.setAge(c.getAge());
        client.setEmail(c.getEmail());

        clientRepository.save(client);

    }
}
