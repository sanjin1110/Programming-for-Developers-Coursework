//  find number of unique paths in a Matrix

public class Week7 {

     int UniquePathFind(int i, int j, int row, int col,
                                int[][] Arr)
    {
        // boundary condition or constraints
        if (i == row || j == col) {
            return 0;
        }

        if (Arr[i][j] == 1) {
            return 0;
        }

        // base case
        if (i == row - 1 && j == col - 1) {
            return 1;
        }

        return UniquePathFind(i + 1, j, row, col, Arr)
                + UniquePathFind(i, j + 1, row, col, Arr);
    }

     int pathWithObstacle(int[][] Arr)
    {

        int r = Arr.length, c = Arr[0].length;

        return UniquePathFind(0, 0, r, c, Arr);
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[][] A = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
        Week7 obj = new Week7();
        System.out.print(obj.pathWithObstacle(A));
    }
}

