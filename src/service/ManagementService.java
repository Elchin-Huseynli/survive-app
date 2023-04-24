package service;

import util.MenuUtil;

public class ManagementService {
    public static void manage() {
        MenuUtil menuUtil = new MenuUtil();
        EnergyService energyService = new EnergyService();

        while (true) {
            byte option = menuUtil.entry();

            switch (option) {
                case 1:
                    energyService.incrementEnergyByMeat();
                    break;
                case 2:
                    energyService.incrementEnergyByMilk();
                    break;
                case 3:
                    energyService.showEnergy();
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
