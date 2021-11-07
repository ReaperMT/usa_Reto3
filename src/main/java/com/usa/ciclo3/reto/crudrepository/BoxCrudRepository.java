package com.usa.ciclo3.reto.crudrepository;

import com.usa.ciclo3.reto.model.Box;
import com.usa.ciclo3.reto.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface BoxCrudRepository extends CrudRepository<Box, Integer> {
}