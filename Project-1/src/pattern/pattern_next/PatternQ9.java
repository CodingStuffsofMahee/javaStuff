package pattern;

public class PatternQ9 {
    public static void main(String[] args) {
        int n=10;
        for (int i=0;i<=n;i++){
            if (i<=4){
                for (int j=0;j<=i;j++){
                    System.out.print(" *");
                }
            }else{
                for (int j=0;j<=n-i;j++) {
                    System.out.print(" *");
                }
            }

            System.out.println();
        }

    }
}
