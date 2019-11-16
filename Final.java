/*
CSIS 1400
Final
Peyton Anderson
Version 1
*/
package pkgfinal;

import java.util.Scanner;

/**
 *
 * @author Peyton
 */
public class Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double DayOne = 27.50;
    double DayTwo = 77.50;
    double DayThree = 92.50;
    double DayFour = 372.50;
    double DayFive = 672.50;
    double DaySix = 822.50;
    double DaySeven = 7822.50;
    double DayEight = 7856.50;
    double DayNine = 10462;
    double DayTen = 13387;
    double DayEleven = 14440.25;
    double DayTwelve = 15580.25;

    
    System.out.println("What day would you like to add up?");
    Scanner input = new Scanner(System.in);
    int ans = input.nextInt();
    
    if(ans == 1){
        System.out.println("The Gifts for Day 1 are:\n 1 Partridge in a pear tree\n");
        System.out.println("Cost: $" + DayOne);
    }
    if(ans == 2){
        System.out.println("Cost: $" + (DayTwo));
    }
    if(ans == 3){
        System.out.println("The Gifts for Day 1 are:\n 1 Partridge in a pear tree\n 2 Turtle Doves\n 3 French hens\n");
        System.out.println("Cost: $" + (DayThree));
    }
    if(ans == 4){
        System.out.println("The Gifts for Day 12 are:\n 1 Partridge in a pear tree\n 2 Turtle Doves\n 3 French hens\n 4 Calling Birds\n");
        System.out.println("Cost: $" + (DayFour));
    }    
    if(ans == 5){
        System.out.println("The Gifts for Day 12 are:\n 1 Partridge in a pear tree\n 2 Turtle Doves\n 3 French hens\n 4 Calling Birds\n 5 Gold Rings\n");
        System.out.println("Cost: $" + (DayFive));
    }
     if(ans == 6){
        System.out.println("The Gifts for Day 12 are:\n 1 Partridge in a pear tree\n 2 Turtle Doves\n 3 French hens\n 4 Calling Birds\n 5 Gold Rings\n 6 Geeese-a-laying\n");
        System.out.println("Cost: $" + (DaySix));
    }   
     if(ans == 7){
        System.out.println("The Gifts for Day 12 are:\n 1 Partridge in a pear tree\n 2 Turtle Doves\n 3 French hens\n 4 Calling Birds\n 5 Gold Rings\n 6 Geeese-a-laying\n 7 Swan-a-swanning\n");
        System.out.println("Cost: $" + (DaySeven));
    }     
     if(ans == 8){
        System.out.println("The Gifts for Day 12 are:\n 1 Partridge in a pear tree\n 2 Turtle Doves\n 3 French hens\n 4 Calling Birds\n 5 Gold Rings\n 6 Geeese-a-laying\n 7 Swan-a-swanning\n 8 Maid-a-milking\n");
        System.out.println("Cost: $" + (DayEight));
    }       
     if(ans == 9){
        System.out.println("The Gifts for Day 12 are:\n 1 Partridge in a pear tree\n 2 Turtle Doves\n 3 French hens\n 4 Calling Birds\n 5 Gold Rings\n 6 Geeese-a-laying\n 7 Swan-a-swanning\n 8 Maid-a-milking\n 9 Lady dancing\n");
        System.out.println("Cost: $" + (DayNine));
    }    
     if(ans == 10){
        System.out.println("The Gifts for Day 12 are:\n 1 Partridge in a pear tree\n 2 Turtle Doves\n 3 French hens\n 4 Calling Birds\n 5 Gold Rings\n 6 Geeese-a-laying\n 7 Swan-a-swanning\n 8 Maid-a-milking\n 9 Lady dancing\n 10 Lord-a-leaping\n");
        System.out.println("Cost: $" + (DayTen));
    }     
     if(ans == 11){
        System.out.println("The Gifts for Day 12 are:\n 1 Partridge in a pear tree\n 2 Turtle Doves\n 3 French hens\n 4 Calling Birds\n 5 Gold Rings\n 6 Geeese-a-laying\n 7 Swan-a-swanning\n 8 Maid-a-milking\n 9 Lady dancing\n 10 Lord-a-leaping\n 11 Piper pipings\n");
        System.out.println("Cost: $" + (DayEleven));
    }
     if(ans == 12){
        System.out.println("The Gifts for Day 12 are:\n 1 Partridge in a pear tree\n 2 Turtle Doves\n 3 French hens\n 4 Calling Birds\n 5 Gold Rings\n 6 Geeese-a-laying\n 7 Swan-a-swanning\n 8 Maid-a-milking\n 9 Lady dancing\n 10 Lord-a-leaping\n 11 Piper pipings\n 12 Drummer drumming\n");
        System.out.println("Cost: $" + (DayTwelve));
    }
     System.out.println("Total cost of the twelve days is $71,613.50");
    }
    
}
