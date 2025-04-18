import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char yn = 'Y';
        while (yn == 'Y' || yn == 'y') {
            System.out.print("Enter Question for Assignment 1: ");
            int ch = sc.nextInt();
            if (ch == 1)
                ques1();
            else if (ch == 2)
                ques2();
            else if (ch == 3)
                ques3();
            else if (ch == 4)
                ques4();
            else if (ch == 5)
                ques5();
            else if (ch == 6)
                ques6();
            else if (ch == 7)
                ques7();
            else if (ch == 8)
                System.out.println("The Program will print 'Hi Java' indefinitely");
            else if (ch == 9)
                ques9();
            else if (ch == 10)
                ques10();
            else
                System.out.println("No question for this number");

            System.out.print("Do you wish to continue [y/N]: ");
            yn = sc.next().charAt(0);
        }
        System.out.println("Thank You for using Assignment 1!");
    }

    public static void ques1() {
        for (int i = 1; i <= 6; i++)
            System.out.println("I am Spider-Man");
    }

    public static void ques2() {
        for (int i = 1; i <= 9; i++)
            System.out.println("I am Iron Man " + i);
    }

    public static void ques3() {
        int i;
        System.out.println("For Loop");
        for (i = 10; i >= 1; i--)
            System.out.println(i);
        i = 10;
        System.out.println("While Loop");
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        i = 10;
        System.out.println("do-While Loop");
        do {
            System.out.println(i);
            i--;
        } while (i >= 1);
    }

    public static void ques4() {
        int i = 1;
        while (i <= 10) {
            System.out.println("Hello World");
            i++;
        }
    }

    public static void ques5() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void ques6(){
        int[] array = {2, 54, 12, 23, 35, 84, 1, 55, 35, 84};
        int max = array[0];
        int place = 0;
        int i;
        for(i=0; i<array.length; i++)
            if(array[i] > max) {
                max = array[i];
                place = i + 1;
            }
        System.out.println("The largest number is "+max+" at "+place+" position");
    }

    public static void ques7(){
        int i;
        System.out.print("Odd Numbers are as follow: ");
        for(i=1; i<=100; i+=2)
            System.out.print(i+"\t");
        System.out.println(" ");
        System.out.print("Even Numbers are as follow: ");
        for(i=1; i<=50; i++)
            System.out.print((i*2)+"\t");
        System.out.println(" ");
    }

    public static void ques9(){
        char i;
        for(i='A'; i<='Z'; i++) {
            int ascii = i;
            System.out.println(i + ":" + ascii);
        }
        for(i='a'; i<='z'; i++){
            int ascii = i;
            System.out.println(i + ":" + ascii);
        }
        for(i='0'; i<='9'; i++){
            int ascii = i;
            System.out.println(i + ":" + ascii);
        }
    }

    public static void ques10(){
        float i;
        for(i=1; i<10; i+=1)
            System.out.print(i+", ");
        System.out.print("10.0\n");
    }

}