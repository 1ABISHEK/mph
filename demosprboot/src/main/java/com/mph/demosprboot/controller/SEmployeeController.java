package com.mph.demosprboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mph.demosprboot.entity.SEmployee;
import com.mph.demosprboot.service.SEmployeeService;

@RestController
@RequestMapping("/demosprboot/semployee")
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
public class SEmployeeController {

	@Autowired
	SEmployeeService sEmployeeService;
	
	@PostMapping("/addemp")
	public ResponseEntity<?> createEmployee(@RequestBody SEmployee employee) {
		sEmployeeService.createEmployee(employee);
		return new ResponseEntity<>(employee,HttpStatus.CREATED);
	}
	
	@GetMapping("/listallemp")
	public ResponseEntity<List<SEmployee>> getAllEmployee() {
		System.out.println("hhhh");
		List<SEmployee> emplist = sEmployeeService.getAllEmployee();
		return ResponseEntity.ok(emplist);
		
	}

	@PutMapping("/updateemp")
	public ResponseEntity<List<SEmployee>> updateEmployee(@RequestBody  SEmployee employee) {
		List<SEmployee> updateEmp = sEmployeeService.updateEmployee(employee);
		return ResponseEntity.ok(updateEmp);
	}

	@DeleteMapping("/deletebyid/{id}")
	public ResponseEntity<List<SEmployee>> deleteEmployee(@PathVariable Long id) {
		List<SEmployee> existinemp=sEmployeeService.deleteEmployee(id);
		return ResponseEntity.ok(existinemp);
	}

	@GetMapping("/getempbyid/{id}")
	public ResponseEntity<Optional<SEmployee>> getEmployee(@PathVariable  Long id) {
		Optional<SEmployee> emp = sEmployeeService.getEmployee(id);
		return ResponseEntity.ok(emp);
	}

	@GetMapping("/findbyname/{name}")
	public ResponseEntity<SEmployee> getEmployeeByName(@PathVariable  String name) {
		SEmployee emp = sEmployeeService.getEmployeeByName(name);
		return ResponseEntity.ok(emp);
	}

	
}
