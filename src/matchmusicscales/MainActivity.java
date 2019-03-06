package matchmusicscales;

/**
 * @author Sakari Angervuori
 */
import java.util.Arrays;
import java.util.Scanner;

public class MainActivity {

    public static String intervallit;

    public static void main(String[] args) {

        char H = 'H'; //Half Step
        char W = 'W'; // Whole Step
        char m = 'm'; // minor 3rd
        char M = 'M'; // Major 3rd

        Scanner input = new Scanner(System.in);

        MusicScales scales = new MusicScales();
        PentatonicIntervals pentatonic = new PentatonicIntervals();
        HexatonicIntervals hexatonic = new HexatonicIntervals();
        HeptatonicIntervals heptatonic = new HeptatonicIntervals();
        OctatonicIntervals octatonic = new OctatonicIntervals();

        CheckIntervals intervalCheck = new CheckIntervals();

        System.out.println("Syötä intervallit W, H, m, tai M (min kolme ja max kahdeksan intervallia)");
        intervallit = input.nextLine();

        if (intervallit.length() < 3 && intervallit.length() > 8) {
            System.out.println("Intervalleja ei saa olla alle kolme, tai yli kahdeksan");
        }

        int intervalliLaskuri = intervallit.length();
        switch (intervalliLaskuri) {

            case 3: // annettu kolme intervallia

                if (intervallit.length() >= 3 && intervallit.length() <= 5) {
                    for (int i = 0; i < intervallit.length(); i++) {

                        if ((intervallit.charAt(i) != W) && (intervallit.charAt(i) != H) && (intervallit.charAt(i) != m) && (intervallit.charAt(i) != M)) {
                            System.out.println("intervalleja ei tunnistettu");
                        } else {
                            //some code here
                            pentatonic.setPentatonicInterval(String.valueOf(intervallit.charAt(i)));
                        }
                    }
                } else {
                    System.out.println("Intervalleja ei saa olla alle kolme, tai yli viisi");
                }

                String[] pentatonicIntervalsAll = pentatonic.getAllPentatonicIntervals(Integer.toString(intervallit.length()));

                //System.out.println(Arrays.toString(pentatonic.pentatonicIntervals));
                //System.out.println(Arrays.toString(pentatonicIntervalsAll));
                String[] myIntervalsCleanedPenta = intervalCheck.getMyTrueScales(pentatonicIntervalsAll);

                for (String t : myIntervalsCleanedPenta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                break;

            case 4: // annettu neljä intervallia

                System.out.println("Syötä intervallit W, H, m, tai M (max kuusi intervallia)");
                intervallit = input.nextLine();

                if (intervallit.length() >= 3 && intervallit.length() <= 6) {
                    for (int i = 0; i < intervallit.length(); i++) {

                        if ((intervallit.charAt(i) != W) && (intervallit.charAt(i) != H) && (intervallit.charAt(i) != m) && (intervallit.charAt(i) != M)) {
                            System.out.println("intervalleja ei tunnistettu");
                        } else {
                            //some code here
                            hexatonic.setHexatonicInterval(String.valueOf(intervallit.charAt(i)));
                        }
                    }
                } else {
                    System.out.println("Intervalleja ei saa olla alle kolme, tai yli kuusi");
                }

                String[] hexatonicIntervalsAll = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHexa = intervalCheck.getMyTrueScales(hexatonicIntervalsAll);

                //System.out.println(Arrays.toString(hexatonic.getAllHexatonicIntervals(intervallit)));
                //System.out.println(Arrays.toString(hexatonicIntervalsAll));
                //System.out.println(Arrays.toString(myIntervalsCleanedHexa));
                for (String t : myIntervalsCleanedHexa) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                break;

            case 5: //annettu viisi intervallia

                for (int i = 0; i < intervallit.length(); i++) {

                    if ((intervallit.charAt(i) != W) && (intervallit.charAt(i) != H) && (intervallit.charAt(i) != m) && (intervallit.charAt(i) != M)) {
                        System.out.println("intervalleja ei tunnistettu");
                    } else {
                        //some code here
                        heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                    }
                }

                //String[] heptatonicIntervalsAll = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                //System.out.println(Arrays.toString(heptatonic.getAllHeptatonicIntervals(intervallit)));
                //System.out.println(Arrays.toString(pentatonicIntervalsAll));
                //String[] myIntervalsCleanedHepta = intervalCheck.getMyTrueScales(heptatonicIntervalsAll);

                /*for (String t : myIntervalsCleanedHepta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }*/
                break;

            case 6: //annettu kuusi intervallia (OK)

                for (int i = 0; i < intervallit.length(); i++) {

                    if ((intervallit.charAt(i) != W) && (intervallit.charAt(i) != H) && (intervallit.charAt(i) != m) && (intervallit.charAt(i) != M)) {
                        System.out.println("intervalleja ei tunnistettu");
                    } else {
                        hexatonic.setHexatonicInterval(String.valueOf(intervallit.charAt(i)));
                        heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                        octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                    }
                }

                //Hexatoniset asteikot
                String[] hexatonicIntervalsAll6 = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHexa6 = intervalCheck.getMyTrueScales(hexatonicIntervalsAll6);
                System.out.println("Hexatoniset asteikot:");
                for (String t : myIntervalsCleanedHexa6) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHexa6.length == 0) {
                    System.out.println("N.A.");
                }

                // Heptatoniset asteikeot
                CheckIntervals intervalCheck8 = new CheckIntervals();
                String[] heptatonicIntervalsAll6 = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHepta6 = intervalCheck8.getMyTrueScales(heptatonicIntervalsAll6);
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedHepta6) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHepta6.length == 0) {
                    System.out.println("N.A.");
                }

