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

        CheckIntervals intervalCheck1 = new CheckIntervals();
        CheckIntervals intervalCheck2 = new CheckIntervals();
        CheckIntervals intervalCheck3 = new CheckIntervals();
        CheckIntervals intervalCheck4 = new CheckIntervals();
       
        //Pentatoniset asteikot
        String[] myIntervalsCleanedForPenta;
        String[] pentatonicIntervalsForAll;
        //Hexatoniset asetikot
        String[] myIntervalsCleanedForHexa;
        String[] hexatonicIntervalsForAll;
        //Henptatoniset asetikot
        String[] myIntervalsCleanedForHepta;
        String[] heptatonicIntervalsForAll;    
        //Octatoniset asetikot
        String[] myIntervalsCleanedForOcta;
        String[] octatonicIntervalsForAll;

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
                pentatonicIntervalsForAll = pentatonic.getAllPentatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForPenta = intervalCheck1.getMyTrueScales(pentatonicIntervalsForAll);
                System.out.println("Pentatoniset asteikot:");
                for (String t : myIntervalsCleanedForPenta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForPenta.length == 0) {
                    System.out.println("N.A.");
                }

                //Hexatoniset asteikot
                hexatonicIntervalsForAll = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForHexa = intervalCheck2.getMyTrueScales(hexatonicIntervalsForAll);
                System.out.println("Hexatoniset asteikot:");
                for (String t : myIntervalsCleanedForHexa) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForHexa.length == 0) {
                    System.out.println("N.A.");
                }

                // Heptatoniset asteikeot
                String[] heptatonicIntervalsAll3 = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedHepta3 = intervalCheck3.getMyTrueScales(heptatonicIntervalsAll3);
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedHepta3) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedHepta3.length == 0) {
                    System.out.println("N.A.");
                }

                //Oktatoniset asteikot
                String[] octatonicIntervalsAll3 = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedOcta3 = intervalCheck4.getMyTrueScales(octatonicIntervalsAll3);
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
                pentatonicIntervalsForAll = pentatonic.getAllPentatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForPenta = intervalCheck1.getMyTrueScales(pentatonicIntervalsForAll);
                System.out.println("Pentatoniset asteikot:");
                for (String t : myIntervalsCleanedForPenta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForPenta.length == 0) {
                    System.out.println("N.A.");
                }

                //Hexatoniset asteikot
                hexatonicIntervalsForAll = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForHexa = intervalCheck2.getMyTrueScales(hexatonicIntervalsForAll);
                System.out.println("Hexatoniset asteikot:");
                for (String t : myIntervalsCleanedForHexa) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForHexa.length == 0) {
                    System.out.println("N.A.");
                }

                // Heptatoniset asteikeot
                heptatonicIntervalsForAll = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForHepta = intervalCheck3.getMyTrueScales(heptatonicIntervalsForAll);
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedForHepta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForHepta.length == 0) {
                    System.out.println("N.A.");
                }

                //Oktatoniset asteikot
                octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForOcta = intervalCheck4.getMyTrueScales(octatonicIntervalsForAll);
                System.out.println("Oktatoniset asteikot:");
                for (String t : myIntervalsCleanedForOcta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForOcta.length == 0) {
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
                pentatonicIntervalsForAll = pentatonic.getAllPentatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForPenta = intervalCheck1.getMyTrueScales(pentatonicIntervalsForAll);
                System.out.println("Pentatoniset asteikot:");
                for (String t : myIntervalsCleanedForPenta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForPenta.length == 0) {
                    System.out.println("N.A.");
                }

                //Hexatoniset asteikot
                hexatonicIntervalsForAll = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForHexa = intervalCheck2.getMyTrueScales(hexatonicIntervalsForAll);
                System.out.println("Hexatoniset asteikot:");
                for (String t : myIntervalsCleanedForHexa) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForHexa.length == 0) {
                    System.out.println("N.A.");
                }

                // Heptatoniset asteikeot
                heptatonicIntervalsForAll = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForHepta = intervalCheck3.getMyTrueScales(heptatonicIntervalsForAll);
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedForHepta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForHepta.length == 0) {
                    System.out.println("N.A.");
                }

                //Oktatoniset asteikot
                String[] octatonicIntervalsAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedOcta = intervalCheck4.getMyTrueScales(octatonicIntervalsAll);
                System.out.println("Oktatoniset asteikot:");
                for (String t : myIntervalsCleanedOcta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedOcta.length == 0) {
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
                hexatonicIntervalsForAll = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForHexa = intervalCheck1.getMyTrueScales(hexatonicIntervalsForAll);
                
                //testausta varten *************************************************
                System.out.println("octatonicIntervalsForAll:");
                for (String t :hexatonicIntervalsForAll ){
                System.out.println(t);
                }
                //testausta varten
                System.out.println("myIntervalsCleanedForOcta:");
                for (String t : myIntervalsCleanedForHexa){
                System.out.println(t);
                }
                //*******************************************************************
                
                System.out.println("Hexatoniset asteikot:");
                for (String t : myIntervalsCleanedForHexa) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForHexa.length == 0) {
                    System.out.println("N.A.");
                }

                // Heptatoniset asteikeot
                heptatonicIntervalsForAll = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForHepta = intervalCheck2.getMyTrueScales(heptatonicIntervalsForAll);
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedForHepta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForHepta.length == 0) {
                    System.out.println("N.A.");
                }

                //Oktatoniset asteikot
                octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForOcta = intervalCheck3.getMyTrueScales(octatonicIntervalsForAll);
                System.out.println("Oktatoniset asteikot:");
                for (String t : myIntervalsCleanedForOcta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForOcta.length == 0) {
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
                heptatonicIntervalsForAll = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForHepta = intervalCheck1.getMyTrueScales(heptatonicIntervalsForAll);
                
                
                //testausta varten *************************************************
                System.out.println("heptatonicIntervalsForAll:");
                for (String t :heptatonicIntervalsForAll ){
                System.out.println(t);
                }
                //testausta varten
                System.out.println("myIntervalsCleanedForHepta:");
                for (String t : myIntervalsCleanedForHepta){
                System.out.println(t);
                }
                //*******************************************************************
                
                
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedForHepta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForHepta.length == 0) {
                    System.out.println("N.A.");
                }

                // Oktatoniset asteikot
                octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                //System.out.println(Arrays.toString(octatonicIntervalsAll));
                myIntervalsCleanedForOcta = intervalCheck2.getMyTrueScales(octatonicIntervalsForAll);
                
                //testausta varten**************************************************************
                System.out.println("octatonicIntervalsForAll:");
                for (String t :octatonicIntervalsForAll ){
                System.out.println(t);
                }
                //testausta varten
                System.out.println("myIntervalsCleanedOcta:");
                for (String t : myIntervalsCleanedForOcta){
                System.out.println(t);
                }
                //******************************************************************************
                
                System.out.println("Oktatoniset asteikot:");
                for (String t : myIntervalsCleanedForOcta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForOcta.length == 0) {
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

                octatonicIntervalsForAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForOcta = intervalCheck1.getMyTrueScales(octatonicIntervalsForAll);
                
                //testausta varten *************************************************
                System.out.println("octatonicIntervalsForAll:");
                for (String t :octatonicIntervalsForAll ){
                System.out.println(t);
                }
                //testausta varten
                System.out.println("myIntervalsCleanedForOcta:");
                for (String t : myIntervalsCleanedForOcta){
                System.out.println(t);
                }
                //*******************************************************************

                System.out.println("Oktatoniset asteikot:");
                for (String t : myIntervalsCleanedForOcta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForOcta.length == 0) {
                    System.out.println("N.A.");
                }
                break;

        }
    }
}
