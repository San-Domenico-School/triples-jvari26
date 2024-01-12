import greenfoot.*; 
import greenfoot.GreenfootImage;

/**
 * Game Board for Triples
 * 
 * @Julian Vari 
 * @Thu Jan 11
 */

public class Card extends Actor
{
   private boolean isSelected;
   private Shape shape;
   private Color color;
   private GreenfootImage cardImage, selectedCardImage;
   private int numberOfShapes;
   private int shading;
   public enum Shape 
   {
       SQUARE, TRIANGLE, CIRCLE, NO_SHAPE
   }
   public enum Color
   {
       RED, GREEN, BLUE, NO_COLOR
   }
   
   public Card(Shape shape, Color color, int numberOfShapes, int shading,
               GreenfootImage cardImage, GreenfootImage selectedCardImage)
   {
       this.shape = shape;
       this.color = color;
       this.numberOfShapes = numberOfShapes;
       this.shading = shading;
       this.cardImage = cardImage;
       this.selectedCardImage = selectedCardImage;
       setImage(cardImage);
   }
   
   public int getNumberOfShapes()
   {
       return numberOfShapes;
   }
   
   public int getShading()
   {
       return shading;
   }
   
   public Shape getShape()
   {
       return shape;
   }
   
   public Color getColor()
   {
       return color;
   }
   
   public boolean getIsSelected()
   {
       return isSelected;
   }
   
   public GreenfootImage getCardImage()
   {
       return cardImage;
   }
   
   public GreenfootImage getSelectedCardImage()
   {
       return selectedCardImage;
   }
   
   public void setIsSelected(boolean newIsSelected)
   {
       this.isSelected = newIsSelected;
   }
}





