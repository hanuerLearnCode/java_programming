package Ex02;

import java.util.Scanner;

public class Ex3 {
    public static class Product {

        String name;
        double price;
        double discount;

        void input() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input name: ");
            this.name = sc.next();
            System.out.println("Input price:");
//        System.out.println("\n");
            this.price = sc.nextDouble();
            System.out.println("Input discount: ");
            this.discount = sc.nextDouble();
        }

        public void display() {
            System.out.println("Name: "  + this.name);
            System.out.println("Price: " + this.price);
            System.out.println("Discount: " + this.discount);
            System.out.println("Import Tax: " + this.getImportTax());
        }

        private double getImportTax() {
            return this.price*0.1;
        }
    }
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        product1.input();
        product2.input();
        product1.display();
        product2.display();
    }
}
