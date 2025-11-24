package de.ba.experiment;

public class GradeCalculator {

    /**
     * Gibt die Note für eine gegebene Punktzahl zurück:
     *  90–100 -> "1"
     *  80–89  -> "2"
     *  65–79  -> "3"
     *  50–64  -> "4"
     *  < 50   -> "nicht bestanden"
     * Optional: Für Werte außerhalb 0–100 kann eine IllegalArgumentException geworfen werden.
     */

    public static String grade(int punkte) {
        if (punkte < 0 || punkte > 100) {
            throw new IllegalArgumentException("Punktzahl muss zwischen 0 und 100 liegen");
        }
//        Ohne Exception
//        if (punkte < 0 || punkte > 100) {
//            return "ungültig";
//        }

        if (punkte >= 90) {
            return "1";
        } else if (punkte >= 80) {
            return "2";
        } else if (punkte >= 65) {
            return "3";
        } else if (punkte >= 50) {
            return "4";
        } else {
            return "nicht bestanden";
        }
    }
}
