public class SearchProduct {
    public static int linearSearch(Product[] prod, String target){
        for (int i = 0; i < prod.length; i++) {
            if (prod[i].getProductName().equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] sortedProd, String target) {
        int low = 0;
        int high = sortedProd.length - 1;
        int mid = low + (high - low) / 2;

        while (low <= high) { 
            String currName = sortedProd[mid].getProductName();
            int cmp = currName.compareToIgnoreCase(target);
            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = low + (high - low) / 2;
        }
        return -1;
    }
}
