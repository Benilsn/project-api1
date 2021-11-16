package com.recycle.Recycle.models;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Setter
@Getter
@RequiredArgsConstructor
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(table = "clientId")
    private Long clientId;

    @Column(table = "firstName")
    private String firstName;

    @Column(table = "lastName")
    private String lastName;

    @Column(table = "age")
    private int age;

    @Column(table = "email")
    private String email;


}
