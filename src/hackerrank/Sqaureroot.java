package hackerrank;

public class Sqaureroot {
    public static void main(String[] args) {

        int num = 81;

//        for (int i=1; i<num/2; i++) {
//            if (i*i == num){
//                System.out.println(i);
//                break;
//            }
//        }
        int low =1, high = num, mid = (low+high)/2;
        while(num>0) {

            if(mid*mid == num) {
                System.out.println(mid);
                break;
            } else if(mid*mid > num) {
                high = mid-1;
                mid = (low+high)/2;
            } else {
                low = mid+1;
                mid = (low+high)/2;
            }
        }
    }
}
