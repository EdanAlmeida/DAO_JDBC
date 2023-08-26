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
		
		System.out.println("=== TEST 1: Seller findById ===");
		Seller seller = sellerDao.findById(1);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: Seller findByDepartment ===");
		Department dept = new Department(2, null);
		List<Seller> listSeller = sellerDao.findByDepartment(dept);
		
		for (Seller obj : listSeller) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: Seller findAll ===");
		List<Seller> listAllSellers = sellerDao.findAll();
		
		for (Seller obj : listAllSellers) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: Seller insert ===");
		Seller newSeller = new Seller(null, "Marcelo", "email@gmail.com", new Date(), 4000.0, dept);
		sellerDao.insert(newSeller);
		System.out.println("Inserted. New id = " + newSeller.getId());
		

	}

}
