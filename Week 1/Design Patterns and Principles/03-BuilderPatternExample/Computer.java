public class Computer {
    String CPU;
    String RAM;
    String storage;

    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
    }

    public String getCPU(){ 
        return CPU; 
    }
    public String getRAM(){ 
        return RAM; 
    }
    public String getStorage(){ 
        return storage; 
    }

    @Override
    public String toString() {
        return "\nCPU = " + CPU + '\n' + "RAM = " + RAM + '\n' +"Storage = " + storage+'\n';
    }

    public static class ComputerBuilder {
        private String CPU;
        private String RAM;
        private String storage = "256GB SSD";

        public ComputerBuilder(String cpu, String ram) {
            this.CPU = cpu;
            this.RAM = ram;
        }

        public ComputerBuilder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }
    
}
