import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] prod = {
            new Product(1, "T-Shirt", "cloth"),
            new Product(2, "Laptop", "electronics"),
            new Product(3, "Shoes", "Footware"),
            new Product(4, "Pencil", "Stationery")
        };

        String target = "Laptop";
        int i1 = SearchProduct.linearSearch(prod, target);
        System.out.println("Linear search: \n");
        System.out.println("Product List:");
        for (int i = 0; i < prod.length; i++) {
            System.out.print(prod[i].getProductName());
            if (i < prod.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Product found at index: "+i1);

        Arrays.sort(prod, (a, b) ->
            a.getProductName().compareToIgnoreCase(b.getProductName())
        );
        int i2 = SearchProduct.binarySearch(prod, target);
        System.out.println("\nBinary search: \n");
        System.out.println("Product List after sorting:");
        for (int i = 0; i < prod.length; i++) {
            System.out.print(prod[i].getProductName());
            if (i < prod.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Product found at index: " + i2);
    }
}
