package com.AssessmentProblems.FutureLogistics;

public class BrickTransport extends GoodsTransport {

    private float brickSize;
    private int brickQuantity;
    private float brickPrice;

    public BrickTransport(String id, String date, int rating,
                          float brickSize, int brickQuantity, float brickPrice) {
        super(id, date, rating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }

    public float getBrickSize() { return brickSize; }
    public void setBrickSize(float brickSize) { this.brickSize = brickSize; }

    public int getBrickQuantity() { return brickQuantity; }
    public void setBrickQuantity(int brickQuantity) { this.brickQuantity = brickQuantity; }

    public float getBrickPrice() { return brickPrice; }
    public void setBrickPrice(float brickPrice) { this.brickPrice = brickPrice; }

    @Override
    public String vehicleSelection() {
        if (brickQuantity < 300)
            return "Truck";
        else if (brickQuantity <= 500)
            return "Lorry";
        else
            return "MonsterLorry";
    }

    private int getVehiclePrice(String v) {
        if (v.equalsIgnoreCase("Truck")) return 1000;
        if (v.equalsIgnoreCase("Lorry")) return 1700;
        return 3000;
    }

    private float getDiscountPercent() {
        if (transportRating == 5) return 0.20f;
        if (transportRating >= 3) return 0.10f;
        return 0f;
    }

    @Override
    public float calculateTotalCharge() {
        float price = brickPrice * brickQuantity;
        float tax = price * 0.30f;
        float discount = price * getDiscountPercent();
        int vehicleCost = getVehiclePrice(vehicleSelection());

        return price + tax + vehicleCost - discount;
    }
}
