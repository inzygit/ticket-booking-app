package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.HomeModel;

@Repository
public interface HomeRepository extends JpaRepository<HomeModel, Long>{

}

//				extends
//jpa(methods crud) ----> repo --->
//long ---> Long

//interface A extends B{
//
//	public static void main(String[] args) {
//		A a  = new A() {
//			
//			@Override
//			public void add() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
//	}
//	
//}
//
//interface B{
//	void add();
//}