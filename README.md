# scrabbleur
From an image received by email we can extract the scrabble board and suggest some play


- first we send the image from the app (Official Scrabble(tm) android app)
- the image is a .png
- the image is 663x846
- the image bitdepth is 24
- the image is aroung 260Kb
- We then we cut the image to only keep the board and the available tiles
--   at x=32 y=128
--   at x=630 y=727
-- the function I've found is with width and lenght... so 598, 599

Then the board is 15x15, we will fill it with out letters
we go cell by cell (also use image crop function) and either compare to existing tile... or more intelligent to recognize just he letter
    the tile cal have some popup icon and maybe different colors... so maybe we want to 
    1- bring color =2
    2- get a smaller zone inside the cell


Once we have the whole board filled, we need to get the current tiles available to the user (at the bottom)  (Same procedure to get that in the second array... max=7 items)

then we use an API to try all the words with what we have
then we use an API to see what we can do with what is on the board
we check each point amount for each created word
we send an email with the best(s) word(s)
we maybe send the image of the resulting board in the email (We get fancy)



If we need OCR we can use Tess4J
example https://www.geeksforgeeks.org/tesseract-ocr-with-java-with-examples/

USED this to crop: https://javapointers.com/java/java-core/crop-image-java/

Used ChatGPT to get the algorithm of finding if we can put a word in the board

