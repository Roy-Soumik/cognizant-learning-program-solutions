public class Main {
    public static void main(String[] args) {
        Computer basic = new Computer.ComputerBuilder("Intel i3", "8GB").build();
        System.out.println("Basic: " + basic);
        Computer work = new Computer.ComputerBuilder("Intel i5", "16GB").storage("512GB SSD").build();
        System.out.println("Work: " + work);
        Computer gaming = new Computer.ComputerBuilder("AMD Ryzen 7", "16GB") .storage("1TB NVMe SSD").build();
        System.out.println("Gaming: " + gaming);
    }
}
