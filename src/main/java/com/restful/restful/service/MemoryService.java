package com.restful.restful.service;

import com.restful.restful.model.Memory;
import java.util.List;
import java.util.Optional;

public interface MemoryService {

    List<Memory> findAll();

    Optional<Memory> findById(Integer id);

    Memory save(Memory memory);

    void deleteById(Integer id);
}