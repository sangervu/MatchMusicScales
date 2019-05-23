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
       
        //Asteikot kun viisi intervallia on annettu:
        //Pentatoniset asteikot
        String[] myIntervalsCleanedForPenta5;
        String[] pentatonicIntervalsForAll5;
        //Hexatoniset asetikot
        String[] myIntervalsCleanedForHexa5;
        String[] hexatonicIntervalsForAll5;
        //Henptatoniset asetikot
        String[] myIntervalsCleanedForHepta5;
        String[] heptatonicIntervalsForAll5;    
        //Octatoniset asetikot
        String[] myIntervalsCleanedForOcta5;
        String[] octatonicIntervalsForAll5;
        
       //Asteikot kun kuusi intervallia on annettu:
        
        //Hexatoniset asetikot
        String[] myIntervalsCleanedForHexa6;
        String[] hexatonicIntervalsForAll6;
        //Henptatoniset asetikot
        String[] myIntervalsCleanedForHepta6;
        String[] heptatonicIntervalsForAll6;
        //Octatoniset asetikot
        String[] myIntervalsCleanedForOcta6;
        String[] octatonicIntervalsForAll6;
        
        //Asteikot kun seitsemän intervallia on annettu:
        
        //Henptatoniset asetikot         
        String[] myIntervalsCleanedForHepta7;
        String[] heptatonicIntervalsForAll7;
        //Octatoniset asetikot 
        String[] myIntervalsCleanedForOcta7;
        String[] octatonicIntervalsForAll7;
        
        //Asteikot kun kahdeksan intervallia on annettu:
        
        //Octatoniset asetikot
        String[] myIntervalsCleanedForOcta8;
        String[] octatonicIntervalsForAll8;
        

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
                pentatonicIntervalsForAll5 = pentatonic.getAllPentatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForPenta5 = intervalCheck1.getMyTrueScales(pentatonicIntervalsForAll5);
                System.out.println("Pentatoniset asteikot:");
                for (String t : myIntervalsCleanedForPenta5) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForPenta5.length == 0) {
                    System.out.println("N.A.");
                }

                //Hexatoniset asteikot
                hexatonicIntervalsForAll5 = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForHexa5 = intervalCheck2.getMyTrueScales(hexatonicIntervalsForAll5);
                System.out.println("Hexatoniset asteikot:");
                for (String t : myIntervalsCleanedForHexa5) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForHexa5.length == 0) {
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
                pentatonicIntervalsForAll5 = pentatonic.getAllPentatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForPenta5 = intervalCheck1.getMyTrueScales(pentatonicIntervalsForAll5);
                System.out.println("Pentatoniset asteikot:");
                for (String t : myIntervalsCleanedForPenta5) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForPenta5.length == 0) {
                    System.out.println("N.A.");
                }

                //Hexatoniset asteikot
                hexatonicIntervalsForAll5 = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForHexa5 = intervalCheck2.getMyTrueScales(hexatonicIntervalsForAll5);
                System.out.println("Hexatoniset asteikot:");
                for (String t : myIntervalsCleanedForHexa5) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForHexa5.length == 0) {
                    System.out.println("N.A.");
                }

                // Heptatoniset asteikeot
                heptatonicIntervalsForAll5 = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForHepta5 = intervalCheck3.getMyTrueScales(heptatonicIntervalsForAll5);
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedForHepta5) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForHepta5.length == 0) {
                    System.out.println("N.A.");
                }

                //Oktatoniset asteikot
                octatonicIntervalsForAll5 = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForOcta5 = intervalCheck4.getMyTrueScales(octatonicIntervalsForAll5);
                System.out.println("Oktatoniset asteikot:");
                for (String t : myIntervalsCleanedForOcta5) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForOcta5.length == 0) {
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
                pentatonicIntervalsForAll5 = pentatonic.getAllPentatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForPenta5 = intervalCheck1.getMyTrueScales(pentatonicIntervalsForAll5);
                System.out.println("Pentatoniset asteikot:");
                for (String t : myIntervalsCleanedForPenta5) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForPenta5.length == 0) {
                    System.out.println("N.A.");
                }

                //Hexatoniset asteikot
                hexatonicIntervalsForAll5 = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForHexa5 = intervalCheck2.getMyTrueScales(hexatonicIntervalsForAll5);
                System.out.println("Hexatoniset asteikot:");
                for (String t : myIntervalsCleanedForHexa5) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForHexa5.length == 0) {
                    System.out.println("N.A.");
                }

                // Heptatoniset asteikeot
                heptatonicIntervalsForAll5 = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForHepta5 = intervalCheck3.getMyTrueScales(heptatonicIntervalsForAll5);
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedForHepta5) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForHepta5.length == 0) {
                    System.out.println("N.A.");
                }

                //Oktatoniset asteikot
                String[] octatonicIntervalsAll5 = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                String[] myIntervalsCleanedOcta5 = intervalCheck4.getMyTrueScales(octatonicIntervalsAll5);
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
                hexatonicIntervalsForAll6 = hexatonic.getAllHexatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForHexa6 = intervalCheck1.getMyTrueScales(hexatonicIntervalsForAll6);
                
                //testausta varten *************************************************
                System.out.println("octatonicIntervalsForAll6:");
                for (String t :hexatonicIntervalsForAll6 ){
                System.out.println(t);
                }
                //testausta varten
                System.out.println("myIntervalsCleanedForOcta6:");
                for (String t : myIntervalsCleanedForHexa6){
                System.out.println(t);
                }
                //*******************************************************************
                
                System.out.println("Hexatoniset asteikot:");
                for (String t : myIntervalsCleanedForHexa6) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForHexa6.length == 0) {
                    System.out.println("N.A.");
                }

                // Heptatoniset asteikeot
                heptatonicIntervalsForAll6 = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForHepta6 = intervalCheck2.getMyTrueScales(heptatonicIntervalsForAll6);
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedForHepta6) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForHepta6.length == 0) {
                    System.out.println("N.A.");
                }

                //Oktatoniset asteikot
                octatonicIntervalsForAll6 = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForOcta6 = intervalCheck3.getMyTrueScales(octatonicIntervalsForAll6);
                System.out.println("Oktatoniset asteikot:");
                for (String t : myIntervalsCleanedForOcta6) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForOcta6.length == 0) {
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
                heptatonicIntervalsForAll7 = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForHepta7 = intervalCheck1.getMyTrueScales(heptatonicIntervalsForAll7);
                
                
                //testausta varten *************************************************
                System.out.println("heptatonicIntervalsForAll7:");
                for (String t :heptatonicIntervalsForAll7 ){
                System.out.println(t);
                }
                //testausta varten
                System.out.println("myIntervalsCleanedForOcta7:");
                for (String t : myIntervalsCleanedForHepta7){
                System.out.println(t);
                }
                //*******************************************************************
                
                
                System.out.println("Heptatoniset asteikot:");
                for (String t : myIntervalsCleanedForHepta7) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForHepta7.length == 0) {
                    System.out.println("N.A.");
                }

                // Oktatoniset asteikot
                octatonicIntervalsForAll7 = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                //System.out.println(Arrays.toString(octatonicIntervalsAll7));
                myIntervalsCleanedForOcta7 = intervalCheck2.getMyTrueScales(octatonicIntervalsForAll7);
                
                //testausta varten**************************************************************
                System.out.println("octatonicIntervalsForAll7:");
                for (String t :octatonicIntervalsForAll7 ){
                System.out.println(t);
                }
                //testausta varten
                System.out.println("myIntervalsCleanedOcta:");
                for (String t : myIntervalsCleanedForOcta7){
                System.out.println(t);
                }
                //******************************************************************************
                
                System.out.println("Oktatoniset asteikot:");
                for (String t : myIntervalsCleanedForOcta7) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForOcta7.length == 0) {
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

                octatonicIntervalsForAll8 = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));
                myIntervalsCleanedForOcta8 = intervalCheck1.getMyTrueScales(octatonicIntervalsForAll8);
                
                //testausta varten *************************************************
                System.out.println("octatonicIntervalsForAll8:");
                for (String t :octatonicIntervalsForAll8 ){
                System.out.println(t);
                }
                //testausta varten
                System.out.println("myIntervalsCleanedForOcta8:");
                for (String t : myIntervalsCleanedForOcta8){
                System.out.println(t);
                }
                //*******************************************************************

                System.out.println("Oktatoniset asteikot:");
                for (String t : myIntervalsCleanedForOcta8) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                if (myIntervalsCleanedForOcta8.length == 0) {
                    System.out.println("N.A.");
                }
                break;

        }
    }
}
