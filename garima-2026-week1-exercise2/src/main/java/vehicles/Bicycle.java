
package vehicles;

/**
 * Step 1: Complete the Bicycle subclass.
 * Extends Vehicle.
 */
public class Bicycle extends Vehicle {

    private int gearCount;

    public Bicycle(String model, int maxSpeed, int gearCount) {
        super(model, maxSpeed, 1);

        if (gearCount <= 0) {
            throw new IllegalArgumentException(
                    "Gear count must be positive"
            );
        }

        this.gearCount = gearCount;
    }

    public int getGearCount() {
        return gearCount;
    }

    @Override
    public double calculateTravelTime(double distanceInKm) {
        if (distanceInKm <= 0) {
            throw new IllegalArgumentException(
                    "Distance must be positive"
            );
        }
        return distanceInKm / (double) getMaxSpeed();
    }
}
