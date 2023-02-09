package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
       for (int column=cathetusLength;column>0;column--){
           for (int row=column;row<=cathetusLength;row++){
               System.out.print(8);
           }
           System.out.println("");
       }
    }
}
