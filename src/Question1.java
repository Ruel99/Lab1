import java.util.Scanner;

public class Question1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

    char service;
    int accNum;
    int minutes;// for regular service
    double bill;
    double dayBill = 0;
    double nightBill = 0;
    double totalBill;
    double regFee = 10.00;
    double premFee = 25.00;
    int dayMin, nightMin; //number of minutes talked in the day and night
    int totalMin;
        System.out.println("Please enter 'a' if you have Regular service or 'b' if you have Premium service");
        service = sc.next().charAt(0);

        switch(service){
            case 'a':
                if(service == 'a' || service == 'A'){
                    System.out.println("Please enter your account number");
                    accNum = sc.nextInt();

                    System.out.println("Please enter the amount of minutes you talked for");
                    minutes = sc.nextInt();

                    if(minutes <=50){
                        bill = 10.00;
                    }else{
                       bill = (minutes - 50) * .20 + regFee;
                    }//claculation of bill

                    System.out.println("This is your bill:");
                    System.out.println("Your Account number is: "+ accNum);
                    System.out.println("Your phone service is: "+ service);
                    System.out.println("The number of minutes the service was used are: " + minutes);
                    System.out.println("your bill is: $" + bill);
                }//end of if
            break;

            case 'b':
                if(service == 'b' || service == 'B'){
                    System.out.println("Please enter your account number");
                    accNum = sc.nextInt();

                    System.out.println("Please enter the amount of minutes you talked from 6:00am - 6:00pm");
                    dayMin = sc.nextInt();

                    System.out.println("Please enter the amount of minutes you talked from 6:00pm - 6:00am");
                    nightMin = sc.nextInt();

                    if(dayMin <= 75){
                        System.out.print("");
                    }else{
                        dayBill = (dayMin - 75) * .10;
                    }// calculation of day bill

                    if(nightMin <=100){
                        System.out.print("");
                    }else{
                        nightBill = (nightMin - 100) * .05;
                    }//calculation of night bill

                    totalBill = dayBill + nightBill+ premFee;
                    totalMin = dayMin + nightMin;

                    System.out.println("This is your bill:");
                    System.out.println("Your Account number is: "+ accNum);
                    System.out.println("Your phone service is: "+ service);
                    System.out.println("The number of minutes the service was used are: " + totalMin);
                    System.out.println("your bill is: $" + totalBill);
                }//end of if
            break;

            default:
                System.out.println("Invalid letter");
        }//end of switch
    }//end of main
}//end of class
