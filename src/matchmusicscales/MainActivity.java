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

        System.out.println("1: Etsi Pentatoninen. 2: Etsi Hextatoninen. 3: Etsi Heptatoninen. 4: Etsi Octatoninen");
        String valinta = input.nextLine();

        switch (valinta) {

            case "1": //Pentatoninen asteikko

                System.out.println("Syötä intervallit W, H, m, tai M (max viisi intervallia)");
                intervallit = input.nextLine();

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

            case "2": //Hexatoninen asteikko

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

                //System.out.println(Arrays.toString(hexatonic.getAllHexatonicIntervals(intervallit)));
            
                String[] myIntervalsCleanedHexa = intervalCheck.getMyTrueScales(hexatonicIntervalsAll);
                
                //System.out.println(Arrays.toString(hexatonicIntervalsAll));
                System.out.println(Arrays.toString(myIntervalsCleanedHexa));
                

                /*for (String t : myIntervalsCleanedHexa) {
                    System.out.println(t + " = " + scales.getScales(t));
                }*/
                break;

            case "3": //Heptatoninen asteikko

                System.out.println("Syötä intervallit W, H, m, tai M (max seitsemän intervallia)");
                intervallit = input.nextLine();

                if (intervallit.length() >= 3 && intervallit.length() <= 7) {
                    for (int i = 0; i < intervallit.length(); i++) {

                        if ((intervallit.charAt(i) != W) && (intervallit.charAt(i) != H) && (intervallit.charAt(i) != m) && (intervallit.charAt(i) != M)) {
                            System.out.println("intervalleja ei tunnistettu");
                        } else {
                            //some code here
                            heptatonic.setHeptatonicInterval(String.valueOf(intervallit.charAt(i)));
                        }
                    }
                } else {
                    System.out.println("Intervalleja ei saa olla alle kolme, tai yli kuusi");
                }

                String[] heptatonicIntervalsAll = heptatonic.getAllHeptatonicIntervals(Integer.toString(intervallit.length()));

                //System.out.println(Arrays.toString(hexatonic.getAllHexatonicIntervals(intervallit)));
                //System.out.println(Arrays.toString(pentatonicIntervalsAll));
                String[] myIntervalsCleanedHepta = intervalCheck.getMyTrueScales(heptatonicIntervalsAll);

                for (String t : myIntervalsCleanedHepta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                break;

            case "4": //Octatoninen asteikko

                System.out.println("Syötä intervallit W, H, m, tai M (max kahdeksan intervallia)");
                intervallit = input.nextLine();

                if (intervallit.length() >= 3 && intervallit.length() <= 8) {
                    for (int i = 0; i < intervallit.length(); i++) {

                        if ((intervallit.charAt(i) != W) && (intervallit.charAt(i) != H) && (intervallit.charAt(i) != m) && (intervallit.charAt(i) != M)) {
                            System.out.println("intervalleja ei tunnistettu");
                        } else {
                            //some code here
                            octatonic.setOctatonicInterval(String.valueOf(intervallit.charAt(i)));
                        }
                    }
                } else {
                    System.out.println("Intervalleja ei saa olla alle kolme, tai yli kahdeksan");
                }

                String[] octatonicIntervalsAll = octatonic.getAllOctatonicIntervals(Integer.toString(intervallit.length()));

                //System.out.println(Arrays.toString(octatonic.getAllOctatonicIntervals(intervallit)));
                //System.out.println(Arrays.toString(octatonicIntervalsAll));
                String[] myIntervalsCleanedOcta = intervalCheck.getMyTrueScales(octatonicIntervalsAll);

                for (String t : myIntervalsCleanedOcta) {
                    System.out.println(t + " = " + scales.getScales(t));
                }
                break;

        }
    }
}
