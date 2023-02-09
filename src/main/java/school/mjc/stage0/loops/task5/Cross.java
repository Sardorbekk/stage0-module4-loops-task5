package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
      for (int column=0;column<sideLength;column++){
          for (int row=0;row<sideLength;row++){
             if ((column == sideLength / 2) || (row == sideLength / 2)){
                 System.out.print(8);
             }
             else System.out.print(" ");
          }
          System.out.println("");

      }
    }
}
