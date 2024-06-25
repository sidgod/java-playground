package in.ubersid.cassidoo;

public class DailyTemperatures {

    public int[] warmerTemperatures(int[] temperatures) {
        if(temperatures == null)
            return null;
        int[] warmerTemp = new int[temperatures.length];

        for(int i = 0; i < temperatures.length - 1; i++) {
            int daysCounter = 0;
            boolean foundWarmer = false;
            for(int j = i+1; j < temperatures.length; j++) {
                if(temperatures[i] >= temperatures[j]) {
                    daysCounter++;
                } else {
                    daysCounter++;
                    foundWarmer = true;
                    break;
                }
            }

            if(!foundWarmer)
                daysCounter = 0;

            warmerTemp[i] = daysCounter;
        }

        warmerTemp[warmerTemp.length - 1] = 0;

        return warmerTemp;
    }

}
