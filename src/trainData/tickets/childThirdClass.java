package trainData.tickets;

class adultThirdClass {
    final int price1=460; //thirdClass ticket prices with 7 price variations
    final int price2=360;
    final int price3=200;
    final int price4=560;
    final int price5=440;
    final int price6=240;
    final int price7=420;
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
public class childThirdClass extends adultThirdClass{
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
