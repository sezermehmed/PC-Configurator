package com.restful.restful.service;

import com.restful.restful.model.Memory;
import com.restful.restful.repository.MemoryRepository;
import com.restful.restful.service.MemoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemoryServiceImpl implements MemoryService {

    @Autowired
    private MemoryRepository memoryRepository;

    @Override
    public List<Memory> findAll() {
        return memoryRepository.findAll();
    }

    @Override
    public Optional<Memory> findById(Integer id) {
        return memoryRepository.findById(Long.valueOf(id));
    }

    @Override
    public Memory save(Memory memory) {
        return memoryRepository.save(memory);
    }

    @Override
    public void deleteById(Integer id) {
        memoryRepository.deleteById(Long.valueOf(id));
    }
}