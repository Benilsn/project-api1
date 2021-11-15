package com.recycle.Recycle.models;

import lombok.*;
import javax.persistence.Column;
import javax.persistence.Id;

@Setter
@Getter
@RequiredArgsConstructor
public class Client {

    @Id
    private int clientId;

    @Column(table = "firstName")
    private String firstName;

    @Column(table = "lastName")
    private String lastName;

    @Column(table = "age")
    private int age;

    @Column(table = "email")
    private String email;
    

}
