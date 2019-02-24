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

public class OctatonicIntervals {

    public static LinkedHashSet<String> hashList;
    private String[] octatonicIntervals = new String[8];
    public String[] octatonicIntervalsAll = new String[384];
    public String[] myIntervalsCleaned = new String[54612];

    char H = 'H'; //Half Step
    char W = 'W'; // Whole Step
    char m = 'm'; // minor 3rd
    char M = 'M'; // Major 3rd

    String stringIntervals;

    static int charCounter = -1;

    public void setOctatonicInterval(String intervallit) {

        charCounter = charCounter + 1;
        octatonicIntervals[charCounter] = intervallit;

    }

    public String[] getAllOctatonicIntervals(String intervalCount) {

        int scaleCounter;
        IntervalGenerator gen = new IntervalGenerator();

        switch (intervalCount) {

            case "3": //Kolme intevallia syötetty
                scaleCounter = -1;
                for (int counterOut = 0; counterOut <= 4; counterOut++) {
                    switch (counterOut) {
                        case 1:
                            octatonicIntervals[3] = String.valueOf('W');

                            for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                switch (counterIn) {
                                    case 1:
                                        octatonicIntervals[4] = String.valueOf('W');

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 2:
                                        octatonicIntervals[4] = String.valueOf(H);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 3:
                                        octatonicIntervals[4] = String.valueOf(m);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                    case 4:
                                        octatonicIntervals[4] = String.valueOf(M);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                }
                            }

                            break;
                        case 2:
                            octatonicIntervals[3] = String.valueOf(H);

                            for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                switch (counterIn) {
                                    case 1:
                                        octatonicIntervals[4] = String.valueOf('W');

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 2:
                                        octatonicIntervals[4] = String.valueOf(H);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 3:
                                        octatonicIntervals[4] = String.valueOf(m);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                    case 4:
                                        octatonicIntervals[4] = String.valueOf(M);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                }
                            }

                            break;
                        case 3:
                            octatonicIntervals[3] = String.valueOf(m);

                            for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                switch (counterIn) {
                                    case 1:
                                        octatonicIntervals[4] = String.valueOf('W');

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 2:
                                        octatonicIntervals[4] = String.valueOf(H);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 3:
                                        octatonicIntervals[4] = String.valueOf(m);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                    case 4:
                                        octatonicIntervals[4] = String.valueOf(M);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                }
                            }
                            break;
                        case 4:
                            octatonicIntervals[3] = String.valueOf(M);

                            for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                switch (counterIn) {
                                    case 1:
                                        octatonicIntervals[4] = String.valueOf('W');

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 2:
                                        octatonicIntervals[4] = String.valueOf(H);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 3:
                                        octatonicIntervals[4] = String.valueOf(m);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                    case 4:
                                        octatonicIntervals[4] = String.valueOf(M);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                }
                            }
                            break;
                    }
                }
                break;

            case "4": //Neljä intervallia syötetty

                scaleCounter = -1;
                for (int counterOut = 0; counterOut <= 4; counterOut++) {
                    switch (counterOut) {
                        case 1:
                            octatonicIntervals[4] = String.valueOf('W');

                            for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                switch (counterIn) {
                                    case 1:
                                        octatonicIntervals[5] = String.valueOf('W');

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 2:
                                        octatonicIntervals[5] = String.valueOf(H);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 3:
                                        octatonicIntervals[5] = String.valueOf(m);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                    case 4:
                                        octatonicIntervals[5] = String.valueOf(M);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                }
                            }

                            break;
                        case 2:
                            octatonicIntervals[4] = String.valueOf(H);

                            for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                switch (counterIn) {
                                    case 1:
                                        octatonicIntervals[5] = String.valueOf('W');

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 2:
                                        octatonicIntervals[5] = String.valueOf(H);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 3:
                                        octatonicIntervals[5] = String.valueOf(m);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                    case 4:
                                        octatonicIntervals[5] = String.valueOf(M);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                }
                            }

                            break;
                        case 3:
                            octatonicIntervals[4] = String.valueOf(m);

                            for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                switch (counterIn) {
                                    case 1:
                                        octatonicIntervals[5] = String.valueOf('W');

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 2:
                                        octatonicIntervals[5] = String.valueOf(H);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 3:
                                        octatonicIntervals[5] = String.valueOf(m);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                    case 4:
                                        octatonicIntervals[5] = String.valueOf(M);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                }
                            }
                            break;
                        case 4:
                            octatonicIntervals[4] = String.valueOf(M);

                            for (int counterIn = 0; counterIn <= 4; counterIn++) {
                                switch (counterIn) {
                                    case 1:
                                        octatonicIntervals[5] = String.valueOf('W');

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 2:
                                        octatonicIntervals[5] = String.valueOf(H);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();

                                        break;
                                    case 3:
                                        octatonicIntervals[5] = String.valueOf(m);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                    case 4:
                                        octatonicIntervals[5] = String.valueOf(M);

                                        this.octatonicIntervalsAll = gen.getSixthIntervals(octatonicIntervals, scaleCounter);
                                        scaleCounter = gen.getScaleCounter();
                                        break;
                                }
                            }
                            break;
                    }
                }
                break;

            case "5": //Viisi intervallia syötetty (OK)
                scaleCounter = -1;
                for (int counterOut = 0; counterOut <= 4; counterOut++) {
                    switch (counterOut) {
                        case 1:
                            octatonicIntervals[5] = String.valueOf('W');

                            this.octatonicIntervalsAll = gen.getSeventhIntervals(octatonicIntervals, scaleCounter);
                            scaleCounter = gen.getScaleCounter();

                            break;
                        case 2:
                            octatonicIntervals[5] = String.valueOf(H);

                            this.octatonicIntervalsAll = gen.getSeventhIntervals(octatonicIntervals, scaleCounter);
                            scaleCounter = gen.getScaleCounter();

                            break;
                        case 3:
                            octatonicIntervals[5] = String.valueOf(m);

                            this.octatonicIntervalsAll = gen.getSeventhIntervals(octatonicIntervals, scaleCounter);
                            scaleCounter = gen.getScaleCounter();
                            break;
                        case 4:
                            octatonicIntervals[5] = String.valueOf(M);

                            this.octatonicIntervalsAll = gen.getSeventhIntervals(octatonicIntervals, scaleCounter);
                            scaleCounter = gen.getScaleCounter();
                            break;
                    }
                }
                break;

            case "7": //Seitsemän intervallia syötetty
                scaleCounter = -1;
                this.octatonicIntervalsAll = gen.getEigthIntervals(octatonicIntervals, scaleCounter);
                scaleCounter = gen.getScaleCounter();
                break;

            case "8": //Kahdeksan intervallia syötetty (OK)
                scaleCounter = -1;
                for (int i = 0; i <= 7; i++) {
                    //"rotate" the intervals Array
                    Collections.rotate(Arrays.asList(octatonicIntervals), 1);
                    octatonicIntervalsAll[i] = String.join("", octatonicIntervals);
                }
                break;
        }
        return octatonicIntervalsAll;
    }

}