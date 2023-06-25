package com.rdl;

import java.io.File;
//import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.TesseractException;


public class TesseracOCR {


     public static void main(String[] args)    {
        
        
        String text="joe bloe";
            // path of your image file
            System.out.print(text);

        /*File imageFile = new File("eurotext.tif");
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping
        instance.setDatapath("tessdata"); // path to tessdata directory


        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
*/


        Tesseract tesseract = new Tesseract();
        try {
  
            tesseract.setDatapath("C:/dev/scrabbleur/images/");
  
            // the path of your tess data folder
            // inside the extracted file
            //String textOCR = tesseract.doOCR(new File("C:/dev/scrabbleur/images/ocr_file.png"));
            String textOCR = tesseract.doOCR(new File("C:/dev/scrabbleur/images/154.png"));
            
  
            // path of your image file
            System.out.print("HERE IS THE TEXTY:" + textOCR);
        }
        catch (TesseractException e) {
            e.printStackTrace();
            System.err.println("exception while tesserac:" + e);

        }

        
    }



}
