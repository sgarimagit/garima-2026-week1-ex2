
package vehicles;

/**
 * Step 2: Complete the Car subclass.
 * Extends Vehicle.
 */
public class Car extends Vehicle {

    private int fuelLevelPercent;

    public Car(String model, int maxSpeed, int passengerCapacity, int fuelLevelPercent) {
        super(model, maxSpeed, passengerCapacity);

        // Validate fuel level
        if (fuelLevelPercent < 0 || fuelLevelPercent > 100) {
            throw new IllegalArgumentException(
                    "Fuel level must be between 0 and 100");
        }

        // Store fuel level
        this.fuelLevelPercent = fuelLevelPercent;
    }

    public int getFuelLevelPercent() {
        return fuelLevelPercent;
    }

    public void refuel(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Refuel amount must be positive");
        }

        // Fuel cannot exceed 100%
        this.fuelLevelPercent =
                Math.min(100, this.fuelLevelPercent + amount);
    }

    @Override
    public double calculateTravelTime(double distanceInKm) {
        if (distanceInKm <= 0) {
            throw new IllegalArgumentException(
                    "Distance must be positive");
        }

        return distanceInKm / getMaxSpeed();
    }
}
