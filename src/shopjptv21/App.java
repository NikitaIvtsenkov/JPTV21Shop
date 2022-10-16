/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopjptv21;

import entity.Product;
import entity.Info;
import java.util.Arrays;
import java.util.Scanner;
import shopmanagers.ShopManager;

/**
 *
 * @author Nikita
 */
public class App {
    private Product[] products;
    private Product[] productsw;
    private final ShopManager shopManager;

    public App() {
        testAddProduct();
        shopManager = new ShopManager();
    }
    
    public void run(){
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Список задач магазина: ");
            System.out.println("0. Закрыть приложение");
            System.out.println("1. Добавить товар");
            System.out.println("2. Добавить работника");
            System.out.println("3. Список товаров");
            System.out.println("4. Список работников");
            System.out.println("5. Редактирование товара");
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
                    System.out.println("Задача 1. Добавить товар");
                    this.products = Arrays.copyOf(this.products, this.products.length+1);
                    this.products[this.products.length-1] = shopManager.createProduct();
                    break;
                case 2:
                    System.out.println("Задача 2. Добавить работника");
                    this.productsw = Arrays.copyOf(this.productsw, this.productsw.length+1);
                    this.productsw[this.productsw.length-1] = shopManager.createWorker();
                    break;                
                case 3:
                    System.out.println("Задача 3. Список товаров");
                    shopManager.printListProducts(products);
                    break;
                case 4:
                    System.out.println("Задача 4. Список работников");
                    shopManager.printListWorkers(productsw);
                    break;
                case 5:
                    System.out.println("Задача 5. Редактирование товара");
//                    System.out.println("Список товаров: ");
//                    shopManager.printListProducts(products);
//                    System.out.print("Выберите номер товара для редактирования: ");
//                    int numProductForEdit = scanner.nextInt();
//                    scanner.nextLine();
//                    products[numProductForEdit-1] = shopManager.changeProduct(products[numProductForEdit-1]);
                    break;
                default:
                    System.out.println("Выберите задачу из списка");
            }
            System.out.println("=======---------========");
        }while(repeat);
        System.out.println("Пока, ребята!");
    }
    
    private void testAddProduct() {
        this.products = new Product[0];
        Product product = new Product();
        product.setTitle("Product for editing1");
        Info info = new Info();
        info.setPrice("3.99");
        info.setExpirationDate("20.12.2022");
        info.setCountProductInShop("219");
        info.setDiscount("30");
        Info[] productInfos = new Info[1];
        productInfos[0] = info;
        product.setInfos(productInfos);
        this.products = Arrays.copyOf(this.products, this.products.length+1);
        this.products[this.products.length-1] = product;
    }
}
