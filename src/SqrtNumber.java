/**
 * Created by: Akbarjon Akhmadjonov
 * Date: 6/13/2023.
 * Time: 4:29 PM
 * Runtime: 1ms
 * Beats: 100%
 */

public class SqrtNumber {
    public static void main(String[] args) {
        int x = 8;
        //    2,147,395,600
        System.out.println(mySqrt(x));
    }

    private static int mySqrt(int x) {
       long result = 0;
       int count = 0;
        if(x > 2147395600){
            return 46340;
        }
        do{
            if(count*count == x){
                return count;
            }
            count++;
            result = count*count;

        }while (result < x);
        return --count;

//        int result = 0;
//        int count = 0;
//
//        if (x > 2147395600) {
//            return 46340;
//        }
//
//        do {
//            count = count + 1;
//            result = count * count;
//            if (count * count == x) {
//                return count;
//            }
//        } while (result < x);
//        return --count;
    }
}
