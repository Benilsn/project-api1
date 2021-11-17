package com.recycle.Recycle.DTO;

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

}
