import java.util.Arrays;
import java.util.Scanner;

/**
 * 4. 编程题 自定义数组扩容规则，当已存储元素数量达到总容量的 80%时，扩容 1.5 倍。 例如，总容量是 10，当输入第 8 个元素时，数组进行扩容，容量从 10 变 15。
 */
public class work4 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
            if (i>=arr1.length*0.8){
                System.out.print("存储空间已不足20%，是否扩容空间 Y/N");
                if (sc.next()=="y"){
                    System.out.print("扩容");
                }if(sc.next()=="n"){
                    System.out.print("不扩容");
                    //break;
                }
            }
        }


        System.out.println(Arrays.toString(arr1));
        /**int s = (int) (arr1.length * 0.8);
         int[] arr2 = new int[arr1.length + (arr1.length >> 1)];
         for (int i = 0; i <= s; i++) {
         arr1[i] = i + 1;
         if (i == s) {
         }
         }
         for (int a = 0; a < arr1.length; a++) {
         arr2[a] = arr1[a];
         }
         arr1=arr2;
         System.out.println(Arrays.toString(arr1));**/
    }
}
