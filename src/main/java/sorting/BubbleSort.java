package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] sortNums = bubbleSort(new int[]{1,2,3,4,5});
        for (int i = 0; i < sortNums.length; i++) {
            System.out.print(sortNums[i]+" ");
        }

    }

    private static int[] bubbleSort(int[] nums){
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i+1]) {
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return nums;
    }
}
