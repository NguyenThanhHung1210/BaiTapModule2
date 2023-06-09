package java_colection_framework.bai_tap.luyentapsudung_arraylist_linkedlist;

import java.util.Comparator;

public class Product implements Comparable<Product>, Comparator<Product>{
    private int id;
    private String name;
    private float price;

    public Product() {
    }

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if(this.getPrice() > o.getPrice()) {
            return 1;
        } else if(this.getPrice() < o.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice() > o2.getPrice()) {
            return -1;
        } else if(o1.getPrice() < o2.getPrice()) {
            return 1;
        } else {
            return 0;
        }
    }
}
