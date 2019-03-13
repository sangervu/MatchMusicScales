package matchmusicscales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/**
 *
 * @author angervuorisa
 */
public class CheckIntervals {

    String[] myIntervalsReal = new String[79]; //Taulukon koko pitää olla riittävän suuri
    String[] myIntervalsCleaned = new String[7];
    LinkedHashSet<String> hashList;

    MusicScales scales = new MusicScales();

    private int laskuri = -1;
    /**
     *
     * @param intervals
     * @return
     */
    public String[] getMyTrueScales(String[] intervals) {

        MusicScales scales = new MusicScales();

        //int laskuri = -1;

        //puhdistetun taulukon koko, jossa kaikki ovat potentiaalisia skaaloja
        //luupin pituus saa olla max taulukon koko
        for (String t : intervals) {
            String scale = scales.getScales(t);

            if (scale != null) {
                laskuri = laskuri + 1;
                myIntervalsReal[laskuri] = t;
            }
        }
        myIntervalsReal = Arrays.copyOf(myIntervalsReal, laskuri + 1);

        myIntervalsCleaned = getCleanScales(myIntervalsReal);

        return myIntervalsCleaned;
    }

    /**
     *
     * @param intervals
     * @return
     */
    public String[] getCleanScales(String[] intervals) {
        //* Creating ArrayList of Array
        List<String> myIntervalsList = new ArrayList<String>(Arrays.asList(intervals));
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
        myIntervalsCleaned = hashList.toArray(myIntevalsCleanedAll);
        return myIntervalsCleaned;
    }

    /**
     *
     */
    public void resetScales() {
        
        laskuri=-1;
        
        

    }

}
