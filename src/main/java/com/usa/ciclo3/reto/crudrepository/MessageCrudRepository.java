package com.usa.ciclo3.reto.crudrepository;

import com.usa.ciclo3.reto.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message,Integer> {
}
