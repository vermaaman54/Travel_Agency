package travelAgency;

import java.util.*;

public class UserInterface{
	 
	 public static CommissionInfo generateCommissionObtained(){
	 CommissionInfo commissionInfo=(ticketObj-> {
	 double commissionAmt=0;
	 
	if(ticketObj.getClassType().equalsIgnoreCase("sl")||ticketObj.getClassType().equalsIgnoreCase("2s")){
	 commissionAmt+=60;
	 }
	 else{
	 commissionAmt+=100;
	 }
	 return commissionAmt;
	 });
	 return commissionInfo;
	 }
	 
	 public static void main(String [] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter the no of passengers");
	 int count=Integer.parseInt(sc.nextLine());
	 Ticket[] tickets=new Ticket[count];
	 for (int i=1; i<=count; i++){
	 Ticket ticket;
	 System.out.printf("Details of Passenger %d:\n",i);
	 System.out.println("Enter the pnr no:");
	 long pnrNo = Long.parseLong(sc.nextLine());
	 System.out.println("Enter passenger name:");
	 String passengerName=sc.nextLine();
	 System.out.println("Enter seat no:");
	 int setSeatNo=Integer.parseInt(sc.nextLine());
	 System.out.println("Enter class type:");
	 String setClassType=sc.nextLine();
	 System.out.println("Enter ticket fare:");
	 double setTicketFare=Double.parseDouble(sc.nextLine());
	 tickets[i-1]=new 
	Ticket(pnrNo,passengerName,setSeatNo,setClassType,setTicketFare);
	 }
	 System.out.println("Commission Obtained");
	 double commission=0;
	 for (int i=0; i<tickets.length;i++){
	 
	commission+=generateCommissionObtained().calculateCommissionAmount(tickets[i]);
	 }
	 System.out.printf("Commission obtained per each person:Rs.%.2f",commission);
	 }
	}
