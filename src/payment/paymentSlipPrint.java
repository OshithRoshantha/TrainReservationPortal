package payment;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import User.*;
import interfaces.*;

public class paymentSlipPrint implements interfaces.paymentSlipPrint {
    public void paymentPrint(String cardType,int totalAmount,int paymentID) throws IOException {
        userData access11=new userData();
        File slip=new File("PaymentConfirmation.txt");
        FileWriter ob2=new FileWriter(slip);
        PrintWriter text2=new PrintWriter(ob2);
        Date time=new Date();
        SimpleDateFormat nowTime=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        text2.println("---------------------------------------------");
        text2.println("PAYMENT CONFIRMATION");
        text2.println("Transaction ID: "+paymentID);
        text2.println("---------------------------------------------");
        text2.println("Here is the summary of your payment.");
        text2.println("Payment Information:");
        text2.println("     Date:\t\t\t"+nowTime.format(time));
        if(access11.getCardNumber().length()==16)
            text2.println("     Status:\t\tSuccess");
        else
            text2.println("     Status:\t\tUn-success");
        if(cardType.equals("visa"))
            text2.println("     Payment Method:\t(VISA)");
        else
            text2.println("     Payment Method:\t(MasterCard)");
        if(access11.getCardNumber().length()==16)
            text2.println("     Card Number:\t\tXXXX-XXXX-"+access11.getCardNumber().substring(8,12)+"-"+access11.getCardNumber().substring(12));
        else
            text2.println("     Card Number:\t\tInvalid card number");
        text2.println("Payment Details:");
        text2.println("     Sub Total:\t\tLRK\t"+totalAmount);
        text2.println("\n---------------------------------------------");
        text2.println("               By Oshith Roshantha.");
        text2.println("---------------------------------------------");
        text2.println("---------------------------------------------");

        text2.close();
    }
}
