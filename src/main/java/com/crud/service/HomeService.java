package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.controller.HomeConroller;
import com.crud.dto.HomeDto;
import com.crud.model.HomeModel;
import com.crud.repository.HomeRepository;

@Service
public class HomeService {

    private final HomeConroller homeConroller;
	
	@Autowired
	public HomeRepository homeRepository;

    HomeService(HomeConroller homeConroller) {
        this.homeConroller = homeConroller;
    }

	public HomeModel saveOpr(HomeDto homeDto) {
		HomeModel homeModel = new HomeModel();
		homeModel.setAge(homeDto.getAge());
		homeModel.setName(homeDto.getName());
		return homeRepository.save(homeModel);
		
	}

	public List<HomeModel> getAllOpr() {
		return homeRepository.findAll();
	}

	public HomeModel getByIdOpr(long id) {
		return homeRepository.findById(id).get();
	}

	public void deleteByIdOpr(long id) {
		homeRepository.deleteById(id);
	}

	public HomeModel updateByIdOpr(HomeDto homeDto, long id) {
		HomeModel homeModel =  homeRepository.findById(id).get();
		
		
//		{id:2,\
//		"age": "60",
//		"name": "vikram"
//		}
		
//		{"age": "62",
//		"name": "vikram"
//		}
//		
//		
		homeModel.setAge(homeDto.getAge());
		homeModel.setName(homeDto.getName());
//		int a =10;
//		System.out.println(70);
		
		return homeRepository.save(homeModel);
	}
	
	

//	public String display(String input) {
//		return input + "✅";
//	}
	
	
	
}
