package com.FunctionalInterfaces.MarkerInterfaces.CloningPrototypeObjects;

class Prototype implements Cloneable {

    int id;
    String type;

    Prototype(int id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return id + " " + type;
    }
}
