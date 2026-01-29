package com.FunctionalInterfaces.MarkerInterfaces.CloningPrototypeObjects;

public class PrototypeDemo {
    public static void main(String[] args) throws Exception {

        Prototype p1 = new Prototype(1, "Template");
        Prototype p2 = (Prototype) p1.clone();

        System.out.println("Original : " + p1);
        System.out.println("Cloned   : " + p2);
    }
}

