package trainData;
import trainData.tickets.*;
import interfaces.*;

public class displayTicketPrice implements interfaces.displayTicketPrice {
    public int adultTicket,childTicket,sum;
    public int ticketPrice(int bookingClass, int trainNumber, int noAdults, int noChild){

        if(bookingClass==3){
            childThirdClass object3=new childThirdClass();
            if(noAdults!=0) {
                adultTicket=object3.unitPriceAdult(trainNumber);
            }
            if(noChild!=0) {
                childTicket=object3.unitPrice(trainNumber);
            }
        }
        else if(bookingClass==2){
            childSecondClass object2=new childSecondClass();
            if(noAdults!=0) {
                adultTicket=object2.unitPriceAdult(trainNumber);
            }
            if(noChild!=0) {
                childTicket=object2.unitPrice(trainNumber);
            }
        }
        else{
            childFirstClass object1=new childFirstClass();
            if(noAdults!=0) {
                adultTicket=object1.unitPriceAdult(trainNumber);
            }
            if(noChild!=0) {
                childTicket=object1.unitPrice(trainNumber);
            }
        }
        sum=adultTicket*noAdults+childTicket*noChild;
        return sum;
    }

}

