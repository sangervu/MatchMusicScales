package matchmusicscales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class CheckIntervals {

    String[] myIntervalsCleaned = new String[79]; //Taulukon koko pitää olla riittävän suuri
    //LinkedHashSet<String> hashList;

    MusicScales scales = new MusicScales();

    //int laskuri = -1;
    public String[] getMyTrueScales(String[] intervals) {

        MusicScales scales = new MusicScales();

        int laskuri = -1;

        //puhdistetun taulukon koko, jossa kaikki ovat potentiaalisia skaaloja
        //luupin pituus saa olla max taulukon koko
        for (String t : intervals) {
            String scale = scales.getScales(t);

            if (scale != null) {
                laskuri = laskuri + 1;
                myIntervalsCleaned[laskuri] = t;
            }
        }
        myIntervalsCleaned = Arrays.copyOf(myIntervalsCleaned, laskuri + 1);
        return myIntervalsCleaned;
    }

    /*public void cleanInterval() {
        //* Creating ArrayList of Array

        List<String> myIntervalsList = new ArrayList<String>(Arrays.asList(myIntervalsCleaned));
        hashList = new LinkedHashSet<String>();

        //Adding ArrayList elements to the LinkedHashSet
        // in order to remove the duplicate elements and 
        //to preserve the insertion order. *
        hashList.addAll(myIntervalsList);

        // Removing ArrayList elements
        myIntervalsList.clear();

        // Adding LinkedHashSet elements to the ArrayList
        //this.myIntervalsList.addAll(hashList);
        String[] myIntevalsCleanedAll = new String[hashList.size()];
        this.myIntervalsCleaned = hashList.toArray(myIntevalsCleanedAll);
    }*/
}
