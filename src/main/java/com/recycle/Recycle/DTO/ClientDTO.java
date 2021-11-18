package com.recycle.Recycle.DTO;

import com.recycle.Recycle.models.Client;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClientDTO {

    private Integer clientId;

    private String firstName;

    private String lastName;

    private int age;

    private String email;

    public static ClientDTO convert(Client c){

        ClientDTO clientdto = new ClientDTO();

        clientdto.setClientId(c.getClientId());
        clientdto.setFirstName(c.getFirstName());
        clientdto.setLastName(c.getLastName());
        clientdto.setEmail(c.getEmail());

        return clientdto;
    }
}
