package aplication;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoimplJDBC;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args){
        Department dp = new Department(1, "Books");
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findbyld(3);
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartmet(department);
        System.out.println(seller);

        for(Seller seller1: sellers){
            System.out.println(seller1);
        }

        List<Seller> sellers2 = sellerDao.findAll();
        System.out.println();

        for(Seller seller1: sellers2){
            System.out.println(seller1);
        }

        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        //sellerDao.insert(newSeller);
        System.out.println(newSeller.getId());

        System.out.println();

        seller = sellerDao.findbyld(1);
        seller.setName("Marta Waine");
        sellerDao.update(seller);
        System.out.println("Update completo!");

        sellerDao.deletebyld(8);
        System.out.println("Delete completo!");
    }
}
