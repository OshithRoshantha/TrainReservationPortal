package trainData.tickets;

class adultFirstClass {
    final int price1=1600;  //firstClass ticket prices with 7 price variations
    final int price2=1450;
    final int price3=750;
    final int price4=2250;
    final int price5=1800;
    final int price6=950;
    final int price7=1700;
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
public class childFirstClass extends adultFirstClass{
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
