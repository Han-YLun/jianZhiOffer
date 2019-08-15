/**
 * @author: hyl
 * @date: 2019/08/15
 **/
public class Que23 {

    public boolean VerifySquenceOfBST(int [] sequence) {

        if (sequence == null || sequence.length == 0){
            return false;
        }

       

        return subtest(sequence , 0 , sequence.length);

    }

    private boolean subtest(int[] sequence, int start, int end) {

        if (start >= end){
            return true;
        }

        //记录第一个大于根节点的数
        int i = start;
        for (; i < end; i++) {
            if (sequence[i] > sequence[end - 1]){
                break;
            }
        }
        


        for (int j = i; j < end; j++) {
            if (sequence[j]  < sequence[end - 1]){
                return false;
            }
        }

        return subtest(sequence , start , i - 1) && subtest(sequence , i , end - 1);
    }
}
