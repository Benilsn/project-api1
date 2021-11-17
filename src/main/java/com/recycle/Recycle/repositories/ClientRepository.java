package com.recycle.Recycle.repositories;

import com.recycle.Recycle.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

    @Query(value = "SELECT * FROM client", nativeQuery = true)
    List<Client> getAll();


}
