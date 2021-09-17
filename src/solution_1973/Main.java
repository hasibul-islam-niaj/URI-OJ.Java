package solution_1973;

import java.util.Scanner;

class StarTrek {
    private Scanner scanner;
    private Integer n, totalSheeps, attacked, stolenSheeps;
    private Integer stars[], attackedStars[];

    public boolean isEven(Integer data) {
        boolean isEven = data%2 == 0;
        return isEven;
    }

    public void countStarsAndSheep() {
        int i=0;
        while (i>=0 && i<n) {
            Integer previousStar = stars[i];

            if (stars[i] != 0) {
                stars[i] = stars[i] - 1;
                stolenSheeps += 1;
                attacked += (attackedStars[i] == null || attackedStars[i] == 0) ? 1 : 0;
                attackedStars[i] = 1;
            }
            else
                break;

            i += previousStar%2 ==0 ? -1 : 1;
        }
    }

    public void getResults() {
        System.out.println(attacked + " " + (totalSheeps - stolenSheeps));
    }

    StarTrek() {
        scanner = new Scanner(System.in);
        totalSheeps = attacked = stolenSheeps = 0;

        n = scanner.nextInt();
        stars = new Integer[n];
        attackedStars = new Integer[n];

        for (int i=0; i<n; i++) {
            stars[i] = scanner.nextInt();
            totalSheeps += stars[i];
        }
    }
}

public class Main {
    public static void main(String[] args) {
        StarTrek starTrek = new StarTrek();
        starTrek.countStarsAndSheep();
        starTrek.getResults();
    }
}
