/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testCropAndCopy()
  {
      Picture image = new Picture("beach.jpg");
      Picture newimage = new Picture("640x480.jpg");
      newimage.cropAndCopy( image, 10, 100, 20, 200, 30, 40 );
      newimage.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void collage()
  {
      Picture image = new Picture("blue-mark.jpg");
      Picture baseImage = new Picture("space.jpg");
      Pixel[][] pixels = baseImage.getPixels2D();
      image = image.scale(1.1, 1.1);
      Pixel[][] markPixels = image.getPixels2D();

      for(int row=0; row < markPixels.length; row++)
      {
          for(int col=0; col < markPixels[0].length; col++)
          {
           
               if (col < 300 || row < 170 || col > 430 || row > 360)
              {
                  markPixels[row][col].setRed(pixels[row][col].getRed());
                  markPixels[row][col].setGreen(pixels[row][col].getGreen());
                  markPixels[row][col].setBlue(pixels[row][col].getBlue());
              } 
              else
              {
                 if(markPixels[row][col].getBlue() > 55 && markPixels[row][col].getBlue() < 90 && markPixels[row][col].getRed() < 25)
                 {
                  markPixels[row][col].setRed(pixels[row][col].getRed());
                  markPixels[row][col].setGreen(pixels[row][col].getGreen());
                  markPixels[row][col].setBlue(pixels[row][col].getBlue());
                  } 
                 if(row > 300 && markPixels[row][col].getRed() > 140 && markPixels[row][col].getGreen() > 140 && markPixels[row][col].getBlue() > 130)
                 {
                  markPixels[row][col].setRed(pixels[row][col].getRed());
                  markPixels[row][col].setGreen(pixels[row][col].getGreen());
                  markPixels[row][col].setBlue(pixels[row][col].getBlue());
                 }
              } 
              markPixels[row][col].setRed((pixels[row][col].getRed() + markPixels[row][col].getRed()) / 2 );
              markPixels[row][col].setBlue((pixels[row][col].getBlue() + markPixels[row][col].getBlue()) / 2 );
              markPixels[row][col].setGreen((pixels[row][col].getGreen() + markPixels[row][col].getGreen()) / 2 );
              
              
             
          }
      }
      
      baseImage.cropAndCopy(image, 0, 630, 0, 470, 0, 0);
      for(int row=0; row < pixels.length; row++)
      {
          for(int col=0; col < pixels[row].length; col++)
          {
              pixels[row][col].setRed(pixels[row][col].getRed() + col / 6);
              pixels[row][col].setGreen(pixels[row][col].getGreen() + row / 8);
              pixels[row][col].setBlue(pixels[row][col].getBlue() + ((row * col) / 1000));
          }
      }
      baseImage.addMessage("AYYY", 100, 100);
      baseImage.addMessage("WEW LAD", 400, 200);
      baseImage.addMessage("TOP KEK", 500, 400);
      baseImage.addMessage("MEME", 600, 75);
      baseImage.addMessage("MARK", 600, 460);
      baseImage.addMessage("JAVA RULZ!!!!!1!", 10, 460);
      baseImage.addMessage("SWAG M8", 30, 260);
      
      
      baseImage.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    testCropAndCopy();
  }
}