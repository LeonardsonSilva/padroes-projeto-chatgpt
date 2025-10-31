package creational.builder.exemplo02;

import creational.builder.exemplo02.classes.Computer;

public class Main {
    public static void main(String[] args) {
        Computer myPc = new Computer.Builder("ASUS ROG STRIX", "Intel i9-13900K")
                .ramGB(32)
                .storageGB(2000)
                .gpu("NVIDIA RTX 4090")
                .wifi(true)
                .os("Windows 11 Pro")
                .build();

        System.out.println(myPc.toString());
    }
}
