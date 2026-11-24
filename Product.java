class Product {
    String productName;
    int quantity;
    double price;

    Product() {
        productName = "Unknown";
        quantity = 1;
        price = 100;
    }

    Product(String productName) {
        this.productName = productName;
        this.quantity = 1;
        this.price = 100;
    }

    Product(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    void calculateTotal() {
        System.out.println("Total Price: ₹" + (quantity * price));
    }
}

class main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Notebook");
        Product p3 = new Product("Bottle", 5, 50);
        p1.calculateTotal();
        p2.calculateTotal();
        p3.calculateTotal();
    }
}