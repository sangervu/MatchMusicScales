package matchmusicscales;

/**
 * @author Sakari Angervuori
 */
import java.awt.Color;
import static java.awt.SystemColor.text;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import java.util.Scanner;
import java.awt.*;

/**
 * @author angervuorisa
 */
public class MainActivity {

    /**
     *
     */
    public static String intervallit;

    /**
     * @param args
     */
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

        CheckIntervals intervalCheckA = new CheckIntervals();

        System.out.println("Syötä intervallit W, H, m, tai M (min kolme ja max kahdeksan intervallia)");
        intervallit = input.nextLine();

        if (intervallit.length() < 3 || intervallit.length() > 8) {
            System.out.println("Intervalleja ei saa olla alle kolme, tai yli kahdeksan");
        }

        int intervalliLaskuri = intervallit.length();
        switch (intervalliLaskuri) {

            case 3: // annettu kolme intervallia
                for (int i = 0; i < intervallit.length(); i++) {

                    if ((intervallit.charAt(i) != W) && (intervallit.charAt(i) != H) && (intervallit.charAt(i) != m) && (intervallit.charAt(i) != M)) {
                        System.out.println("intervalleja ei tunnistettu");
                        System.exit(i);
                    } else {
                        pentatonic.setPentatonicInterval(String.valueOf(intervallit.charAt(i)));
                        hexatonic.setHexatonicInterval(String.valueOf(intervallit.charAt(i)));
                        heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                        octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                    }
                }

                //Pentatoniset asteikot
                String[] pentatonicIntervalsAll3 = pentatonic.getAllPentatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedPenta3 = intervalCheckA.getMyTrueScales(pentatonicIntervalsAll3);
                System.out.println("Pentatoniset asteikot:");
                for (String t : myIntervalsCleanedPenta3) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedPenta3.length == 0) {
                    System.out.println("N.A.");
                }

