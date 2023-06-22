package main_classes;

import rapair_classes.motorRepair;
import rapair_classes.gearBoxRepair;
import tune_classes.motorTuning;
import tune_classes.gearBoxTuning;

import java.util.Scanner;

public class Main
{
    public static void printStart()
    {
        System.out.println("Hello");
        System.out.println("Glad to see you in my garage !!!");
        System.out.println("Say me your`s car tech characteristics");
    }

    public static void scanAfterStart()
    {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        int num;;

        System.out.println("Enter your max speed :" );
        num = scanner1.nextInt();
        Car.setMaxSpeed(num);

        System.out.println("Enter ware rate of your motor from 1 till 100 % :" );
        num = scanner1.nextInt();

        if(num < 1 || num > 100)
            System.out.println("Incorrect num !");
        else
            Car.setMotorWareRate(num);

        System.out.println("Enter ware rate of your gearBox from 1 till 100 % :" );
        num = scanner1.nextInt();

        if(num < 1 || num > 100)
            System.out.println("Incorrect num !");
        else
            Car.setGearBoxWareRate(num);


        System.out.println("Enter your brand :" );
        String str = scanner2.nextLine();
        Car.setBrand(str);

    }
    public static void printList()
    {
        System.out.println("----------------------------");
        System.out.println("List of opportunities ");
        System.out.println("Enter 3 to print your tech characteristics");
        System.out.println("Enter 4 to quit");
    }
    public static void printTechCharacteristics()
    {
        System.out.println("Max speed : " + Car.getMaxSpeed() );
        System.out.println("Ware rate of motor from 1 to 100 % : " + Car.getMotorWareRate() );
        System.out.println("Ware rate of gearBox from 1 to 100 % : " + Car.getGearBoxWareRate() );
        System.out.println("Brand : " + Car.getBrand() );
    }

    public static void main(String[] args)
    {
        contextApplication context = new contextApplication();
        printStart();
        scanAfterStart();


        System.out.println("Enter 1 to repair your motor or Enter 2 to repair your gearBox");

        Scanner sc = new Scanner(System.in);
        int repair = sc.nextInt();

        if(repair == 1)
        {
            context.setRepairStrategy(new motorRepair());
        }
        else if(repair == 2)
        {
            context.setRepairStrategy(new gearBoxRepair());
        }

        System.out.println("Enter 1 to tune your motor or Enter 2 to tune your gearBox ");
        int tuning = sc.nextInt();

        if(tuning == 1)
        {
            context.setTuningStrategy(new motorTuning());
        }
        else if(tuning == 2)
        {
            context.setTuningStrategy(new gearBoxTuning());
        }

        context.executeStrategy();

        System.out.println("Tuning.......");
        System.out.println("Repairing.......");

        while(true)
        {
            printList();
            int tech = sc.nextInt();

            if( tech == 3 )
            {
                printTechCharacteristics();
            }
            else if( tech == 4 )
            {
                break;
            }

        }
    }
}
