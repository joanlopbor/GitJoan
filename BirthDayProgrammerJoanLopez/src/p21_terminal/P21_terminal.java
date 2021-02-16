/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p21_terminal;

/**
 *
 * @author Joan Lopez Borrajo
 */
public class P21_terminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Dia, Mes, Any;
        Dia = 13;
        Mes = 9;
        Any = 2021;
        String date = inicioDiaMesZeller(Dia, Mes, Any);

        System.out.println("Day of the week: " + date + " Sep 2021");
    }

    private static String inicioDiaMesZeller(int day, int month, int year) {
        String[] ArrayWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        int a, y, m, d;
        a = (14 - month) / 12;
        y = year - a;
        m = month + 12 * a - 2;
        d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return ArrayWeek[d];
    }
}
