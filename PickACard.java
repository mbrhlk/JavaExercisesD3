public class PickACard {
  public static void main(String[] args) {
  
   int card = (int) (Math.random() * 52.0); 
   int rank = card / 4; 
   int suit = card % 4; 
   String strRank = "";
   String strSuit = "";
  
   switch (rank) {
   case 1:
    strRank = "Ace";
    break;
   case 10:
    strRank = "Jack";
    break;
   case 11:
    strRank = "Queen";
    break;
   case 12:
    strRank = "King";
    break;
   default:
    strRank = "" + (rank + 1);
    break;
   }
  
   switch (suit) {
   case 0:
    strSuit = "Clubs";
    break;
   case 1:
    strSuit = "Diamonds";
    break;
   case 2:
    strSuit = "Hearts";
    break;
   case 3:
    strSuit = "Spades";
    break;
   }
    
   System.out.print("The card you picked is " + strRank +" of " + strSuit );
  }
  
 }