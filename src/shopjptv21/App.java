/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopjptv21;


import entity.Product;
import entity.Customer;

import java.util.Arrays;
import java.util.Scanner;
import shopmanagers.ShopManager;

/**
 *
 * @author Nikita
 */
public class App {
    private Customer[] customers;
    private Product[] products;
    int history[];
    private Customer[] productsCustomer;
    private final ShopManager shopManager;

    public App() {
        this.customers = new Customer[0];
        this.products = new Product[0];
        this.history = new int[0];
        shopManager = new ShopManager();
        testAddProduct();
        testAddCustomer();
    }
    
    public void run(){
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Список задач магазина: ");
            System.out.println("0. Закрыть приложение");
            System.out.println("1. Добавить продукт");
            System.out.println("2. Список продоваемых товаров");
            System.out.println("3. Добавить покупателя");
            System.out.println("4. Список зарегестрированных покупателей");
            System.out.println("5. Покупка покупателем продукта");
            System.out.println("6. Доход магазина за все время");
            System.out.println("7. Добавить денег покупателю");
            System.out.print("Выберите номер задачи: ");
            int task = scanner.nextInt();
            scanner.nextLine();
            System.out.println("____________________");
            switch (task) {
                case 0:
                    repeat = false;
                    System.out.println("Задача 0. Закрыть приложение");
                    break;
                case 1:
                    System.out.println("Задача 1. Добавить продукт");
                    this.products = Arrays.copyOf(this.products, this.products.length+1);
                    this.products[this.products.length-1] = shopManager.createProduct();
                    break;
                case 2:
                    System.out.println("Задача 2. Список товаров");
                    shopManager.printListProducts(products);              
                    break;                
                case 3:
                    System.out.println("Задача 3. Добавить покупателя");
                    this.productsCustomer = Arrays.copyOf(this.productsCustomer, this.productsCustomer.length+1);
                    this.productsCustomer[this.productsCustomer.length-1] = shopManager.createCustomer();
                    break;
                case 4:
                    System.out.println("Задача 4. Список покупателей");
                    shopManager.printListCustomers(customers);
                    break;
                case 5:
                    System.out.println("Задача 5. Покупка покупателем продукта");
                    System.out.println("Список покупателей");
                    shopManager.printListCustomers(customers);
                    System.out.println("Список товаров");
                    shopManager.printListProducts(products);
                    System.out.print("Выберите покупателя для редактирования: ");
                    int numCustomerForEdit = scanner.nextInt();
                    System.out.print("Выберите товар для редактирования: ");
                    int numProductForEdit = scanner.nextInt();
                    System.out.print("Какое количество товара вы хотите приобрести: ");
                    int countProductForBuy = scanner.nextInt();

                    if(customers[numCustomerForEdit-1].getCash() > products[numProductForEdit-1].getPrice() && products[numProductForEdit-1].getCountProductInShop() > 0){    
                        int newpur = customers[numCustomerForEdit-1].getCash() - (products[numProductForEdit-1].getPrice() * countProductForBuy);  
                        int newpur2 = products[numProductForEdit-1].getCountProductInShop() - countProductForBuy;
                        customers[numCustomerForEdit-1].setCash(newpur); 
                        products[numProductForEdit-1].setCountProductInShop(newpur2);
                        this.history = Arrays.copyOf(this.history, this.history.length+1);
                        this.history[this.history.length-1] = products[numProductForEdit-1].getPrice();
                        System.out.println("\n!!! Спасибо за покупку !!!");
                        System.out.printf("Цена покупки состовляет: %s%n",products[numProductForEdit-1].getPrice() * countProductForBuy);
                    }else if(customers[numCustomerForEdit-1].getCash() < products[numProductForEdit-1].getPrice()){
                        System.out.println("У вас нет денег");             
                    }else{
                        System.out.println("У нас закончился этот товар");
                    }
                    break;
                case 6:
                    System.out.println("Задача 6. Доход магазина за все время");
                    
                    break;
                case 7:
                    System.out.println("Список покупателей: ");
                    shopManager.printListCustomers(customers);
                    System.out.print("Выберите покупателя для редактирования: ");
                    int numCustomerForEdit = scanner.nextInt();
                    System.out.print("Введите новое количество денег: ");
                    int num2 = scanner.nextInt();
//                    int newcash = customer[numCustomerForEdit-1].getCash() + num2;
                    customers[numCustomerForEdit-1].setCash(customers[numCustomerForEdit-1].getCash() + num2);
                    break;      
                default:
                    System.out.println("Выберите задачу из списка");
            }
            System.out.println("=======---------========");
        }while(repeat);
        System.out.println("Пока, ребята!");
    }
    
    private void testAddProduct() {
        Product product = new Product();
        product.setTitle("Milk");
        product.setPrice(2);
        product.setCountProductInShop(2190);
        product.setFabricator("Tere");
        
        this.products = Arrays.copyOf(this.products, this.products.length+1);
        this.products[this.products.length-1] = product;
    }
    
    private void testAddCustomer() {
        Customer customer = new Customer();
        customer.setName("Nikita Ivtsenkov");
        customer.setCash(200);
        customer.setTelephone("+56884831");

        this.customers = Arrays.copyOf(this.customers, this.customers.length+1);
        this.customers[this.customers.length-1] = customer;
    }
}
