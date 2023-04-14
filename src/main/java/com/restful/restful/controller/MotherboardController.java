package com.restful.restful.controller;



import com.restful.restful.model.Motherboard;
import com.restful.restful.service.MotherboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/motherboard")
public class MotherboardController {

	@Autowired
	private MotherboardService motherboardService;

	@GetMapping
	public List<Motherboard> findAll() {
		return motherboardService.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Motherboard> findById(@PathVariable Integer id) {
		return motherboardService.findById(id);
	}

	@PostMapping
	public Motherboard save(@RequestBody Motherboard motherboard) {
		return motherboardService.save(motherboard);
	}

	@PutMapping("/{id}")
	public Motherboard update(@PathVariable Integer id, @RequestBody Motherboard motherboard) {
		motherboard.setId(Long.valueOf(id));
		return motherboardService.save(motherboard);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Integer id) {
		motherboardService.deleteById(id);
	}
}
