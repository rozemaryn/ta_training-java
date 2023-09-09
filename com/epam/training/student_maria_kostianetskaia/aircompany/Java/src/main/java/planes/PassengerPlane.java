package planes;

public class PassengerPlane extends Plane {
    private final int passengersCapacity;

    public PassengerPlane(
            String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity
    ) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", passengersCapacity = " + passengersCapacity +
                '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PassengerPlane that = (PassengerPlane) o;
        return passengersCapacity == that.passengersCapacity;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + passengersCapacity;
        return result;
    }
}
