package pattern;

public class PatternQ6 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int z = 0; z<=i-1;z++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
