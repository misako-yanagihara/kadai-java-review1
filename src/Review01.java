
public class Review01 {

    public static void main(String[] args) {
            int price = 1500;
            double rate = 10;
            int result = tax(price,rate);
            System.out.println(price+"円の商品の税込価格は"+(price+result)+"円（消費税は"+result+"円）です");
        }

        public static int tax(int price,double rate) {
            int result = (int) (price*rate/100);
            return result;

        }



    }

