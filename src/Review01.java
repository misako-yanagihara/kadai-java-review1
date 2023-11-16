
public class Review01 {

    public static void main(String[] args) {
            int p=1500;
            int t=10;
            int result=tax(1500,10);
            System.out.println(p+"円の商品価格の税込価格は"+result+"円です");
        }

        public static int tax(int p,int t) {
            int result=p+p/t;
            return result;

        }



    }

