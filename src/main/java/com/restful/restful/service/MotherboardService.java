package com.restful.restful.service;



import com.restful.restful.model.Motherboard;

import java.util.List;
import java.util.Optional;

public interface MotherboardService {

    List<Motherboard> findAll();

    Optional<Motherboard> findById(Integer id);

    Motherboard save(Motherboard motherboard);

    void deleteById(Integer id);
}
