import java.util.Scanner;

class OrderProcessing {

    String productName = "Laptop";
    String quantity = "2";
    double[] productPrices = {45000, 55000, 65000};

    void processOrder(Scanner sc) {

        try {
            System.out.println("Product Name: " + productName);

            System.out.print("Enter quantity: ");
            quantity = sc.nextLine();

            int qty = Integer.parseInt(quantity);

            System.out.print("Enter product position: ");
            int position = Integer.parseInt(sc.nextLine());

            double price = productPrices[position];

            double totalPrice = qty * price;

            System.out.println("Product Price: " + price);
            System.out.println("Quantity: " + qty);
            System.out.println("Total Price: " + totalPrice);
        }

        catch (NumberFormatException e) {
            System.out.println("Invalid quantity. Please enter numbers only.");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid product position.");
        }

        finally {
            System.out.println("Order Processing Completed");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        OrderProcessing o = new OrderProcessing();

        o.processOrder(sc);
    }
}