                //Hexatoniset asteikot
                CheckIntervals intervalCheckB = new CheckIntervals();
                String[] hexatonicIntervalsAll3 = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHexa3 = intervalCheckB.getMyTrueScales(hexatonicIntervalsAll3);
                System.out.println("Hexatoniset asteikot:");
                for (String t : myIntervalsCleanedHexa3) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHexa3.length == 0) {
                    System.out.println("N.A.");
                }

                // Heptatoniset asteikeot
                CheckIntervals intervalCheckC = new CheckIntervals();
                String[] heptatonicIntervalsAll3 = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHepta3 = intervalCheckC.getMyTrueScales(heptatonicIntervalsAll3);
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedHepta3) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHepta3.length == 0) {
                    System.out.println("N.A.");
                }

                //Oktatoniset asteikot
                CheckIntervals intervalCheckD = new CheckIntervals();
                String[] octatonicIntervalsAll3 = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedOcta3 = intervalCheckD.getMyTrueScales(octatonicIntervalsAll3);
                System.out.println("Oktatoniset asteikot:");
                for (String t : myIntervalsCleanedOcta3) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedOcta3.length == 0) {
                    System.out.println("N.A.");
                }
                break;

            case 4: // annettu neljä intervallia
                for (int i = 0; i < intervallit.length(); i++) {

                    if ((intervallit.charAt(i) != W) && (intervallit.charAt(i) != H) && (intervallit.charAt(i) != m) && (intervallit.charAt(i) != M)) {
                        System.out.println("intervalleja ei tunnistettu");
                        System.exit(i);
                    } else {
                        pentatonic.setPentatonicInterval(String.valueOf(intervallit.charAt(i)));
                        hexatonic.setHexatonicInterval(String.valueOf(intervallit.charAt(i)));
                        heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                        octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                    }
                }

                //Pentatoniset asteikot
                String[] pentatonicIntervalsAll4 = pentatonic.getAllPentatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedPenta4 = intervalCheckA.getMyTrueScales(pentatonicIntervalsAll4);
                System.out.println("Pentatoniset asteikot:");
                for (String t : myIntervalsCleanedPenta4) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedPenta4.length == 0) {
                    System.out.println("N.A.");
                }

                //Hexatoniset asteikot
                CheckIntervals intervalCheckE = new CheckIntervals();
                String[] hexatonicIntervalsAll4 = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHexa4 = intervalCheckE.getMyTrueScales(hexatonicIntervalsAll4);
                System.out.println("Hexatoniset asteikot:");
                for (String t : myIntervalsCleanedHexa4) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHexa4.length == 0) {
                    System.out.println("N.A.");
                }

                // Heptatoniset asteikeot
                CheckIntervals intervalCheckF = new CheckIntervals();
                String[] heptatonicIntervalsAll4 = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHepta4 = intervalCheckF.getMyTrueScales(heptatonicIntervalsAll4);
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedHepta4) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHepta4.length == 0) {
                    System.out.println("N.A.");
                }

                //Oktatoniset asteikot
                CheckIntervals intervalCheckG = new CheckIntervals();
                String[] octatonicIntervalsAll4 = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedOcta4 = intervalCheckG.getMyTrueScales(octatonicIntervalsAll4);
                System.out.println("Oktatoniset asteikot:");
                for (String t : myIntervalsCleanedOcta4) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedOcta4.length == 0) {
                    System.out.println("N.A.");
                }
                break;

            case 5: //annettu viisi intervallia

                for (int i = 0; i < intervallit.length(); i++) {

                    if ((intervallit.charAt(i) != W) && (intervallit.charAt(i) != H) && (intervallit.charAt(i) != m) && (intervallit.charAt(i) != M)) {
                        System.out.println("intervalleja ei tunnistettu");
                        System.exit(i);
                    } else {
                        pentatonic.setPentatonicInterval(String.valueOf(intervallit.charAt(i)));
                        hexatonic.setHexatonicInterval(String.valueOf(intervallit.charAt(i)));
                        heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                        octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                    }
                }

                //Pentatoniset asteikot
                String[] pentatonicIntervalsAll5 = pentatonic.getAllPentatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedPenta5 = intervalCheckA.getMyTrueScales(pentatonicIntervalsAll5);
                System.out.println("Pentatoniset asteikot:");
                for (String t : myIntervalsCleanedPenta5) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedPenta5.length == 0) {
                    System.out.println("N.A.");
                }

                //Hexatoniset asteikot
                CheckIntervals intervalCheckH = new CheckIntervals();
                String[] hexatonicIntervalsAll5 = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHexa5 = intervalCheckH.getMyTrueScales(hexatonicIntervalsAll5);
                System.out.println("Hexatoniset asteikot:");
                for (String t : myIntervalsCleanedHexa5) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHexa5.length == 0) {
                    System.out.println("N.A.");
                }

                // Heptatoniset asteikeot
                CheckIntervals intervalCheckI = new CheckIntervals();
                String[] heptatonicIntervalsAll5 = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHepta5 = intervalCheckI.getMyTrueScales(heptatonicIntervalsAll5);
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedHepta5) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHepta5.length == 0) {
                    System.out.println("N.A.");
                }

                //Oktatoniset asteikot
                CheckIntervals intervalCheckJ = new CheckIntervals();
                String[] octatonicIntervalsAll5 = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedOcta5 = intervalCheckJ.getMyTrueScales(octatonicIntervalsAll5);
                System.out.println("Oktatoniset asteikot:");
                for (String t : myIntervalsCleanedOcta5) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedOcta5.length == 0) {
                    System.out.println("N.A.");
                }
                break;

            case 6: //annettu kuusi intervallia

                for (int i = 0; i < intervallit.length(); i++) {

                    if ((intervallit.charAt(i) != W) && (intervallit.charAt(i) != H) && (intervallit.charAt(i) != m) && (intervallit.charAt(i) != M)) {
                        System.out.println("intervalleja ei tunnistettu");
                        System.exit(i);
                    } else {
                        hexatonic.setHexatonicInterval(String.valueOf(intervallit.charAt(i)));
                        heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                        octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                    }
                }

                //Hexatoniset asteikot
                String[] hexatonicIntervalsAll6 = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHexa6 = intervalCheckA.getMyTrueScales(hexatonicIntervalsAll6);
                System.out.println("Hexatoniset asteikot:");
                for (String t : myIntervalsCleanedHexa6) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHexa6.length == 0) {
                    System.out.println("N.A.");
                }

                // Heptatoniset asteikeot
                CheckIntervals intervalCheckK = new CheckIntervals();
                String[] heptatonicIntervalsAll6 = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHepta6 = intervalCheckK.getMyTrueScales(heptatonicIntervalsAll6);
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedHepta6) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHepta6.length == 0) {
                    System.out.println("N.A.");
                }

                //Oktatoniset asteikot
                CheckIntervals intervalCheckL = new CheckIntervals();
                String[] octatonicIntervalsAll6 = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedOcta6 = intervalCheckL.getMyTrueScales(octatonicIntervalsAll6);
                System.out.println("Oktatoniset asteikot:");
                for (String t : myIntervalsCleanedOcta6) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedOcta6.length == 0) {
                    System.out.println("N.A.");
                }
                break;

            case 7: //annettu seitemän intervallia

                for (int i = 0; i < intervallit.length(); i++) {

                    if ((intervallit.charAt(i) != W) && (intervallit.charAt(i) != H) && (intervallit.charAt(i) != m) && (intervallit.charAt(i) != M)) {
                        System.out.println("intervalleja ei tunnistettu");
                        System.exit(i);
                    } else {

                        heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                        octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                    }
                }

                // Heptatoniset asteikeot
                String[] heptatonicIntervalsAll = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHepta = intervalCheckA.getMyTrueScales(heptatonicIntervalsAll);
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedHepta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHepta.length == 0) {
                    System.out.println("N.A.");
                }

                // Oktatoniset asteikot
                CheckIntervals intervalCheckM = new CheckIntervals();
                String[] octatonicIntervalsAll7 = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                //System.out.println(Arrays.toString(octatonicIntervalsAll7));
                String[] myIntervalsCleanedOcta7 = intervalCheckM.getMyTrueScales(octatonicIntervalsAll7);

                System.out.println("Oktatoniset asteikot:");
                for (String t : myIntervalsCleanedOcta7) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedOcta7.length == 0) {
                    System.out.println("N.A.");
                }

                break;

            case 8: // annettu kahdeksan intervallia

                for (int i = 0; i < intervallit.length(); i++) {

                    if ((intervallit.charAt(i) != W) && (intervallit.charAt(i) != H) && (intervallit.charAt(i) != m) && (intervallit.charAt(i) != M)) {
                        System.out.println("intervalleja ei tunnistettu");
                        System.exit(i);
                    } else {
                        octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                    }
                }

                String[] octatonicIntervalsAll8 = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedOcta8 = intervalCheckA.getMyTrueScales(octatonicIntervalsAll8);

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
