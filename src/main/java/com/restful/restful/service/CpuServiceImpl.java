package com.restful.restful.service;

import com.restful.restful.model.Cpu;
import com.restful.restful.repository.CpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CpuServiceImpl implements CpuService {

    @Autowired
    private CpuRepository cpuRepository;

    @Override
    public List<Cpu> findAll() {
        return cpuRepository.findAll();
    }

    @Override
    public Optional<Cpu> findById(Integer id) {
        return cpuRepository.findById(Long.valueOf(id));
    }

    @Override
    public Cpu save(Cpu cpu) {
        return cpuRepository.save(cpu);
    }

    @Override
    public void deleteById(Integer id) {
        cpuRepository.deleteById(Long.valueOf(id));
    }
}