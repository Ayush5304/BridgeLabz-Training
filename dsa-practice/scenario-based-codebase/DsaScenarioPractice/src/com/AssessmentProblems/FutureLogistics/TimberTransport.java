package com.AssessmentProblems.FutureLogistics;

public class TimberTransport extends GoodsTransport {

    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;

    public TimberTransport(String id, String date, int rating,
                           float timberLength, float timberRadius,
                           String timberType, float timberPrice) {

        super(id, date, rating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }

    public float getTimberLength() { return timberLength; }
    public float getTimberRadius() { return timberRadius; }
    public String getTimberType() { return timberType; }
    public float getTimberPrice() { return timberPrice; }

    @Override
    public String vehicleSelection() {
        float area = 2 * 3.147f * timberRadius * timberLength;

        if (area < 250)
            return "Truck";
        else if (area <= 400)
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

        float volume = 3.147f * timberRadius * timberRadius * timberLength;

        float rate = timberType.equalsIgnoreCase("Premium") ? 0.25f : 0.15f;

        float price = volume * timberPrice * rate;

        float tax = price * 0.30f;

        float discount = price * getDiscountPercent();

        int vehicleCost = getVehiclePrice(vehicleSelection());

        return price + tax + vehicleCost - discount;
    }
}
