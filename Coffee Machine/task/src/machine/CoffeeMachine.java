package machine;

import java.util.Scanner;

public class CoffeeMachine {
    int qtyWaterInMachine = 400, qtyMilkInMachine = 540, qtyBeansInMachine = 120, cashInMachine = 550, qtyCupsInMachine = 9;

    public int getQtyWaterInMachine() {
        return qtyWaterInMachine;
    }

    public void setQtyWaterInMachine(int qtyWaterInMachine) {
        this.qtyWaterInMachine = qtyWaterInMachine;
    }

    public int getQtyMilkInMachine() {
        return qtyMilkInMachine;
    }

    public void setQtyMilkInMachine(int qtyMilkInMachine) {
        this.qtyMilkInMachine = qtyMilkInMachine;
    }

    public int getQtyBeansInMachine() {
        return qtyBeansInMachine;
    }

    public void setQtyBeansInMachine(int qtyBeansInMachine) {
        this.qtyBeansInMachine = qtyBeansInMachine;
    }

    public int getCashInMachine() {
        return cashInMachine;
    }

    public void setCashInMachine(int cashInMachine) {
        this.cashInMachine = cashInMachine;
    }

    public int getQtyCupsInMachine() {
        return qtyCupsInMachine;
    }

    public void setQtyCupsInMachine(int qtyCupsInMachine) {
        this.qtyCupsInMachine = qtyCupsInMachine;
    }

    public static void main(String[] args) {
        CoffeeMachine oneCoffeeMachine = new CoffeeMachine();
        choice(oneCoffeeMachine);
    }

    public static void currentStatus(CoffeeMachine oneCoffeeMachine) {
        System.out.println("The coffee machine has:");
        System.out.println(oneCoffeeMachine.getQtyWaterInMachine() + " of water");
        System.out.println(oneCoffeeMachine.getQtyMilkInMachine() + " of milk");
        System.out.println(oneCoffeeMachine.getQtyBeansInMachine() + " of coffee beans");
        System.out.println(oneCoffeeMachine.getQtyCupsInMachine() + " of disposable cups");
        if (oneCoffeeMachine.getCashInMachine() > 0){
            System.out.println("$" + oneCoffeeMachine.getCashInMachine() + " of money");
        } else {
            System.out.println(oneCoffeeMachine.getCashInMachine() + " of money");
        }
        System.out.println();
        choice(oneCoffeeMachine);
    }

