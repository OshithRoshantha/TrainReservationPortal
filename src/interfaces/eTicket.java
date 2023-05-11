package interfaces;
import java.io.IOException;

public interface eTicket {
    void eTicketPrint(int trainNo,int totalAmount,int reserveClass,String from,String to,int noAdults,int noChild,int month,int day) throws IOException;
}
