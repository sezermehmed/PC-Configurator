package com.restful.restful.service;
import com.restful.restful.model.Cpu;


import java.util.List;
import java.util.Optional;

public interface CpuService {

    List<Cpu> findAll();

    Optional<Cpu> findById(Integer id);

    Cpu save(Cpu cpu);

    void deleteById(Integer id);
}