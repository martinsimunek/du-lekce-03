package com.engeto.invoice;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String item;    // text (posloupnost znaků)
        int quantity;   // celá čísla
        // Integer quantity; // celé číslo - objektové
        double weight;  // desetinná čísla
        BigDecimal pricePerPiece;
            // desetinná čísla zpracovávaná
            // v desítkové soustavě
        LocalDate dateOfIssue = LocalDate.of(2022, 4, 7);
        boolean isDiscouted = true;    // true × false

        // Uložení hodnoty do proměnné:
        item = "Trekové boty Sedmimílovky";
        quantity = 3;
        weight = 0.45;
        pricePerPiece = BigDecimal.valueOf(1800);

        // Změna hodnoty:
        quantity = 2;
        quantity = quantity + 5;
        // Totéž lze zapsat také takto:
        quantity += 5;

        // Použití proměnné:
        // System.out.println(quantity);
        System.out.println("Počet párů je: "+quantity+".");
    }
}