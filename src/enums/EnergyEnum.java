package enums;

public enum EnergyEnum {
    INCREMENT_ENERGY_BY_MILK(1.08),
    INCREMENT_ENERGY_BY_MEAT(1.1),
    DECREMENT_ENERGY(0.91),
    YOUR_ARE_HUNGRY(0.00),
    YOUR_ARE_VERY_HUNGRY(0.00),
    YOUR_ARE_VERY_VERY_HUNGRY(0.00),
    YOU_ARE_DIED(0.00);


    final double value;

    EnergyEnum(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
