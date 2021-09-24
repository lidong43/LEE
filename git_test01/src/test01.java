import java.util.Arrays;

public class test01 {
    public static void main(String[] args) {
        //数组创建
        int[] arr=new int[]{1,5,3,4};
        System.out.println(arr[0]);
        //数组遍历
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //数组排序
        Arrays.sort(arr);
        for(int i:arr){
            System.out.println(i);
        }

    }
}
