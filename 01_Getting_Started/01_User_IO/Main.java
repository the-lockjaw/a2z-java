import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
Scanner is easiest to implement, but the slowest
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.nextLine();

BufferedReader is faster but requires manual parsing
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    System.out.println(a + b);

🧠 Do not close readers in contests, you will also close system.in and won't be able to read again, it's fine to keep it open
 */

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scanner.nextLine();

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + "!");
        System.out.println("You are " + age + " years old.");

        // -------------------------------------------------------------------------
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of integers: ");
        //reads a single token
        int n = Integer.parseInt(br.readLine());

        System.out.print("Enter the integers : ");
        // reads entire line and then breaks down at spaces using StringTokenizer
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            // we have only read the line, we need to parse it as integers too.
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // standard procedure
        System.out.print("You entered: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}