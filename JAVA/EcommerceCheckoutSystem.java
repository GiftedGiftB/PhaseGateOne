import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EcommerceCheckoutSystem{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter starting date in full:");
 String start = scanner.next();

System.out.print("Enter the ending date in full:");
 String end = scanner.next();

System.out.print("How long does your menstration cycle last:");
 int cycle = scanner.nextInt();

DateTimeFormatter format = DateTimeFormatter.ofPattern ("dd/MM/yyyy");

LocalDate startDate = LocalDate.parse(start,format);
LocalDate endDate = LocalDate.parse(end , format );  	

Period period = Period.between(startDate , endDate);


LocalDate ovulation = endDate.plusDays(cycle/2);


LocalDate safePeriod = endDate.plusDays(1); 
LocalDate endSafePeriod = endDate.plusDays(6); 

LocalDate startNextPeriod = endDate.plusDays(cycle); 

System.out.printf("The starting date of your period is: %s%n",startDate);
System.out.printf("The end date of your period is: %s%n",endDate);
System.out.printf("Your safe period is: %s to %s%n",safePeriod,endSafePeriod);
System.out.printf("Your ovulation date is: %s%n",ovulation);
System.out.printf("You will be starting your next period on: %s%n",startNextPeriod);

 }
}