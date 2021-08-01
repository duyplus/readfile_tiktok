/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duyplus;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * @author duyplus
 */
public class loveyou {

    public static void main(String[] args) {
        try {
            String ans = "cathu";
            String ques = "Who is the person you love the most? ";
            String ans1 = "not this person, type again!!";
            while (true) {
                Scanner s = new Scanner(System.in);
                System.out.println(ques);
                String passw = s.nextLine();
                if (!passw.equalsIgnoreCase(ans)) {
                    System.out.println(ans1);
                } else {
                    System.out.println("***--------------------------------------------------***");
                    break;
                }
            }
            for (int i = 0; i <= 11; i += 1) {
                Thread.sleep(500);
                if (i == 1) {
                    System.out.println("just a moment...loading... " + (i * 10) + "%");
                }
                if (i == 2) {
                    System.out.println("just a moment...loading... " + (i * 10) + "%");
                }
                if (i == 3) {
                    System.out.println("just a moment...loading... " + (i * 10) + "%");
                }
                if (i == 4) {
                    System.out.println("just a moment...loading... " + (i * 10) + "%");
                }
                if (i == 5) {
                    System.out.println("just a moment...loading... " + (i * 10) + "%");
                }
                if (i == 6) {
                    System.out.println("just a moment...loading... " + (i * 10) + "%");
                }
                if (i == 7) {
                    System.out.println("just a moment...loading... " + (i * 10) + "%");
                }
                if (i == 8) {
                    System.out.println("just a moment...loading... " + (i * 10) + "%");
                }
                if (i == 9) {
                    System.out.println("just a moment...loading... " + (i * 10) + "%");
                }
                if (i == 10) {
                    System.out.println("just a moment...loading... " + (i * 10) + "%");
                }
                if (i == 11) {
                    System.out.println("\nWish you two happy together <3\n");
                    Thread.sleep(2000);
                }
            }
            // Cach 1
            String fileName = "data.txt";
            File file = new File(fileName);

            byte[] fileBytes = Files.readAllBytes(file.toPath());
            char sChar;
            for (byte b : fileBytes) {
                sChar = (char) b;
                System.out.print(sChar);
                Thread.sleep(3);
            }
            // Cach 2
            //Stream<String> stream = Files.lines(Paths.get("data.txt"));
            //stream.forEach(System.out::println);
        } catch (Exception e) {
        }
    }
}
