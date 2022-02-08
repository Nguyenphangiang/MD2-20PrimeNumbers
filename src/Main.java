import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of primes : ");
        int number = scanner.nextInt();
        int count = 0;
        int n=2;
        while (count<number){
            if (prime(n)){
                System.out.print(" " + n);
                count++;
            } n++;
        }
    }
    private static boolean prime(int numb){
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(numb); i++) {
            if (numb%i==0){
                flag = false;
                break;
            }
        } return flag;
    }
}
