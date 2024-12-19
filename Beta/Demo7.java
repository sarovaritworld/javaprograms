package Beta;

public class Demo7 {


        public static void main(String[] args) {
            int[][] array = {
                    {1, 4, 5},
                    {2, 88, 5},
                    {-1, 46, -26}
            };

            // Calculate row-wise difference
            int[] rowSums = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    rowSums[i] += array[i][j];
                }
            }
            int maxRowDiff = calculateMaxDifference(rowSums);

            // Calculate column-wise difference
            int[] colSums = new int[array[0].length];
            for (int j = 0; j < array[0].length; j++) {
                for (int i = 0; i < array.length; i++) {
                    colSums[j] += array[i][j];
                }
            }
            int maxColDiff = calculateMaxDifference(colSums);

            // Output the results
            System.out.println("Maximum Row Difference: " + maxRowDiff);
            System.out.println("Maximum Column Difference: " + maxColDiff);
        }

        private static int calculateMaxDifference(int[] sums) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int sum : sums) {
                max = Math.max(max, sum);
                min = Math.min(min, sum);
            }
            return Math.abs(max - min);
        }
    }


