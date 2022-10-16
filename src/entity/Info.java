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
public class Info {
    private String price;
    private String expirationDate;
    private String countProductInShop;
    private String discount;
    private String pricewithdiscount;

    public Info() {
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCountProductInShop() {
        return countProductInShop;
    }

    public void setCountProductInShop(String countProductInShop) {
        this.countProductInShop = countProductInShop;
    }
    
    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Info{" + "price=" + price + ", expirationDate=" + expirationDate + ", countProductInShop=" + countProductInShop + ", discount=" + discount + '}';
    }

    

    
}
