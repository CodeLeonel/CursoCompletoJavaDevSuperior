package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: department findById =====");
		Department department = departmentDao.findById(2);

		System.out.println(department);

		System.out.println("=== TEST 3: department findByAll =====");
		List<Department> listAll = departmentDao.findAll();
		listAll.forEach(System.out::println);

		System.out.println("=== TEST 4: department insert =====");
		Department newDep = new Department(null, "Music");
		departmentDao.insert(newDep);
		System.out.println(newDep);

		System.out.println("=== TEST 5: department update =====");
		department = departmentDao.findById(1);
		department.setName("Food");
		departmentDao.update(department);
		System.out.println("Update completed");
		System.out.println(department);
		department.setName("Computers");
		departmentDao.update(department);
		System.out.println("Update completed");
		System.out.println(department);

		System.out.println("=== TEST 6: department delete =====");
		System.out.print("Enter id for delete test: ");
		int id = scan.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");

		scan.close();
	}

}
