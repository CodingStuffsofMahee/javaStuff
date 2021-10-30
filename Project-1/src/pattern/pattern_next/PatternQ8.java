package pattern;

public class PatternQ8 {
    public static void main(String[] args) {
        int number=1, n=10;
        for (int i=1;i<=n;i++){
            for (int j=0;j<=n-i;j++){
                System.out.print("  ");

            }
            for(int j=1;j<=i;j++){
                System.out.print(number +"  ");
                number+=1;
//                or number++
            }
            System.out.println();

        }
    }
}
