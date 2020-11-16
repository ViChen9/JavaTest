/**
 * 4. 编程题 自定义数组扩容规则，当已存储元素数量达到总容量的 80%时，扩容 1.5 倍。 例如，总容量是 10，当输入第 8 个元素时，数组进行扩容，容量从 10 变 15。
 */
import java.util.Arrays;

public class Work4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i = 0;
        do {
            if ((i + 1) * 1.0 / arr.length > 0.8) {
                System.out.println("存储元素数量已达到总容量80%，扩容 1.5 倍");
                    int[] newarr = new int[(int) (arr.length * 1.5)];
                    for (int j = 0; j < arr.length; j++) {
                        newarr[j] = arr[j];
                    }
                    arr = newarr;
            }
            arr[i] = i + 1;
            System.out.printf("添加第%d个元素，当前数组长度为%d:%s\n", i + 1, arr.length, Arrays.toString(arr));
            i += 1;
        } while (i < 26);
    }
}
