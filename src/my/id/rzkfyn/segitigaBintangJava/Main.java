package my.id.rzkfyn.segitigaBintangJava;

import my.id.rzkfyn.segitigaBintangJava.segitiga.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Segitiga Siku Siku : ");
        new SikuSiku().segitiga();
        System.out.println("\nSegitiga Siku Siku Terbalik : ");
        new SikuSikuTerbalik().segitiga();
        System.out.println("\nSegitiga Sama Kaki : ");
        new SamaKaki().segitiga();
        System.out.println("\nSegitiga Sama Kaki Terbalik : ");
        new SamaKakiTerbalik().segitiga();
    }
}