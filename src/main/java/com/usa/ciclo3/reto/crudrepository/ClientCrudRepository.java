package com.usa.ciclo3.reto.crudrepository;

import com.usa.ciclo3.reto.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Client,Integer> {
}