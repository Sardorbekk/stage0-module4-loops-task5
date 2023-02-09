package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int column=1;column<=height;column++){
            for (int row=1;row<=length;row++){
                if (row==1||column==1||row==length||column==height)
                    System.out.print(8);
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
