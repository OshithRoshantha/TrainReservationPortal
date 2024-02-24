package printSlip;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;
import User.*;
import interfaces.*;
public class eTicket implements interfaces.eTicket {
    public void eTicketPrint(int trainNo,int totalAmount,int reserveClass,String from,String to,int noAdults,int noChild,int month,int day)
            throws IOException {
        userData access9=new userData();
        File ticket = new File("eTicket.txt");
        FileWriter ob1 = new FileWriter(ticket);
        PrintWriter text = new PrintWriter(ob1);
        Random randomNo = new Random();
        int refNo = randomNo.nextInt(40001) + 40000;
        String timeNow = new SimpleDateFormat("HH:mm:ss").format(new Date());

            text.println("---------------------------------------------");
            text.println("          RAILWAY RESERVATION PORTAL");
            text.println("---------------------------------------------");
            text.println("Ref No:" + refNo + "\t\t\tDate:" + LocalDate.now());
            text.println("                -E-TICKET-");
            text.println("\nTrainNo:\t\t"+trainNo);
            text.println("Total Amount:\tRs."+totalAmount+" (PAID)");
            text.println("From:\t\t\t"+from.toUpperCase());
            text.println("To:\t\t\t"+to.toUpperCase());
            text.println("Departure Date:"+"\t2023-"+(month+1)+"-"+(day+1));
            if(reserveClass==3)
                text.println("\nTrain Class(Selected):\nThird Class Reserved Seats");
            else if(reserveClass==2)
                text.println("\nTrain Class(Selected):\nSecond Class Reserved Seats");
            else
                text.println("\nTrain Class(Selected):\nAir Conditioned Saloon");
            text.println(+noAdults+" ADULTS "+noChild+" CHILD seat(s) reserved.");
            text.println("\nPassenger Name:\t"+access9.getFirstName().toUpperCase().charAt(0)+"."+access9.getLastName().toUpperCase());
            text.println("Contact:\t\t"+access9.getContactNo());
            text.println("\nIssued time:\t" + timeNow);
            text.println("\n---------------------------------------------");
            text.println("               By Oshith Roshantha.");
            text.println("---------------------------------------------");
            text.println("---------------------------------------------");

            text.close();
        }

}
