package trainData;
import java.util.ArrayList;
import java.util.Arrays;
import interfaces.*;

public class displayTrainList implements interfaces.displayTrainList {
    public String[] trainList(String startStation, String endStation){

        trainData.batticaloaLine.timeList line1 = new trainData.batticaloaLine.timeList();
        trainData.costalLine.timeList line2 = new trainData.costalLine.timeList();
        trainData.kelaniValleyLine.timeList line3 = new trainData.kelaniValleyLine.timeList();
        trainData.mainLine.timeList line4 = new trainData.mainLine.timeList();
        trainData.mannarLine.timeList line5 = new trainData.mannarLine.timeList();
        trainData.mataleLine.timeList line6 = new trainData.mataleLine.timeList();
        trainData.northernLine.timeList line7 = new trainData.northernLine.timeList();
        trainData.puttalamLine.timeList line8 = new trainData.puttalamLine.timeList();
        trainData.tricomaleeLine.timeList line9 = new trainData.tricomaleeLine.timeList();
        ArrayList<String> combinedDepartureTimes = new ArrayList<>();

            if(!startStation.equals(endStation)){
                if (Arrays.asList(line1.stationList).contains(startStation.toLowerCase()) && Arrays.asList(line1.stationList).contains(endStation.toLowerCase())) {
                    for (String[] departureTime : line1.departureTime) {
                        combinedDepartureTimes.add(Arrays.toString(departureTime));
                    }

                }
                if (Arrays.asList(line2.stationList).contains(startStation.toLowerCase()) && Arrays.asList(line2.stationList).contains(endStation.toLowerCase())) {
                    for (String[] departureTime : line2.departureTime) {
                        combinedDepartureTimes.add(Arrays.toString(departureTime));
                    }

                }
                if (Arrays.asList(line3.stationList).contains(startStation.toLowerCase()) && Arrays.asList(line3.stationList).contains(endStation.toLowerCase())) {
                    for (String[] departureTime : line3.departureTime) {
                        combinedDepartureTimes.add(Arrays.toString(departureTime));
                    }

                }
                if (Arrays.asList(line4.stationList).contains(startStation.toLowerCase()) && Arrays.asList(line4.stationList).contains(endStation.toLowerCase())) {
                    for (String[] departureTime : line4.departureTime) {
                        combinedDepartureTimes.add(Arrays.toString(departureTime));
                    }

                }
                if (Arrays.asList(line5.stationList).contains(startStation.toLowerCase()) && Arrays.asList(line5.stationList).contains(endStation.toLowerCase())) {
                    for (String[] departureTime : line5.departureTime) {
                        combinedDepartureTimes.add(Arrays.toString(departureTime));
                    }

                }
                if (Arrays.asList(line6.stationList).contains(startStation.toLowerCase()) && Arrays.asList(line6.stationList).contains(endStation.toLowerCase())) {
                    for (String[] departureTime : line6.departureTime) {
                        combinedDepartureTimes.add(Arrays.toString(departureTime));
                    }

                }
                if (Arrays.asList(line7.stationList).contains(startStation.toLowerCase()) && Arrays.asList(line7.stationList).contains(endStation.toLowerCase())) {
                    for (String[] departureTime : line7.departureTime) {
                        combinedDepartureTimes.add(Arrays.toString(departureTime));
                    }

                }
                if (Arrays.asList(line8.stationList).contains(startStation.toLowerCase()) && Arrays.asList(line8.stationList).contains(endStation.toLowerCase())) {
                    for (String[] departureTime : line8.departureTime) {
                        combinedDepartureTimes.add(Arrays.toString(departureTime));
                    }

                }
                if (Arrays.asList(line9.stationList).contains(startStation.toLowerCase()) && Arrays.asList(line9.stationList).contains(endStation.toLowerCase())) {
                    for (String[] departureTime : line9.departureTime) {
                        combinedDepartureTimes.add(Arrays.toString(departureTime));
                    }

                }
            }
        String[] trainArray = combinedDepartureTimes.toArray(new String[combinedDepartureTimes.size()]);
        return trainArray;
    }
}

