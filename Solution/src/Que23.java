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

        //找到左右子树的分界点,即右子数第一个节点
        int i = start;
        for (; i < end; i++) {
            if (sequence[i] > sequence[end - 1]){
                break;
            }
        }


        //在右子树中判断是否含有小于root的值，如果有返回false
        for (int j = i; j < end; j++) {
            if (sequence[j]  < sequence[end - 1]){
                return false;
            }
        }

        return subtest(sequence , start , i - 1) && subtest(sequence , i , end - 1);
    }
}
