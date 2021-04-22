package goldman;

/**
 * 给你一个大小为 rows x cols 的矩阵 mat，其中 mat[i][j] 是 0 或 1，请返回 矩阵mat 中特殊位置的数目 。
 *
 * 特殊位置 定义：如果 mat[i][j] == 1 并且第 i 行和第 j 列中的所有其他元素均为 0（行和列的下标均 从 0 开始 ），
 * 则位置 (i, j) 被称为特殊位置。
 */

public class SpecialEInMatrix {
    public static void main(String[] args) {
        int count = 0;
        int nums[][] = new int[3][3];
        nums[0][0] = 1;
        nums[0][2] = 1;
        nums[1][1] = 1;
        nums[2][0] = 1;
        nums[2][2] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                count ++;
                System.out.print(nums[i][j]+" ");
                if(count==3||count==6||count==9){
                    System.out.println();
                }
            }
        }
        System.out.println("result = "+numSpecial(nums));
    }

    public static int numSpecial(int[][] mat) {
        //1ST Step: Count the number of ones in every row and columns
        int rows[] = new int[mat.length];
        int columns[] = new int[mat[0].length];

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    rows[i]++;
                    columns[j]++;
                }
            }
        }

        //2nd pass: Check at (i,j) where there's 1,
        // if number of 1's at this row and column is 1 and hence increment count
        int count=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1 && rows[i] == 1 && columns[j] == 1){
                    count++;
                }
            }
        }
        return count;
    }

}
