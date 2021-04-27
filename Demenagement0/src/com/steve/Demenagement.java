package com.steve;

public class Demenagement {

    public static void main(String[] args) {
        int totalCarton = 34;
        int cartonAncienLocal = totalCarton;
        int cartonNouveauLocal = 0;
        int cartonCamion = 0;

        for (int cartonCount = 1; cartonCount <= totalCarton; cartonCount++) {
            cartonCamion++;
            cartonAncienLocal--;
            if (cartonCamion == 9 || cartonAncienLocal == 0) {
                System.out.println("Le camion part et décharge " + cartonCamion + " carton dans le nouveau local");
                cartonNouveauLocal = cartonNouveauLocal + cartonCamion;
                cartonCamion = 0;
            }
            System.out.println("-----");
            System.out.println("Ancien : " + cartonAncienLocal);
            System.out.println("Camion : " + cartonCamion);
            System.out.println("Nouveau : " + cartonNouveauLocal);
            System.out.println("-----");
        }
    }
}
