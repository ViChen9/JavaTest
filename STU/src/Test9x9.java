public class Test9x9 {
    public static void main(String[] args){
        //第一解
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------");


        //第二解
        for(int i=1,j=1;j<=9;i++){
            System.out.print(i+"*"+j+"="+i*j+" ");
            if(i==j){
                i=0;
                j++;
                System.out.println();
            }
        }
        System.out.println("-------------------------------------------------------------------------");


        //第三解
        //定义整形变量
        int i = 9,j = 9;
        //当变量i大于或者等于1的时候执行循环
        while(i >= 1) {
            while (j<=i && j>0) {
                System.out.print(i+"*"+j+"="+i*j+" ");
                j--;
            }
            System.out.println(" ");
            i--;
            j = i;
        }
        System.out.println("-------------------------------------------------------------------------");



    }
}
