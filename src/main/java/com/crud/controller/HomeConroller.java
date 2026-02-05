package com.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.dto.HomeDto;
import com.crud.model.HomeModel;
import com.crud.service.HomeService;

@CrossOrigin
@RestController
public class HomeConroller {
	
	@Autowired
	HomeService homeService;
	
//	@GetMapping("/msg/{message}")
//	public String messageMethod(@PathVariable String message) {
//		return homeService.display(message);
//	}
	
//	{
//		id: 1,
//		age: 25,
//		name: "Inzamam" 
//	}
	
	/*<html>
	
	<form>
		<label>id</label>
		<input />
		<label>name</label>
		<input  />
	</form>
	
	</html>*/
	
//	{
//		"id" : "1",
//		"name": "inzamam",
//		"age": "25"
//	}
//	Json format
	
//	{
//		id: 2,
//		age: 22,
//		name: "Raja" 
//	}
	
//	class Human{
//		long id;
//		byte age;
//		String name;
//	}
	
//	int a = 4;ost
//	HomeModel a1 = new HomeModel();
	
	@PostMapping("/save")
	public HomeModel saveUser(@RequestBody HomeDto homeDto) {
		return homeService.saveOpr(homeDto);
//		int a =5;
//		return a;
	}
	
//	int add(){
//		return 9;
//	}
	
//	System.out.print();
	
	@GetMapping("/getAll")
	public List<HomeModel> getAllUser(){
		return homeService.getAllOpr();
	}
	
	@GetMapping("/getById/{id}")
	public HomeModel getUserById(@PathVariable long id) {
		return homeService.getByIdOpr(id);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void deleteById(@PathVariable long id) {
		homeService.deleteByIdOpr(id);
	}
	
	@PutMapping("/updateById/{id}")
	public HomeModel updateUser(@RequestBody HomeDto homeDto, @PathVariable long id) {
		return homeService.updateByIdOpr(homeDto,id);
	}
	
	
	
	
	

}
