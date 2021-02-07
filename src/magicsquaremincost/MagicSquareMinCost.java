package magicsquaremincost;

import java.util.Scanner;

public class MagicSquareMinCost {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] numbers = new int[3][3];
        System.out.println("Please enter numbers between [1 TO 9] in 3 lines: ");
        //Get input from user
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numbers[i][j] = in.nextInt();
            }
        }

        //8 types of magic square

        int[][] mat1 = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
        int[][] mat2 = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
        int[][] mat3 = {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}};
        int[][] mat4 = {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}};

        int[][] mat5 = {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};
        int[][] mat6 = {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}};
        int[][] mat7 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int[][] mat8 = {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}};

        int cost1 = minCost(numbers, mat1);
        int cost2 = minCost(numbers, mat2);
        int cost3 = minCost(numbers, mat3);
        int cost4 = minCost(numbers, mat4);

        int cost5 = minCost(numbers, mat5);
        int cost6 = minCost(numbers, mat6);
        int cost7 = minCost(numbers, mat7);
        int cost8 = minCost(numbers, mat8);

        int min = Math.min(cost1, Math.min(cost2, Math.min(cost3, cost4)));
        int min1 = Math.min(cost5, Math.min(cost6, Math.min(cost7, cost8)));
        System.out.println("-----------");
        System.out.println("The minimum cost is: " + Math.min(min, min1));
        in.close();
    }

    //calculate min cost
    private static int minCost(int[][] numbers, int[][] mat) {
        int cost = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cost += Math.abs(numbers[i][j] - mat[i][j]);
            }
        }
        return cost;
    }
}
