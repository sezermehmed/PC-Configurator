package com.restful.restful.service;



import com.restful.restful.model.Motherboard;
import com.restful.restful.repository.MotherboardRepository;
import com.restful.restful.service.MotherboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotherboardServiceImpl implements MotherboardService {

    @Autowired
    private MotherboardRepository motherboardRepository;

    @Override
    public List<Motherboard> findAll() {
        return motherboardRepository.findAll();
    }

    @Override
    public Optional<Motherboard> findById(Integer id) {
        return motherboardRepository.findById(Long.valueOf(id));
    }

    @Override
    public Motherboard save(Motherboard motherboard) {
        return motherboardRepository.save(motherboard);
    }

    @Override
    public void deleteById(Integer id) {
        motherboardRepository.deleteById(Long.valueOf(id));
    }
}
