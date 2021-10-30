package pattern;

public class PatternQ10 {
    public static void main(String[] args) {
        int n=5;
        System.out.println("*");


        for (int z=2;z<=n-1;z++){
            System.out.print("* ");
            for (int j=0;j<+z-2;j++){
                System.out.print("  ");
            }
            System.out.println("*");
        }
        for (int i =0;i<=n;i++){
            System.out.print("* ");
        }
    }
}
