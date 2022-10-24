/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmanagers;

import entity.Info;
import entity.InfoCustomer;
import entity.Product;
import java.util.Scanner;
import entity.Customer;
/**
 *
 * @author Nikita
 */
public class ShopManager {
    private Scanner scanner;
    
    public ShopManager() {
        this.scanner = new Scanner(System.in);
    }
    
//    public Customer createCustomer(){
//        Customer customer = new Customer();
//        System.out.print("Введите имя и фамилию покупателя: ");
//        customer.setName(scanner.nextLine());
//        customer.setInfoscustomers(createInfoCustomers());
//        return customer;
//    }
    
    public Product createProduct(){
        Product product = new Product();
        System.out.print("Введите название продукта: ");
        product.setTitle(scanner.nextLine());
        System.out.print("Введите количество товара: ");
        product.setCountProductInShop(scanner.nextLine());
        System.out.print("Введите произвотителя товара: ");
        product.setFabricator(scanner.nextLine());
        return product;
    }
    
     public Customer createCustomer(){
        Customer customer = new Customer();
        System.out.print("Введите имя и фамилию покупателя: ");
        customer.setName(scanner.nextLine());
        System.out.print("Введте количество денег у покупателя: ");
        customer.setCash(scanner.nextLine());
        System.out.print("Введите телефон покупателя: ");
        customer.setTelephone(scanner.nextLine());
        return customer;
    }
    
    public void printListProducts(Product[] products){
        
        for (int i = 0; i < products.length; i++) {
            System.out.printf("\t\tPrice: %s$ \n\t\tProduct count: %s t.k \n\t\tFabricator: %s.inc"
                ,products[i].getPrice(),products[i].getCountProductInShop(),products[i].getFabricator());
        }               
    }
    
    public void printListCustomers(Customer[] customers){
        for (int i = 0; i < customers.length; i++) {
            System.out.printf("\t\tName: %s$ \n\t\tCash: %s t.k \n\t\tTelephone: %s\n"
                ,customers[i].getName(),customers[i].getCash(),customers[i].getTelephone());
        }   
    }  
    
//    private Customer changeCustomerCash(Customer customer) {
//        System.out.print("Количество денег у покупателя: ");
//        System.out.println(customer.getInfoscustomers().getCash());
//        System.out.print("Изменить название книги? (y/n)");
//        String edit = scanner.nextLine();
//        System.out.println();
//        if(edit.equals("y")){
//            System.out.print("Введите новое название книги: ");
//            book.setTitle(scanner.nextLine());
//        }
//        return book;
//    }

}
