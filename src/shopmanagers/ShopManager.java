/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmanagers;

import entity.Info;
import entity.InfoWorker;
import entity.Product;
import java.util.Scanner;
import entity.Worker;
/**
 *
 * @author Nikita
 */
public class ShopManager {
    private Scanner scanner;
    
    public ShopManager() {
        this.scanner = new Scanner(System.in);
    }
    
    public Product createProduct(){
        Product product = new Product();
        System.out.print("Введите название продукта: ");
        product.setTitle(scanner.nextLine());
        product.setInfos(createInfos());
        return product;
    }
    
    private Info[] createInfos() {
        Info[] infos = new Info[1];
        for (int i = 0; i < 1; i++) {
            Info info = new Info();
            System.out.print("Цена продукта: ");
            info.setPrice(scanner.nextLine());
            System.out.print("Дата оканчания срока годности: ");
            info.setExpirationDate(scanner.nextLine());
            System.out.print("Введите количество товара: ");
            info.setCountProductInShop(scanner.nextLine());
            System.out.print("Введите скидку на товар: ");
            info.setDiscount(scanner.nextLine());
            infos[i] = info;
        }
        return infos;
    }
    
    public Worker createWorker(){
        Worker worker = new Worker();
        System.out.print("Введите имя работника:  ");
        worker.setFirstname(scanner.nextLine());
        System.out.print("Введите фамилию работника:  ");
        worker.setLastname(scanner.nextLine());
        System.out.print("Введите должность работника:  ");
        worker.setJobtitle(scanner.nextLine());
        System.out.print("Введите зарплату работника:  ");
        worker.setSalary(scanner.nextLine());
        return worker;
    }
    
    public void printListProducts(Product[] products){
        
        for (int i = 0; i < products.length; i++) {
                        
                        Product product = products[i];
                        System.out.printf(i+1+". Product{title = %s%n",product.getTitle());
                        System.out.print("\tInfos = [\n");
                        for (int j = 0; j < product.getInfos().length; j++) {
                            Info info = product.getInfos()[j];
                            System.out.printf("\t\tPrice: %s$ \n\t\tExpiration date: %s \n\t\tProduct count: %s t.k \n\t\tDiscount: %s%%%n"
                                    ,info.getPrice(),info.getExpirationDate(),info.getCountProductInShop(),info.getDiscount());
                        }
                        System.out.println("\t]");
                    }
                    System.out.println("   }");
    }
    
    public void printListWorkers(Worker[] workers){
        
        for (int i = 0; i < workers.length; i++) {
                        
                        Worker worker = workers[i];
                        System.out.printf(i+1+". Worker{title = %s%n",worker.getJobtitle());
                        System.out.print("\tInfos = [\n");
                        for (int j = 0; j < worker.getInfosworkers().length; j++) {
                            InfoWorker infoworker = worker.getInfosworkers()[j];
                            System.out.printf("\t\tFirst name: %s \n\t\tLast name: %s \n\t\tSalary worker: %s$ \n"
                                    ,infoworker.getFirstname(), infoworker.getLastname(), infoworker.getSalary());
                        }
                        System.out.println("\t]");
                    }
                    System.out.println("   }");
    }

    public void printListWorkers(Product[] products) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
