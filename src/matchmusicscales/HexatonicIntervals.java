package matchmusicscales;

/**
 *
 * @author angervuorisa
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Collections;
import static matchmusicscales.PentatonicIntervals.scaleCounter;

public class HexatonicIntervals {

    public static LinkedHashSet<String> hashList;
    private String[] hexatonicIntervals = new String[6];
    public String[] hexatonicIntervalsAll = new String[384];
    public String[] myIntervalsCleaned = new String[54612];

    char H = 'H'; //Half Step
    char W = 'W'; // Whole Step
    char m = 'm'; // minor 3rd
    char M = 'M'; // Major 3rd

    String stringIntervals;

    static int charCounter = -1;

    public void setHexatonicInterval(String intervallit) {

        charCounter = charCounter + 1;
        hexatonicIntervals[charCounter] = intervallit;

    }

    public String[] getAllHexatonicIntervals(String intervalCount) {

        int scaleCounter;
        IntervalGenerator gen = new IntervalGenerator();

        switch (intervalCount) {

            case "3": //Kolme intevallia syötetty
                scaleCounter = -1;
                for (int counterOut = 0; counterOut <= 4; counterOut++) {
                    switch (counterOut) {
                        case 1:
                            hexatonicIntervals[3] = String.valueOf('W');

                            for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                switch (counterIn) {
                                    case 1:
                                        hexatonicIntervals[4] = String.valueOf('W');

                                        this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 2:
                                        hexatonicIntervals[4] = String.valueOf(H);

                                        this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 3:
                                        hexatonicIntervals[4] = String.valueOf(m);

                                        this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                    case 4:
                                        hexatonicIntervals[4] = String.valueOf(M);

                                        this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                }
                            }

                            break;
                        case 2:
                            hexatonicIntervals[3] = String.valueOf(H);

                            for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                switch (counterIn) {
                                    case 1:
                                        hexatonicIntervals[4] = String.valueOf('W');

                                        this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 2:
                                        hexatonicIntervals[4] = String.valueOf(H);

                                        this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 3:
                                        hexatonicIntervals[4] = String.valueOf(m);

                                        this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                    case 4:
                                        hexatonicIntervals[4] = String.valueOf(M);

                                        this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                }
                            }

                            break;
                        case 3:
                            hexatonicIntervals[3] = String.valueOf(m);

                            for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                switch (counterIn) {
                                    case 1:
                                        hexatonicIntervals[4] = String.valueOf('W');

                                        this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 2:
                                        hexatonicIntervals[4] = String.valueOf(H);

                                        this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 3:
                                        hexatonicIntervals[4] = String.valueOf(m);

                                        this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                    case 4:
                                        hexatonicIntervals[4] = String.valueOf(M);

                                        this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                }
                            }
                            break;
                        case 4:
                            hexatonicIntervals[3] = String.valueOf(M);

                            for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                switch (counterIn) {
                                    case 1:
                                        hexatonicIntervals[4] = String.valueOf('W');

                                        this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 2:
                                        hexatonicIntervals[4] = String.valueOf(H);

                                        this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 3:
                                        hexatonicIntervals[4] = String.valueOf(m);

                                        this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                    case 4:
                                        hexatonicIntervals[4] = String.valueOf(M);

                                        this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                }
                            }
                            break;
                    }
                }
                break;

            case "4": //Neljä intervallia syötetty (OK)

                scaleCounter = -1;
                for (int counterOut = 0; counterOut <= 4; counterOut++) {
                    switch (counterOut) {
                        case 1:
                            hexatonicIntervals[4] = String.valueOf('W');

                            this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                            scaleCounter = gen.getScaleCounter();

                            break;
                        case 2:
                            hexatonicIntervals[4] = String.valueOf(H);

                            this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                            scaleCounter = gen.getScaleCounter();

                            break;
                        case 3:
                            hexatonicIntervals[4] = String.valueOf(m);

                            this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                            scaleCounter = gen.getScaleCounter();
                            break;
                        case 4:
                            hexatonicIntervals[4] = String.valueOf(M);

                            this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                            scaleCounter = gen.getScaleCounter();
                            break;
                    }
                }
                break;

            case "5": //Viisi intervallia syötetty (OK)
                scaleCounter = -1;
                this.hexatonicIntervalsAll = gen.getSixthIntervals(hexatonicIntervals, scaleCounter);
                scaleCounter = gen.getScaleCounter();
                break;

            case "6": //kuusi intervallia syötetty (OK)
                scaleCounter = -1;
                for (int i = 0; i <= 5; i++) {
                    //"rotate" the intervals Array
                    Collections.rotate(Arrays.asList(hexatonicIntervals), 1);
                    hexatonicIntervalsAll[i] = String.join("", hexatonicIntervals);
                }
                break;
        }
        return hexatonicIntervalsAll;
    }

}
