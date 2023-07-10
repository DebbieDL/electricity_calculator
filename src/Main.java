import java.util.Scanner;
public class Main {
    public static void main(String [] args){

        //data members aka variables

        try (Scanner sc = new Scanner(System.in)) {
            double[] prices = {6.470, 0.25, 0.34, 0.202, 0.277, 0.99, 2.190};
            double kWh;
            double monthlykWh;
            double yearlykWh;
            double pricePerkWh;
            double price;
            int country;
            String otherCountry;

            //print section

            System.out.println("Please select your country");
            System.out.println("1. India");
            System.out.println("2. Bulgaria");
            System.out.println("3. UK");
            System.out.println("4. France");
            System.out.println("5. Spain");
            System.out.println("6.Romania");
            System.out.println("7.Turkey");
            System.out.println("8.Other");

            country = Integer.parseInt(sc.nextLine());

            if (country == 8) {
                System.out.println("Please input your country");
                otherCountry = sc.nextLine();
                System.out.println("Please input the cost of electricity per KwH in " + otherCountry);
                pricePerkWh = Double.parseDouble(sc.nextLine());
                System.out.println("Please input your daily usage of kWh");
                kWh = Double.parseDouble(sc.nextLine());
                price = kWh* pricePerkWh;
                monthlykWh = pricePerkWh * 30;
                yearlykWh = monthlykWh * 12;
                System.out.printf("The daily cost for " + kWh + " would be %.2f " ,price);
                System.out.println();
                System.out.printf("The monthly cost would be %.2f",monthlykWh);
                System.out.println();
                System.out.printf("The yearly cost would be %.2f",yearlykWh);
                System.exit(0);
            }
            System.out.println("Please enter your daily electricity usage in KwH");
            System.out.println("(You can see that on your electricity meter)");
            kWh = Double.parseDouble(sc.nextLine());

            //calculations

            price = kWh * prices[country - 1];
            monthlykWh = price * 30;
            yearlykWh = monthlykWh * 12;


            System.out.printf("The daily cost for " + kWh + " would be %.2f" , price);
            System.out.println();
            System.out.printf("The monthly cost would be %.2f",monthlykWh);
            System.out.println();
            System.out.printf("The yearly cost would be %.2f",yearlykWh);
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }
}
