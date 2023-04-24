package service;

import enums.EnergyEnum;

public class EnergyService extends Thread {
    public static double energy = 100;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
                decrementEnergy();
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (checkEnergy()<60 && checkEnergy()>45) {
                System.out.println("-----------------");
                System.out.println(EnergyEnum.YOUR_ARE_HUNGRY.name());
                System.out.println("-----------------");
            }
            else if (checkEnergy()<=45 && checkEnergy()>25) {
                System.out.println("-----------------");
                System.out.println(EnergyEnum.YOUR_ARE_VERY_HUNGRY.name());
                System.out.println("-----------------");
            }
            else if (checkEnergy()<=25 && checkEnergy()>=1) {
                System.out.println("-----------------");
                System.out.println(EnergyEnum.YOUR_ARE_VERY_VERY_HUNGRY.name());
                System.out.println("-----------------");
            }
            else if (checkEnergy()<1) {
                System.out.println("-----------------");
                System.out.println(EnergyEnum.YOU_ARE_DIED.name());
                System.out.println("-----------------");
                System.exit(-1);
            }
        }
    }

    public void showEnergy() {
        System.out.println("-----------------");
        System.out.println("Energy: " + energy);
        System.out.println("-----------------");
    }

    public void incrementEnergyByMilk() {
        energy*=EnergyEnum.INCREMENT_ENERGY_BY_MILK.getValue();

        if (energy >= 100) {
            energy=100;
        }
    }

    public void incrementEnergyByMeat() {
        energy*=EnergyEnum.INCREMENT_ENERGY_BY_MEAT.getValue();

        if (energy >= 100) {
            energy=100;
        }
    }

    public void decrementEnergy() {
        energy*=EnergyEnum.DECREMENT_ENERGY.getValue();
    }

    public double checkEnergy() {
        return energy;
    }
}
