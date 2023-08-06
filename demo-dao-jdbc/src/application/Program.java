package application;

import java.util.Date;
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
		Department department = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);

		System.out.println("=== TEST 3: seller findByAll =====");
		List<Seller> listAll = sellerDao.findAll();
		listAll.forEach(System.out::println);

//		System.out.println("=== TEST 4: seller insert =====");
//		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
//		sellerDao.insert(newSeller);
//		System.out.println(newSeller);

		System.out.println("=== TEST 5: seller update =====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
		System.out.println(seller);
		seller.setName("Bob Brown");
		sellerDao.update(seller);
		System.out.println("Update completed");
		System.out.println(seller);
		
		

	}

}
