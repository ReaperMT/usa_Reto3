package com.usa.ciclo3.reto.service;

import com.usa.ciclo3.reto.model.Box;
import com.usa.ciclo3.reto.repository.BoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoxService {
    @Autowired
    private BoxRepository boxRepository;

    public List<Box> getAll() {return boxRepository.getAll();}

    public Optional<Box> getBox(int id) { return boxRepository.getBox(id);}

    public Box save (Box box) {
        if(box.getId() == null){
            return boxRepository.save(box);
        }else{
            Optional<Box> tmpBox = boxRepository.getBox(box.getId());
            if (tmpBox.isEmpty()){
                return boxRepository.save(box);
            }else {
                return box;
            }
        }
    }

    public Box update (Box box){
        if (box.getId() !=null){
            Optional<Box> tmpBox = boxRepository.getBox(box.getId());
            if (!tmpBox.isEmpty()){
                return boxRepository.save(box);
            }
        }return box;
    }

    public boolean deleteBox(int id){
        Boolean result = getBox(id).map(box -> {boxRepository.delete(box); return true; }).orElse(false);
        return result;
    }
}
