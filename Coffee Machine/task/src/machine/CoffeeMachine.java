package machine;
import java.util.Scanner;

public class CoffeeMachine {
    private static int waterInside = 400;
    private static int milkInside = 540;
    private static int beansInside = 120;
    private static int disposableCups = 9;
    private static int money = 550;
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        String action = "";

        while(action != "exit"){
            System.out.print("\nWrite action (buy, fill, take, remaining, exit):\n");
            action = scanner.next();
            System.out.println();

            if(action.equals("take")) take();
            else if(action.equals("buy")) buy();
            else if(action.equals("fill")) fill();
            else if(action.equals("remaining")) printInfo();
            else if(action.equals("exit")) break;

        }

        scanner.close();
    }

    private static void take(){
        System.out.println("I gave you $" + money);
        money = 0;
    }

    private static void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String what = scanner.next();

        if(what == "back") return;

        int needWater = 0, needMilk = 0, needBeans = 0, mon = 0, cups = 0;

        if (what.equals("1")) { // espresso
            needWater = 250;
            needBeans = 16;
            mon = 4;
            cups = 1;
        } else if (what.equals("2")) { // latte
            needWater = 350;
            needMilk = 75;
            needBeans = 20;
            mon = 7;
            cups = 1;
        } else if (what.equals("3")) { // cappuccino
            needWater = 200;
            needMilk = 100;
            needBeans = 12;
            mon = 6;
            cups = 1;
        }

        if(disposableCups == 0 || needWater > waterInside || needMilk > milkInside || needBeans > beansInside){
            System.out.println("I have enough resources, making you a coffee!");
            return;
        }

        waterInside -= needWater;
        milkInside -= needMilk;
        beansInside -= needBeans;
        money += mon;
        disposableCups -= cups;
    }

    private static void fill(){
        System.out.println("Write how many ml of water do you want to add:");
        waterInside += scanner.nextInt();

        System.out.println("Write how many ml of milk do you want to add:");
        milkInside += scanner.nextInt();

        System.out.println("Write how many grams of coffee beans do you want to add:");
        beansInside += scanner.nextInt();

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        disposableCups += scanner.nextInt();
    }

    private static void printInfo(){
        System.out.println("The coffee machine has:");
        System.out.println(waterInside + " of water");
        System.out.println(milkInside + " of milk");
        System.out.println(beansInside + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println("$" + money + " of money");
    }
}
