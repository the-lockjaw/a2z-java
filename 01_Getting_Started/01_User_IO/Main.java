import java.util.Scanner;

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

🧠 Do not close readers in cp, you will also close system.in and won't be able to read again, it's fine to keep it open
 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter your name : ");
        String name = scanner.nextLine();

        System.out.printf("Enter your age : ");
        int age = scanner.nextInt();

        scanner.close();
        
        System.out.println("Hello " + name + "!");
        System.out.println("You are " + age + " years old.");
    }
}