/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmanagers;

import entity.Product;
import java.util.Scanner;
import entity.Customer;
/**
 *
 * @author Nikita
 */
public class ShopManager {
    private final Scanner scanner;
    
    public ShopManager() {
        this.scanner = new Scanner(System.in);
    }
        
    public Product createProduct(){
        Product product = new Product();
        System.out.print("Введите название продукта: ");
        product.setTitle(scanner.nextLine());
        System.out.print("Введите количество товара: ");
        product.setCountProductInShop(scanner.nextInt());
        System.out.print("Введите произвотителя товара: ");
        product.setFabricator(scanner.nextLine());
        return product;
    }
    
     public Customer createCustomer(){
        Customer customer = new Customer();
        System.out.print("Введите имя и фамилию покупателя: ");
        customer.setName(scanner.nextLine());
        System.out.print("Введте количество денег у покупателя: ");
        customer.setCash(scanner.nextInt());
        System.out.print("Введите телефон покупателя: ");
        customer.setTelephone(scanner.nextLine());
        return customer;
    }
    
    public void printListProducts(Product[] products){
        for (int i = 0; i < products.length; i++) {
            System.out.printf(i+1+". Product{title = %s%n",products[i].getTitle());
            System.out.print("\tInfos = [\n");
            System.out.printf("\t\tPrice: %s$ \n\t\tProduct count: %s t.k \n\t\tFabricator: %s%n"
                    ,products[i].getPrice(),products[i].getCountProductInShop(),products[i].getFabricator());
        }               
    }
    
    public void printListCustomers(Customer[] customers){
        for (int i = 0; i < customers.length; i++) {
            System.out.printf(i+1+". Customer{name = %s%n",customers[i].getName());
            System.out.print("\tInfos = [\n");
            System.out.printf("\t\tCash: %s$ \n\t\tTelephone: %s\n"
                    ,customers[i].getCash(), customers[i].getTelephone());
        }   
    }  

}
