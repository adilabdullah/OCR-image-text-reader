/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.ocr;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author pc
 */
public class OCRTest {
  
  public static void main(String[] args) throws Exception {
     String input_file="D:\\Bookme\\Passport.jpg";
 String output_file="D:\\Bookme\\Passport";
      ProcessBuilder builder = new ProcessBuilder(
            "cmd.exe", "/c", "cd \"C:\\JavaAPI\\Tesseract-OCR\" && tesseract \""+input_file+"\" \""+output_file+"\"");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }
    }   
}
