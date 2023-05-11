package interfaces;
import java.io.IOException;

public interface paymentSlipPrint {
    void paymentPrint(String cardType,int totalAmount,int paymentID) throws IOException;
}
