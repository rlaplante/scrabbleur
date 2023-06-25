package com.rdl.scrbl;

import java.awt.image.BufferedImage;

public class LetterHolder {
    int xPos;
    int yPos;
    char letter;
    BufferedImage imageBin;

    public LetterHolder (int x, int y, BufferedImage img, char car){
        xPos =x;
        yPos =y;
        imageBin = img;
        letter = car;
    }

    public LetterHolder (int x, int y, BufferedImage img){
        xPos =x;
        yPos =y;
        imageBin = img;
    }

    
}
