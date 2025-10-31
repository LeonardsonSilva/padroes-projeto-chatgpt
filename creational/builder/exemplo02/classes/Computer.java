package creational.builder.exemplo02.classes;

public class Computer {
    private final String motherboard;
    private final String cpu;
    private final int ramGB;
    private final int storageGB;
    private final String gpu;
    private final boolean hasWifi;
    private final String os;

    private Computer(Builder builder) {
        this.motherboard = builder.motherboard;
        this.cpu = builder.cpu;
        this.ramGB = builder.ramGB;
        this.storageGB = builder.ramGB;
        this.gpu = builder.gpu;
        this.hasWifi = builder.hasWifi;
        this.os = builder.os;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRamGB() {
        return ramGB;
    }

    public int getStorageGB() {
        return storageGB;
    }

    public String getGpu() {
        return gpu;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public String getOs() {
        return os;
    }

    public static class Builder {
        private final String motherboard;
        private final String cpu;
        private int ramGB = 8;
        private int storageGB = 256;
        private String gpu = null;
        private boolean hasWifi = false;
        private String os = "None";

        public Builder(String motherboard, String cpu) {
            if (motherboard == null || motherboard.isEmpty()) {
                throw new IllegalArgumentException("motherboard não pode ser vazio");
            }
            if (cpu == null || cpu.isEmpty()) {
                throw new IllegalArgumentException("cpu não pode ser vazio");
            }
            this.motherboard = motherboard;
            this.cpu = cpu;
        }

        public Builder ramGB(int ramGB) {
            if (ramGB <= 0) {
                throw new IllegalArgumentException("ramGB deve ser > 0");
            }
            this.ramGB = ramGB;
            return this;
        }

        public Builder storageGB(int storageGB) {
            if (storageGB <= 0) {
                throw new IllegalArgumentException("StorageGB deve ser > 0");
            }
            this.storageGB = storageGB;
            return this;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder wifi(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }

        public Builder os(String os) {
            this.os = os;
            return this;
        }

        public Computer build() {
            if (this.ramGB < 4) {
                throw new IllegalStateException("RAM mínima recomendada é 4GB");
            }

            if (this.storageGB < 128) {
                throw new IllegalStateException("Storage mínimo recomendado é 128GB");
            }

            return new Computer(this);
        }

    }

    @Override
    public String toString() {
        return "Computer {" +
                "motherboard='" + motherboard + "'" +
                ", cpu='" + cpu + "'" +
                ", ramGB=" + ramGB +
                ", storageGB=" + storageGB +
                ", gpu=" + gpu +
                ", hasWifi=" + hasWifi +
                ", os='" + os + "'" +
                "}";
    }

}
