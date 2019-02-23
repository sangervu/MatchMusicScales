package matchmusicscales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Collections;

public class PentatonicIntervals {

    public static LinkedHashSet<String> hashList;
    private String[] pentatonicIntervals = new String[5];
    public String[] pentatonicIntervalsAll = new String[80];
    public String[] myIntervalsCleaned = new String[54612];

    char H = 'H'; //Half Step
    char W = 'W'; // Whole Step
    char m = 'm'; // minor 3rd
    char M = 'M'; // Major 3rd

    String stringIntervals;

    static int charCounter = -1;
    static int scaleCounter = -1;

    public void setPentatonicInterval(String intervallit) {

        charCounter = charCounter + 1;
        pentatonicIntervals[charCounter] = intervallit;

    }

    public String[] getAllPentatonicIntervals(String intervalCount) {

        IntervalGenerator gen = new IntervalGenerator();

        switch (intervalCount) {

            case "3":

                for (int counterOut = 0; counterOut <= 4; counterOut++) {
                    switch (counterOut) {
                        case 1:
                            pentatonicIntervals[3] = String.valueOf('W');

                            this.pentatonicIntervalsAll = gen.getFifthIntervals(pentatonicIntervals, scaleCounter);
                            scaleCounter = gen.getScaleCounter();

                            break;
                        case 2:
                            pentatonicIntervals[3] = String.valueOf(H);

                            this.pentatonicIntervalsAll = gen.getFifthIntervals(pentatonicIntervals, scaleCounter);
                            scaleCounter = gen.getScaleCounter();

                            break;
                        case 3:
                            pentatonicIntervals[3] = String.valueOf(m);

                            this.pentatonicIntervalsAll = gen.getFifthIntervals(pentatonicIntervals, scaleCounter);
                            scaleCounter = gen.getScaleCounter();
                            break;
                        case 4:
                            pentatonicIntervals[3] = String.valueOf(M);

                            this.pentatonicIntervalsAll = gen.getFifthIntervals(pentatonicIntervals, scaleCounter);
                            scaleCounter = gen.getScaleCounter();
                            break;
                    }
                }
                break;

            case "4":

                this.pentatonicIntervalsAll = gen.getFifthIntervals(pentatonicIntervals, scaleCounter);
                scaleCounter = gen.getScaleCounter();
                break;

            case "5":
                for (int i = 0; i <= 4; i++) {
                    //"rotate" the pentatoninIntervals Array
                    Collections.rotate(Arrays.asList(pentatonicIntervals), 1);
                    pentatonicIntervalsAll[i] = String.join("", pentatonicIntervals);
                }
                break;
        }
        return pentatonicIntervalsAll;
    }
}
