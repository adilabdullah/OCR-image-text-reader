/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.ocr;

import java.io.PrintWriter;
public class my_main {
public static void main(String[] args) {
 String input_file="D:\\Bookme\\ocr.png";
 String output_file="D:\\Bookme\\Passport";
 String tesseract_install_path="C:\\JavaAPI\\Tesseract-OCR";
 String[] command =
    {
        "cmd",
    };
    Process p;
 try {
 p = Runtime.getRuntime().exec(command);
        new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
        new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
        PrintWriter stdin = new PrintWriter(p.getOutputStream());
     //   stdin.println("\""+tesseract_install_path+"\" \""+input_file+"\" \""+output_file+"\" -l eng");
        stdin.println("\""+tesseract_install_path+"\" tesseract \""+input_file+"\" \""+output_file+"\"");
        stdin.close();
        p.waitFor();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Read_File.read_a_file(output_file+".txt"));
    } catch (Exception e) {
 e.printStackTrace();
    }
  }
}