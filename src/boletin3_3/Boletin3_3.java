package boletin3_3;

import java.util.Scanner;

public class Boletin3_3 {
    
    public static void main(String[] args) {
        int b100=100, b20=20, b5=5, m1=1;
        Scanner bill = new Scanner(System.in);
        System.out.println("Indique cantidad de billetes de 100 euros");
        int billete100 = bill.nextInt();
        System.out.println("Indique cantidad de billetes de 20 euros");
        int billete20= bill.nextInt();
        System.out.println("Indique cantidad de billetes de 5 euros");
        int billete5=bill.nextInt();
        System.out.println("Indique cantidad de monedas de 1 euro");
        int moneda1=bill.nextInt();
        int suma = b100*billete100+b20*billete20+b5*billete5+m1*moneda1;
        System.out.println("Total euros = "+suma+" euros");
    }
    
}
