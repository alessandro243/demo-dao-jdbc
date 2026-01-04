package aplication;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoimplJDBC;

import java.util.Date;

public class Program {
    public static void main(String[] args){
        Department dp = new Department(1, "Books");
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findbyld(3);
        System.out.println(seller);
        System.out.println(dp);
        System.out.println(seller.getDepartment());
    }
}
