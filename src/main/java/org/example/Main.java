package org.example;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    static int totalcost = 0;//total cost of food
    int count1=0;//count of Chicken gravy
    int count2=0;//count of Chicken Manchurian
    int count3=0;//count of Paneer Gravy
    int count4=0;//count of Paneer Manchurian


    //function to calculate the total cost of items
    public void payment(int selectitem, int quantity) {

        switch (selectitem) {
            case 1: {
                totalcost = totalcost+quantity * 250;
                count1=count1+quantity;
                break;
            }
            case 2: {
                totalcost =totalcost+quantity * 300;
                count2=count2+quantity;
                break;
            }
            case 3: {
                totalcost = totalcost+quantity * 200;
                count3=count3+quantity;
                break;
            }
            case 4: {
                totalcost = totalcost+quantity * 240;
                count4=count4+quantity;
                break;
            }
            default:
                System.out.println("The selected item or quantity is not definite");
        }
        System.out.println("Do you wish to make another order?\n1.Yes\t2.No");
        int cont;
        cont=sc.nextInt();
        //If customer wishes to make another order
        if(cont==1){
            selectRestaurant();
        }
        //if customer wants to pay the bill
        else {
            System.out.println("\nThe total cost of your food is:"+totalcost);
            System.out.println("\nYour orders are:");
            if(count1>0) System.out.println("Chicken Gravy🐔: "+count1);
            if(count2>0) System.out.println("Chicken Manchurian🍗: "+count2);
            if(count3>0) System.out.println("Paneer Gravy🧀: "+count3);
            if(count4>0) System.out.println("Paneer Manchurian🫕: "+count4);
            System.out.println("\nThank you for ordering. See you again🙌\n");
        }

    }

    //Function to select the items
    public void selectItems() {
        System.out.println("Select your food items:");
        System.out.println("1.Chicken Gravy🐔 | Rs.250");
        System.out.println("2.Chicken Manchurian🍗 | Rs.300");
        System.out.println("3.Paneer Gravy🧀 | Rs.200");
        System.out.println("4.Paneer Manchurian🫕 | Rs.240");
        int selectitem = sc.nextInt();
        int quantity ;
        System.out.println("Enter the quantity of the food item: ");
        quantity = sc.nextInt();
        payment(selectitem, quantity);
    }

    //Function to select the restaurant
    public void selectRestaurant() {
        System.out.println("1.Himalayan Restaurant");
        System.out.println("2.Chinese Restaurant");
        System.out.println("3.Trooper Restaurant");
        System.out.println("4.Mongo Restaurant");
        int selectRestro = sc.nextInt();
        switch (selectRestro) {
            case 1-> System.out.println("You selected Himalayan Restaurant.\n");
            case 2-> System.out.println("You selected Chinese Restaurant.\n");
            case 3-> System.out.println("You selected Trooper Restaurant.\n");
            case 4-> System.out.println("You selected Mongo Restaurant.\n");
        };
        selectItems();
    }

//Main function
    public static void main(String[] args) {
        Main customer=new Main();
        Scanner sc=new Scanner(System.in);
        int appchoice;
        System.out.println("Welcome to Sharda Swiggy😋!\n\nApki Bhuk Mitane Hum Agagye hai!\nKripiya Food Menu Pe Prasthan Kare⬇️\n ");
        boolean choice = true;
        while (choice) {
            System.out.println("1.Select your Restaurant:");
            System.out.println("2.Exit from the App");
            appchoice = sc.nextInt();

            switch (appchoice) {
                case 1: {
                    customer.selectRestaurant();
                    break;
                }
                case 2:{
                    choice=false;
                    System.out.println("\nThank you. See you again🙌 ");
                    break;
                }
            }
        }
    }
}