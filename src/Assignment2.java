import java.util.ArrayList;
import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char yn = 'Y';
        while (yn == 'Y' || yn == 'y') {
            System.out.print("Enter Question for Assignment 2: ");
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
            else
                System.out.println("Wrong Choice!");
            System.out.print("Do you wish to continue [y/N]: ");
            yn = sc.next().charAt(0);
        }
    }

    public static void ques1(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<=10; i++)
            arr.add(i*2);
        System.out.println("ID\tNumber");
        for(int i=0; i<10; i++)
            System.out.println(i+"\t"+ arr.get(i));
        System.out.print("Choose which two elements to swap by their ID\nEnter the first number's ID [press Return/Enter after choosing]: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number's ID [press Return/Enter after choosing]: ");
        int b=sc.nextInt();
        int temp = arr.get(a);
        arr.set(a, arr.get(b));
        arr.set(b, temp);
        System.out.println("ID\tNumber");
        for(int i=0; i<10; i++)
            System.out.println(i+"\t"+ arr.get(i));
    }

    public static void ques2(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<=10; i++)
            arr.add(i*2);
        System.out.print("Choose starting position >= 0 : ");
        int a=sc.nextInt();
        System.out.print("Choose ending position <= "+(arr.size()-1)+ " : ");
        int b=sc.nextInt();
        if (a>=0 && b<=arr.size()) {
            System.out.println("ID\tNumber");
            for (int i = a; i <= b; i++)
                System.out.println(i + "\t" + arr.get(i));
        }
        else
            System.out.println("Incorrect Values entered");
    }

    public static void ques3(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<=10; i++)
            arr.add(i*2);
        System.out.print("Choose number to search : ");
        int num=sc.nextInt();
        for(int i=0; i<arr.size(); i++)
            if(num == arr.get(i)) {
                System.out.println(num + " found at " + i);
                return;
            }
        System.out.println("Number NOT found");
    }

    public static void ques4(){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<=10; i++)
            arr.add(i*2);
        System.out.println(arr);
        if(arr.size() < 3)
            System.out.println("There are only 3 elements in the array!");
        else
            arr.remove(2);
        System.out.println(arr);
    }

    public static void ques5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (isEligibleToVote(age))
            System.out.println("Person is eligible to Vote");
        else
            System.out.println("Person cannot Vote");
    }

    public static boolean isEligibleToVote(int age){
        return age >= 18 && age <= 60;
    }

    public static void ques6(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks out of 100: ");
        int marks = sc.nextInt();
        if(marks>=0 && marks<=100)
            marking(marks);
        else
            System.out.println("Marks not correct");
    }

    public static void marking(int marks){
        if (marks>=91 && marks<=100)
            System.out.println("AA");
        else if (marks>=81 && marks<=90)
            System.out.println("AB");
        else if (marks>=71 && marks<=80)
            System.out.println("BB");
        else if (marks>=61 && marks<=70)
            System.out.println("BC");
        else if (marks>=51 && marks<=60)
            System.out.println("CD");
        else if (marks>=41 && marks<=50)
            System.out.println("DD");
        else
            System.out.println("Fail");
    }

}