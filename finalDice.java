//CSIS 1400 
//Final Project 
//Taylor Jennings-Johnson


import java.lang.Math;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


public class finalDice {
   static double [] dieArray1 = new double[10000];
   static double [] dieArray2 = new double [10000];
   static int currentIndex = 0;
      public static void main(String[] args) {
   
   ImageIcon icon = new ImageIcon("dice.jpg");

   double die1 = Math.floor(Math.random() * 6 + 1);
   double die2 = Math.floor(Math.random() * 6 + 1);
   

   
   int [] die1Stats = new int [6];
   int [] die2Stats = new int [6];
   

   
   boolean rollAgain = true;
   
   while (rollAgain) {
   
   //clears arrays if rollAgain
  for (int i = 0; i < 10000; i++) {
      dieArray1[i] = 0;
      dieArray2[i] = 0;
       }
 for (int i = 0; i < 6; i++) {
      die1Stats[i] = 0;
      die2Stats[i] = 0;
       }
   
   for (int i = 0; i < 10000; i++) {
   die1 = Math.floor(Math.random() * 6 + 1);
   die2 = Math.floor(Math.random() * 6 + 1);
   
   dieArray1[i] = die1;
   dieArray2[i] = die2;
   


   
//first three rolls show what the rolls are and an image
if (i == 0 || i == 1 || i == 2) {
JOptionPane.showMessageDialog(null, "Roll " +
 (i + 1) + "\nDie 1 is: " + dieArray1[i] + 
"\nDie 2 is: " + dieArray2[i],"Rolling", JOptionPane.PLAIN_MESSAGE, icon);
}
   }
   
    
//converting die array rolls to how many of each number. 
//tried using a switch statement at first, didnt work..?
   for (int i = 0; i < 10000; i++) {

      //die 1 stats
      if (dieArray1[i]== 1) {
      die1Stats[0]++;
      }
      else if (dieArray1[i]== 2) {
      die1Stats[1]++;
      }
      else if (dieArray1[i]== 3) {
      die1Stats[2]++;
      }
      else if (dieArray1[i]== 4) {
      die1Stats[3]++;
      }
      else if (dieArray1[i]== 5) {
      die1Stats[4]++;
      }
      else if (dieArray1[i]== 6) {
      die1Stats[5]++;
      }
      
      //die 2 stats
      if (dieArray2[i]== 1) {
      die2Stats[0]++;
      }
      else if (dieArray2[i]== 2) {
      die2Stats[1]++;
      }
      else if (dieArray2[i]== 3) {
      die2Stats[2]++;
      }
      else if (dieArray2[i]== 4) {
      die2Stats[3]++;
      }
      else if (dieArray2[i]== 5) {
      die2Stats[4]++;
      }
      else if (dieArray2[i]== 6) {
      die2Stats[5]++;
      } 
}


String results1 [] = new String [6];
String results2 [] = new String [6];

//Storing stat results into a string, for Dialog box
for (int i = 0; i < 6; i++) {
results1[i] = ("Rolled a " + (i + 1) + " " + (die1Stats[i] / 100.00) + "% of the time.");
}

for (int i = 0; i < 6; i++) {
results2[i] = ("Rolled a " + (i + 1) + " " + (die2Stats[i] / 100.00) + "% of the time.");
}


//output stats
JOptionPane.showMessageDialog(null, results1, "Die 1 Stats", JOptionPane.PLAIN_MESSAGE);
JOptionPane.showMessageDialog(null, results2, "Die 2 Stats", JOptionPane.PLAIN_MESSAGE);

//Roll again option
int again = Integer.parseInt(JOptionPane.showInputDialog("Roll Again? Enter 1 to roll again, 0 to exit"));

System.out.println(again);
if (again == 0) {
rollAgain = false;
}

} //end of while loop roll again


}}
// int total = 0;
// for (int i = 0; i < 6; i++) {
// total += die1Stats[i];
// }
// System.out.println(total);
