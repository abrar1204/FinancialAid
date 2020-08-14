import java.util.Scanner;
import java.lang.Math;

public class FinancialAid
{
  public static void main(String[] args)
  {
    double tuition, roomboard, bookssupplies, transportation, othercosts, financialaid, remainingexpenses;
    Scanner cost = new Scanner(System.in);
    
    System.out.println("Enter the cost of tuition for one year (around 30 credit hours): ");
    tuition = cost.nextDouble();
  
    System.out.println("Enter the cost of room and board for one year: ");
    roomboard = cost.nextDouble();
  
    System.out.println("Enter the cost of your books and other supplies for one year: ");
    bookssupplies = cost.nextDouble();
    
    System.out.println("Enter the cost of transportation for one year: ");
    transportation = cost.nextDouble();
    
    System.out.println("Enter the cost of anything else that hasn't been included while attending college for one year: ");
    othercosts = cost.nextDouble();
    
    System.out.println("Enter the total amount of financial aid you are in receiving in terms of scholarships, grants, loans, and work studies: ");
    financialaid = cost.nextDouble();
    
    remainingexpenses = (tuition + roomboard + bookssupplies + transportation + othercosts) - financialaid; 
    
    if (remainingexpenses < 0)
    {
      System.out.println("Your remaining expenses is actually negative and you will receive more in financial aid than you will have to pay. Here is how much extra you will have in financial aid when deducting the total cost: " + Math.abs(remainingexpenses));
    }
    else
    {
    System.out.println("Your remaining expenses after applying financial aid to the total cost will be: " + remainingexpenses);
    }
  }
}