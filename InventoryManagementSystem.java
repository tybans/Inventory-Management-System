import java.util.Scanner;

public class InventoryManagementSystem {
    private static String[] products = {"Laptop", "Smartphone", "Tablet", "Smartwatch", "Headphones"};
    private static int[] quantities = {10, 20, 15, 5, 25};
    private static String[] specifications = {"Intel Core i5, 8GB RAM, 256GB SSD", "6.2 inch display, 128GB storage", "10.1 inch display, 64GB storage", "1.3 inch display, heart rate monitor", "Noise-cancelling, over-ear design"};
    private static double[] costs = {800.00, 500.00, 300.00, 150.00, 100.00};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("=== Inventory Management System ===");
            System.out.println("1. Product List");
            System.out.println("2. Product Count");
            System.out.println("3. View Product Details");
            System.out.println("4. Edit Product");
            System.out.println("5. Update Inventory");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    displayProductList();
                    break;
                case 2:
                    getProductCount(scanner);
                    break;
                case 3:
                    viewProductDetails(scanner);
                    break;
                case 4:
                    editProduct(scanner);
                    break;
                case 5:
                    updateInventory(scanner);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

            System.out.println();
        } while (option != 0);
    }

    private static void displayProductList() {
        System.out.println("=== Product List ===");

        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
    }

    private static void getProductCount(Scanner scanner) {
        System.out.println("=== Product Count ===");
        System.out.print("Enter the product number (1-" + products.length + "): ");

        int productIndex = scanner.nextInt() - 1;

        if (productIndex >= 0 && productIndex < products.length) {
            System.out.println("Quantity available for " + products[productIndex] + ": " + quantities[productIndex]);
        } else {
            System.out.println("Invalid product number.");
        }
    }

    private static void viewProductDetails(Scanner scanner) {
        System.out.println("=== View Product Details ===");
        System.out.print("Enter the product number (1-" + products.length + "): ");

        int productIndex = scanner.nextInt() - 1;

        if (productIndex >= 0 && productIndex < products.length) {
            System.out.println("Product: " + products[productIndex]);
            System.out.println("Specification: " + specifications[productIndex]);
            System.out.println("Cost: " + costs[productIndex]);
            System.out.println("Quantity available: " + quantities[productIndex]);
        } else {
            System.out.println("Invalid product number.");
        }
    }

    private static void editProduct(Scanner scanner) {
        System.out.println("=== Edit Product ===");
        System.out.print("Enter the product number (1-" + products.length + "): ");

        int productIndex = scanner.nextInt() - 1;

        if (productIndex >= 0 && productIndex < products.length){
            System.out.println("Change the product: "+ products[productIndex]);
        }else{
            System.out.print("Invalid product number.");
        }
    }

    private static void updateInventory(Scanner scanner){
        System.out.println("=== Update Inventory===");
        System.out.print("Enter the product number (1-" + products.length + ")");

        int productIndex = scanner.nextInt() - 1;

        if (productIndex >= 0 && productIndex < products.length){
            System.out.println("Update the Inventory System: "+ products[productIndex]);

        }else {
            System.out.print("Invalid product number.");
        }
    }
}