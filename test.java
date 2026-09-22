import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[4];// 宣告大小為 4 的陣列
        for(int i=0;i<a.length;i++){
            System.out.println("請輸入第"+(i+1)+"個元素值：");
            a[i] = sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.println("第 " + (i+1) + " 個元素值為：" + a[i]);
        }//依序輸出陣列內元素之值
    }
}
