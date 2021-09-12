import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BeybladeTechGig {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {

            int N = scan.nextInt();

            Integer arr1[] = new Integer[N];
            Integer arr2[] = new Integer[N];

            for (int a = 0; a < N; a++) {
                arr1[a] = scan.nextInt();
            }

            for (int b = 0; b < N; b++) {
                arr2[b] = scan.nextInt();
            }

            int win_count=0;

            // Opponent vector size is fixed
            for(int i=0;i<N;i++){
                int minimum_number=0;
                int idx=-1;
                List<Integer> players = Arrays.asList(arr1);
                List<Integer> opponents = Arrays.asList(arr2);



                int x = players.get(9);

                for(int j=0;j<players.size();j++){

                    // first check if player can defeat opponent
                    if(players.get(j)>opponents.get(i)){

                        // check if minimum_number is initialized
                        if(minimum_number==0){
                            minimum_number=players.get(j);
                            idx=j;
                        }
                        //then check if we find smaller minimum_number
                        else if(players.get(j)<minimum_number){
                            minimum_number=players.get(j);
                            idx=j;
                        }
                    }

                }
                if(minimum_number!=0){
//                    Players.erase(Players.begin()+idx);
                    players.remove(players.get(idx));
                    win_count+=1;
                }
            }

            System.out.println(win_count);
        }
    }
}
