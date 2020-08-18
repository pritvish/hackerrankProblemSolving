package interviewbit;

import java.util.Scanner;

public class MinStepsInInfiniteGrid {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        Coordinates coordinates[] = new Coordinates[size];

        for (int i = 0; i < size; i++) {
            coordinates[i] = new Coordinates(scan.nextInt(), scan.nextInt());
        }

        System.out.print(coverPoints(coordinates, size));

    }

    static int shortestPath(Coordinates p1,Coordinates p2) {

        int dx = Math.abs(p1.x - p2.x);

        int dy = Math.abs(p1.y - p2.y);

        return Math.max(dx, dy);
    }

    static int coverPoints(Coordinates sequence[],
                           int size) {
        int stepCount = 0;

        for (int i = 0; i < size - 1; i++) {
            stepCount += shortestPath(sequence[i],
                    sequence[i + 1]);
        }

        return stepCount;
    }

    static class Coordinates {

        int x, y;

        Coordinates(int a, int b) {
            x = a;
            y = b;
        }
    }
}