    public static void choice(CoffeeMachine oneCoffeeMachine) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String selection = scanner.next();
        System.out.println();
        if (selection.equals("buy")) {
            buy(oneCoffeeMachine);
        } else if (selection.equals("fill")) {
            fill(oneCoffeeMachine);
        } else if (selection.equals("take")){
            take(oneCoffeeMachine);
        } else if (selection.equals("remaining")) {
            currentStatus(oneCoffeeMachine);
        } else if (selection.equals("exit")) {
            System.exit(0);
        }

    }

    public static void buy(CoffeeMachine oneCoffeeMachine) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String outOf;
        String choice = scanner.next();
        int cupsInMachine = oneCoffeeMachine.getQtyCupsInMachine();
        int cashInMachine = oneCoffeeMachine.getCashInMachine(), waterInMachine = oneCoffeeMachine.getQtyWaterInMachine();
        int milkInMachine = oneCoffeeMachine.getQtyMilkInMachine(), beansInMachine = oneCoffeeMachine.getQtyBeansInMachine();
        int espressoWaterNeeded = 250, espressoBeansNeeded = 16, espressoCost = 4;
        int latteWaterNeeded = 350, latteMilkNeeded = 75, latteBeansNeeded = 20, latteCost = 7;
        int cappuccinoWaterNeeded = 200, cappuccinoMilkNeeded = 100, cappuccinoBeansNeeded = 12, cappuccinoCost = 6;

        if (choice.equals("back")) {} else if (cupsInMachine - 1 != -1) {
            if (choice.equals("1")) {
                if (beansInMachine >= espressoBeansNeeded && waterInMachine >= espressoWaterNeeded) {
                    oneCoffeeMachine.setQtyCupsInMachine(cupsInMachine - 1);
                    oneCoffeeMachine.setQtyBeansInMachine(beansInMachine - espressoBeansNeeded);
                    oneCoffeeMachine.setQtyWaterInMachine(waterInMachine - espressoWaterNeeded);
                    oneCoffeeMachine.setCashInMachine(cashInMachine + espressoCost);
                    System.out.println("I have nough resources, making you a coffee");
                } else {
                    if (beansInMachine - espressoBeansNeeded < 0) {
                        outOf = "coffee beans!";
                    } else if (waterInMachine - espressoWaterNeeded < 0) {
                        outOf = "water!";
                    } else {
                        outOf = "milk!";
                    }
                    System.out.println("Sorry, not enough " + outOf);
                }
            } else if (choice.equals("2")) {
                if (beansInMachine >= latteBeansNeeded && waterInMachine >= latteWaterNeeded && milkInMachine >=
                        latteMilkNeeded) {
                    oneCoffeeMachine.setQtyCupsInMachine(cupsInMachine - 1);
                    oneCoffeeMachine.setQtyBeansInMachine(beansInMachine - latteBeansNeeded);
                    oneCoffeeMachine.setQtyWaterInMachine(waterInMachine - latteWaterNeeded);
                    oneCoffeeMachine.setQtyMilkInMachine(milkInMachine - latteMilkNeeded);
                    oneCoffeeMachine.setCashInMachine(cashInMachine + latteCost);
                    System.out.println("I have enough resources, making you a coffee!");
                } else {
                    if (beansInMachine - latteBeansNeeded < 0) {
                        outOf = "coffee beans!";
                    } else if (waterInMachine - latteWaterNeeded < 0) {
                        outOf = "water!";
                    } else {
                        outOf = "milk!";
                    }
                    System.out.println("Sorry, not enough " + outOf);
                }
            } else if (choice.equals("3")) {
                if (beansInMachine >= cappuccinoBeansNeeded && waterInMachine >= cappuccinoWaterNeeded &&
                        milkInMachine >= cappuccinoMilkNeeded) {
                    oneCoffeeMachine.setQtyCupsInMachine(cupsInMachine - 1);
                    oneCoffeeMachine.setQtyBeansInMachine(beansInMachine - cappuccinoBeansNeeded);
                    oneCoffeeMachine.setQtyWaterInMachine(waterInMachine - cappuccinoWaterNeeded);
                    oneCoffeeMachine.setQtyMilkInMachine(milkInMachine - cappuccinoMilkNeeded);
                    oneCoffeeMachine.setCashInMachine(cashInMachine + cappuccinoCost);
                    System.out.println("I have enough resources, making you a coffee!");
                }
            } else {
                if (beansInMachine - cappuccinoBeansNeeded < 0) {
                    outOf = "coffee beans!";
                } else if (waterInMachine - cappuccinoWaterNeeded < 0) {
                    outOf = "water!";
                } else {
                    outOf = "milk!";
                }
                System.out.println("Sorry, not enough " + outOf);
            }
            System.out.println();
        } else {
            System.out.println("Sorry, not enough cups!");
        }
        choice(oneCoffeeMachine);
    }

    public static void fill(CoffeeMachine oneCoffeeMachine) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water do you want to add:");
        oneCoffeeMachine.setQtyWaterInMachine(oneCoffeeMachine.getQtyWaterInMachine() + scanner.nextInt());
        System.out.println("Write how many ml of milk do you want to add:");
        oneCoffeeMachine.setQtyMilkInMachine(oneCoffeeMachine.getQtyMilkInMachine() + scanner.nextInt());
        System.out.println("Write how many grams of coffee beans do you want to add:");
        oneCoffeeMachine.setQtyBeansInMachine(oneCoffeeMachine.getQtyBeansInMachine() + scanner.nextInt());
        System.out.println("Write how many disposable cups of coffee you want to add:");
        oneCoffeeMachine.setQtyCupsInMachine(oneCoffeeMachine.getQtyCupsInMachine() + scanner.nextInt());
        System.out.println();
        choice(oneCoffeeMachine);
    }

    public static void take(CoffeeMachine oneCoffeeMachine) {
        System.out.println("I gave you $" + oneCoffeeMachine.getCashInMachine());
        oneCoffeeMachine.setCashInMachine(0);
        System.out.println();
        choice(oneCoffeeMachine);
    }
}
