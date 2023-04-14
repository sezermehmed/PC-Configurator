package com.restful.restful.controller;

import com.restful.restful.model.Cpu;
import com.restful.restful.service.CpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cpu")
public class CpuController {

    @Autowired
    private CpuService cpuService;

    @GetMapping
    public List<Cpu> findAll() {
        return cpuService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Cpu> findById(@PathVariable Integer id) {
        return cpuService.findById(id);
    }

    @PostMapping
    public Cpu save(@RequestBody Cpu cpu) {
        return cpuService.save(cpu);
    }

    @PutMapping("/{id}")
    public Cpu update(@PathVariable Integer id, @RequestBody Cpu cpu) {
        cpu.setId(id);
        return cpuService.save(cpu);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        cpuService.deleteById(id);
    }
}