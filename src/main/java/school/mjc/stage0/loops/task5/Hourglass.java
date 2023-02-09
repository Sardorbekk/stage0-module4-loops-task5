package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for(int column=1;column<=height/2;column++){
            for (int row=1;row<=column;row++){
                System.out.print(" ");
            }
            for (int row = column; row<=height/2; row++){
                System.out.print(8);
            }

            for (int row=column;row<=height/2;row++){
                System.out.print(8);
            }

            System.out.println();
        }
        for(int column=1;column<=height/2;column++){
            for (int row=column;row<=height/2;row++){
                System.out.print(" ");
            }
            for (int row=1;row<=column;row++){
                System.out.print(8);
            }

            for (int row=1;row<=column;row++){
                System.out.print(8);
            }

            System.out.println();
        }

            }
        }
