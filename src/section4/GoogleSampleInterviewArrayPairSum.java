package section4;

public class GoogleSampleInterviewArrayPairSum {

    public static void main(String[] args) {
        int sum = 8;
//        int[] orderedInputArr = {1, 2, 3, 9};
        int[] orderedInputArr = {1, 2, 4, 4};

        int i = 0;
        int j = orderedInputArr.length - 1;
        boolean pairFound = false;

        while(i < j){
            int currSum = orderedInputArr[i] + orderedInputArr[j];
            if(currSum == sum) {
                pairFound = true;
                break;
            }
            else if(currSum > sum) {
                j--;
            }
            else i++;
        }
        System.out.print(pairFound);
    }
}
