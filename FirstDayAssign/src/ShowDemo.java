import java.util.Scanner;
public class ShowDemo {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Ënter the fixed cost");
	double fixedCost = sc.nextDouble();
	System.out.println("Enter the Rate Per Ticket cost");
	double ratePerTicket = sc.nextDouble();
	System.out.println("Enter the Number of Attendees");
	double noOfAttendees = sc.nextDouble();
	double variableCost = 0;
	double costfuntion=calculateProfit(fixedCost,variableCost,ratePerTicket,noOfAttendees);
	
}
public static double calculateProfit(double fixedCost, double variableCost, double ratePerTicket, double noOfAttendees)
{
	double profit=0;
	variableCost = ratePerTicket*noOfAttendees;
	profit = variableCost-fixedCost;
	System.out.println(profit);
	return profit;
	
	
	}
}
