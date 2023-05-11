package trainData.tickets;

class adultSecondClass {
    final int price1=900; //secondClass ticket prices with 7 price variations
    final int price2=750;
    final int price3=400;
    final int price4=1050;
    final int price5=900;
    final int price6=500;
    final int price7=850;
    public int unitPrice(int trainNumber){ //return the adult ticket price according to the first 2digits of train number entered by the user
        if(trainNumber/100==60)
            return price1;
        else if(trainNumber/100==80 ||trainNumber/100==87)
            return price2;
        else if(trainNumber/100==92)
            return price3;
        else if(trainNumber/100==10 ||trainNumber/100==40||trainNumber/100==11||trainNumber/100==44)
            return price4;
        else if(trainNumber/100==41)
            return price5;
        else if(trainNumber/100==34)
            return price6;
        else
            return price7;
    }
}
public class childSecondClass extends adultSecondClass{
    public int unitPriceAdult(int trainNumber){

        return super.unitPrice(trainNumber); //calls the parent method (adult ticket price)
    }
    public int unitPrice(int trainNumber){ //return the child ticket price according to the first 2digits of train number entered by the user
        if(trainNumber/100==60)
            return price1/2;
        else if(trainNumber/100==80 ||trainNumber/100==87)
            return price2/2;
        else if(trainNumber/100==92)
            return price3/2;
        else if(trainNumber/100==10 ||trainNumber/100==40||trainNumber/100==11||trainNumber/100==44)
            return price4/2;
        else if(trainNumber/100==41)
            return price5/2;
        else if(trainNumber/100==34)
            return price6/2;
        else
            return price7/2;
    }
}
