package com.driver;

public class Main {

   public static class Product{
          int x = 0, y = 0, z = 0;
        public int product(int x, int y) {
            this.x = x;
            this.y = y;
            return x*y;
        }

        public int product(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;

            return x*y*z;
        }

        public double product(double x, double y) {
            x = x;
            y = y;

            return x*y;
        }



    }

    public static void main(String[] args) {
        Product p = new Product();
        p.product(5,7);
        p.product(5,7, 3);
        p.product(4.5,5.5);


    }

}