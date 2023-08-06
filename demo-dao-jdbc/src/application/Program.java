package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(2);
	
		System.out.println(seller);
		
		System.out.println("=== TEST 2: seller findByDepartment =====");
		Department department = new Department(1,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);
		
		System.out.println("=== TEST 3: seller findByDepartment =====");
		List<Seller> listAll = sellerDao.findAll();
		listAll.forEach(System.out::println);
		
		
	}

}
