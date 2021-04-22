package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] sortNums = insertionSort(new int[]{3,2,7,8,4,2,1,9,6});
        for (int i = 0; i < sortNums.length; i++) {
            System.out.print(sortNums[i]+" ");
        }
    }

    private static int[] insertionSort(int[] nums){
        int current = 0;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            current = nums[i];
            j = i - 1;
            while(j>=0&&current<nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = current;
        }
        return nums;
    }
}
