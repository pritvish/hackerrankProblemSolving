package JavaTests;

public class FindDuplicate {

    public static void findDuplicate(int[] a) {

        boolean flag = false;

        for(int i=0; i<a.length; i++) { // ext

            for(int j=i+1; j<a.length; j++) {  // internal
                if(a[i] == a[j]){
                    System.out.println("duplicate found "+" i: "+i+" ,j: "+j+" a[i]:"+a[i]+" a[j]:"+a[j] );
                    flag = true;
                    break;
                }
            }

            if(flag) {
                break;
            }

        }

    }

    public static void main(String[] args) {
        int [] a = { 2, 4, 6, 3, 5, 5, 5 };

        findDuplicate(a);
    }
}
