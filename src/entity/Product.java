/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
/**
 *
 * @author Nikita
 */
public class Product {
    private String title;
    private int price;
    private int countProductInShop;
    private String fabricator;

    public Product() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCountProductInShop() {
        return countProductInShop;
    }

    public void setCountProductInShop(int countProductInShop) {
        this.countProductInShop = countProductInShop;
    }

    public String getFabricator() {
        return fabricator;
    }

    public void setFabricator(String fabricator) {
        this.fabricator = fabricator;
    }

    @Override
    public String toString() {
        return "Product{" + "title=" + title + ", price=" + price + ", countProductInShop=" + countProductInShop + ", fabricator=" + fabricator + '}';
    }
    
    
    
    
}
