/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcm;

/**
 *
 * @author casper
 */
public class Ishihara {

    public static void main(String[] args) {
        Ishihara ishihara = new Ishihara();
        Object[] answer = new Object[38];

        answer[0] = 12;
        answer[1] = 8;
        answer[2] = 6;
        answer[3] = 29;
        answer[4] = 57;
        answer[5] = "";
        answer[6] = 3;
        answer[7] = 15;
        answer[8] = 74;
        answer[9] = 1;
        answer[10] = 6;
        answer[11] = 97;
        answer[12] = 45;
        answer[13] = 5;
        answer[14] = 7;
        answer[15] = 16;
        answer[16] = 73;
        answer[17] = "";
        answer[18] = "";
        answer[19] = "";
        answer[20] = "";
        answer[21] = 26;
        answer[22] = 42;
        answer[23] = 35;
        answer[24] = 96;
        answer[25] = 1;
        answer[26] = 2;
        answer[27] = "0";
        answer[28] = "0";
        answer[29] = 1;
        answer[30] = 1;
        answer[31] = 1;
        answer[32] = 1;
        answer[33] = 1;
        answer[34] = 1;
        answer[35] = 1;
        answer[36] = 1;
        answer[37] = 1;

        ishihara.setAnswer(answer);

        int wrong = ishihara.getWrong();

        String hasil = "";
        if (wrong <= 4) {
            hasil = "PENGLIHATAN NORMAL";
        } else if (ishihara.protan()) {
            hasil = "PENGLIHATAN LEMAH TERHADAP WARNA MERAH (PROTAN)";
        } else if (ishihara.deutan()) {
            hasil = "PENGLIHATAN LEMAH TERHADAP WARNA HIJAU (DEUTAN)";
        } else if (wrong <= 8) {
            hasil = "PENGLIHATAN BUTA WARNA PARSIAL";
        } else {
            hasil = "BUTA WARNA TOTAL";
        }
        System.out.println("HASIL : " + hasil);
        System.out.println("HASIL : " + ishihara.getResult());
    }

    //test ishihara
    private final Object[] plate;
    //kunci jawaban
    private final Object[] correct;
    //optional
    private final Object[] optional;
    //jawaban user
    private Object[] answer;

    public String getResult() {
        int wrong = getWrong();

        String hasil = " | According to this test you  ";
        if (wrong <= 4) {
            hasil = hasil + "are NOT COLOR BLIND (NORMAL)";
        } else if (protan()) {
            hasil = hasil + "have some form of red color blindness (PROTAN).";
        } else if (deutan()) {
            hasil = hasil + "have some form of red color blindness (DEUTAN)";
        } else if (wrong <= 8) {
            hasil = hasil + "have some form of red-green color blindness. (PARSIAL COLOR BLIND(";
        } else {
            hasil = hasil + "TOTAL COLOR BLIND";
        }

        return hasil;
    }

    public Ishihara() {
        this.plate = new Object[38];
        this.correct = new Object[38];
        this.optional = new Object[38];
        this.answer = new Object[38];

        for (int i = 0; i < 38; i++) {
            plate[i] = i + 1;
        }

        correct[0] = 12;
        correct[1] = 8;
        correct[2] = 6;
        correct[3] = 29;
        correct[4] = 57;
        correct[5] = 5;
        correct[6] = 3;
        correct[7] = 15;
        correct[8] = 74;
        correct[9] = 2;
        correct[10] = 6;
        correct[11] = 97;
        correct[12] = 45;
        correct[13] = 5;
        correct[14] = 7;
        correct[15] = 16;
        correct[16] = 73;
        correct[17] = "";
        correct[18] = "";
        correct[19] = "";
        correct[20] = "";
        correct[21] = 26;
        correct[22] = 42;
        correct[23] = 35;
        correct[24] = 96;
        correct[25] = 2;
        correct[26] = 2;
        correct[27] = 0;
        correct[28] = 0;
        correct[29] = 1;
        correct[30] = 1;
        correct[31] = 1;
        correct[32] = 1;
        correct[33] = 1;
        correct[34] = 1;
        correct[35] = 1;
        correct[36] = 1;
        correct[37] = 1;

        optional[1] = 3;
        optional[2] = 5;
        optional[3] = 70;
        optional[4] = 35;
        optional[5] = 2;
        optional[6] = 5;
        optional[7] = 17;
        optional[8] = 21;
        optional[17] = 5;
        optional[18] = 2;
        optional[19] = 45;
        optional[20] = 73;
        optional[21] = "2;6";
        optional[22] = "4;2";
        optional[23] = "3;5";
        optional[24] = "9;6";
        optional[27] = 1;
        optional[28] = 1;

        optional[0] = 12;
        optional[9] = 2;
        optional[10] = 6;
        optional[11] = 97;
        optional[12] = 45;
        optional[13] = 5;
        optional[14] = 7;
        optional[15] = 16;
        optional[16] = 73;
        optional[25] = 2;
        optional[26] = 2;
        optional[29] = 1;
        optional[30] = 1;
        optional[31] = 1;
        optional[32] = 1;
        optional[33] = 1;
        optional[34] = 1;
        optional[35] = 1;
        optional[36] = 1;
        optional[37] = 1;
    }

    public boolean check(Plate plate) {
        try {
            if (correct[plate.getPlate()].toString().equals(plate.getAnswer()+"")) {
                return true;
            } else {

                String[] string = optional[plate.getPlate()].toString().split(";");
                if (string.length == 1) {
                    if (string[0].equals(plate.getAnswer()+"")) {
                        return true;
                    }
                } else {
                    if (string[0].equals(plate.getAnswer()+"") || string[1].equals(plate.getAnswer()+"")) {
                        return true;
                    }
                }
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public void setAnswer(Object[] answer) {
        this.answer = answer;
    }

    public String getCorrect(Plate plate) {
        return correct[plate.getPlate()].toString();
    }

    public String getWeak(Plate plate) {
        String[] string = optional[plate.getPlate()].toString().split(";");
        if (string.length == 1) {
            return string[0];
        } else {
            return string[0] + " OR " + string[1];
        }
    }

    public int getWrong() {
        int x = 0;
        for (int i = 0; i < 38; i++) {
            if (!correct[i].toString().equals(answer[i]+"")) {
                x++;
            }
        }
        return x;
    }

    public boolean protan() {
        correct[21] = 2;
        correct[22] = 4;
        correct[23] = 3;
        correct[24] = 9;

        int x = 0;
        for (int i = 21; i <= 24; i++) {
            if (correct[i].toString().equals(answer[i]+"")) {
                x++;
            }
        }

        return x >= 2;
    }

    public boolean deutan() {
        correct[21] = 6;
        correct[22] = 2;
        correct[23] = 5;
        correct[24] = 6;

        int x = 0;
        for (int i = 21; i <= 24; i++) {
            if (correct[i].toString().equals(answer[i]+"")) {
                x++;
            }
        }

        return x >= 2;
    }
}
