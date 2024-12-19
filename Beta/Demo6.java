package Beta;

import java.util.Arrays;

public class Demo6 {


    public static void main(String[] args) {

        int[][] arr = {
                {1, 4, 5},
                {2, 88, 5},
                {-1, 46, -26}
        };

        int[] rowSum = new int[arr.length];

        for(int i =0; i<arr.length;i++){
            for (int j = 0; j<arr[i].length;j++){
                rowSum[i] = rowSum[i] + arr[i][j];
            }
        }

        System.out.println(Arrays.toString(rowSum));
        int maxRowDiff = findMaxDiff(rowSum);
        System.out.println(maxRowDiff);

        int[] colSum = new int[arr[0].length];

        for(int j = 0; j<arr[0].length;j++){
            for(int i = 0; i< arr.length;i++){
                colSum[j] = colSum[j] + arr[i][j];
            }
        }
        System.out.println(Arrays.toString(colSum));
        int maxColDiff = findMaxDiff(colSum);
        System.out.println(maxColDiff);


    }


    private static int findMaxDiff(int[] sums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int sum : sums){
            min = Math.min(min,sum);
            max = Math.max(max,sum);

        }
        return Math.abs(max-min);
    }

}
