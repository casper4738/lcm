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
        
        answer[0] = null;
        answer[1] = null;
        ishihara.setAnswer(answer);
        
        
        String hasil = "";
        if (ishihara.r1()) {
            hasil = "BUTA WARNA TOTAL";
        } else if (ishihara.plate1() && ishihara.r2()) {
            hasil = "BUTA WARNA PARSIAL 1 ";
        } else if (ishihara.plate1() && ishihara.r3()) {
            hasil = "BUTA WARNA PARSIAL 2";
        } else if (ishihara.plate1() && ishihara.r4()) {
            hasil = "BUTA WARNA PARSIAL 3";
        } else if (ishihara.plate1() && ishihara.r5()) {
            hasil = "BUTA WARNA PARSIAL 4";
        } else {
            hasil = "NORMAL";
        }
        
        System.out.println("HASIL : "+ishihara.plate1());
        System.out.println("HASIL : "+hasil);
    }

    //test ishihara
    private final Object[] plate;
    //kunci jawaban
    private final Object[] correct;
    //jawaban user
    private  Object[] answer;

    public Ishihara() {
        this.plate = new Object[38];
        this.correct = new Object[38];
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
        correct[25] = 1;
        correct[26] = 1;
        correct[27] = 1;
        correct[28] = 1;
        correct[29] = 1;
        correct[30] = 1;
        correct[31] = 1;
        correct[32] = 1;
        correct[33] = 1;
        correct[34] = 1;
        correct[35] = 1;
        correct[36] = 1;
        correct[37] = 1;
    }

    public boolean check(Plate plate) {
        try {
            return correct[plate.getPlate()].equals(plate.getAnswer());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void setAnswer(Object[] answer) {
        this.answer = answer;
//        for (int i = 0; i < answer.length; i++) {
//            System.out.println("a:"+answer[i]+" | "+correct[i].equals(answer[i]));
//        }
    }
    
    public String getCorrect(Plate plate) {
        return correct[plate.getPlate()].toString();
    }
    
    public boolean plate1() {
        return correct[0].equals(answer[0]);
    }

    public boolean r1() {
        for (int i = 0; i < 38; i++) {
            if (correct[i].equals(answer[i])) {
                return false;
            }
        }
        return true;
    }

    public boolean r2() {
        int x = 0;
        for (int i = 1; i <= 16; i++) {
            if (!correct[i].equals(answer[i])) {
                x++;
            }
        }

        return x >= 3;
    }

    public boolean r3() {
        int x = 0;
        for (int i = 21; i <= 24; i++) {
            if (correct[i].equals(answer[i])) {
                x++;
            }
        }
        return x > 1;
    }

    public boolean r4() {
        boolean bool = false;
        for (int i = 17; i <= 21; i++) {
            if (correct[i].equals(answer[i])) {
                bool = true;
            }
        }

        return bool;
    }

    public boolean r5() {
        boolean bool = false;
        for (int i = 25; i <= 37; i++) {
            if (plate[i].equals(answer[i])) {
                bool = true;
            }
        }
        return bool;
    }

}