                //Oktatoniset asteikot
                CheckIntervals intervalCheck9 = new CheckIntervals();
                String[] octatonicIntervalsAll6 = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedOcta6 = intervalCheck9.getMyTrueScales(octatonicIntervalsAll6);
                System.out.println("Oktatoniset asteikot:");
                for (String t : myIntervalsCleanedOcta6) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedOcta6.length == 0) {
                    System.out.println("N.A.");
                }
                break;

            case 7: //annettu seitemän intervallia (OK)

                for (int i = 0; i < intervallit.length(); i++) {

                    if ((intervallit.charAt(i) != W) && (intervallit.charAt(i) != H) && (intervallit.charAt(i) != m) && (intervallit.charAt(i) != M)) {
                        System.out.println("intervalleja ei tunnistettu");
                    } else {

                        heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                        octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                    }
                }

                // Heptatoniset asteikeot
                String[] heptatonicIntervalsAll = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHepta = intervalCheck.getMyTrueScales(heptatonicIntervalsAll);
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedHepta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHepta.length == 0) {
                    System.out.println("N.A.");
                }

                // Oktatoniset asteikot
                CheckIntervals intervalCheck10 = new CheckIntervals();
                String[] octatonicIntervalsAll7 = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedOcta7 = intervalCheck10.getMyTrueScales(octatonicIntervalsAll7);

                System.out.println("Oktatoniset asteikot:");
                for (String t : myIntervalsCleanedOcta7) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedOcta7.length == 0) {
                    System.out.println("N.A.");
                }

                break;

            case 8: // annettu kahdeksan intervallia (OK)

                for (int i = 0; i < intervallit.length(); i++) {

                    if ((intervallit.charAt(i) != W) && (intervallit.charAt(i) != H) && (intervallit.charAt(i) != m) && (intervallit.charAt(i) != M)) {
                        System.out.println("intervalleja ei tunnistettu");
                    } else {

                        octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                    }
                }

                String[] octatonicIntervalsAll8 = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedOcta8 = intervalCheck.getMyTrueScales(octatonicIntervalsAll8);

                System.out.println("Oktatoniset asteikot:");
                for (String t : myIntervalsCleanedOcta8) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                  if (myIntervalsCleanedOcta8.length == 0) {
                    System.out.println("N.A.");
                }
                break;

        }
    }
}
