package com.restful.restful.controller;


import com.restful.restful.model.Memory;

import com.restful.restful.service.MemoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/memory")
public class MemoryController {

    @Autowired
    private MemoryService memoryService;

    @GetMapping
    public List<Memory> findAll() {
        return memoryService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Memory> findById(@PathVariable Integer id) {
        return memoryService.findById(id);
    }

    @PostMapping
    public Memory save(@RequestBody Memory memory) {
        return memoryService.save(memory);
    }

    @PutMapping("/{id}")
    public Memory update(@PathVariable Integer id, @RequestBody Memory memory) {
        memory.setId(id);
        return memoryService.save(memory);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        memoryService.deleteById(id);
    }
}
