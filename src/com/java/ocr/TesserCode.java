/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.ocr;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import javax.imageio.IIOImage;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.OCRResult;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.Word;

/**
 *
 * @author pc
 */
public class TesserCode {
    public static void main(String[] args)
    {
    ITesseract image=new Tesseract();
    try{
    String str=image.doOCR(new File("D:\\Bookme\\joinning_letter1.jpeg"));
    System.out.println(""+str);
    }
    catch(Exception ex)
    {
    ex.printStackTrace();
    System.out.println(""+ex.getMessage());
    }
    
    }
}
