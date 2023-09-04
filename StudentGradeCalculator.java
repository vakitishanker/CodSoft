import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enterh the number of subects:");
        int n= sc.nextInt();
        int sum=0;
        float avg;
        int arr[] = new int[n];
        System.out.println("Enter marks obtained in"+n+"Subjects(out of 100):");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        avg = sum/n;
        System.out.println("Total marks:"+sum);
        System.out.println("Average:"+avg);
        
        if(avg>=91 && avg<=100)
            System.out.println("Grade:A1");
        else if(avg>=81 && avg<91)
            System.out.println("Grade:A2");
        else if(avg>=71 && avg<81)
            System.out.println("Grade:B1");
        else if(avg>=61 && avg<71)
            System.out.println("Grade:B2");
        else if(avg>=51 && avg<61)
            System.out.println("Grade:C1");
        else if(avg>=41 && avg<51)
            System.out.println("Grade:C2");
        else if(avg>=33 && avg<41)
            System.out.println("Grade:D");
        else if(avg>=21 && avg<33)
            System.out.println("Grade:E1");
        else if(avg>=0 && avg<21)
            System.out.println("Grade:E2");
        else
            System.out.println("Invalid!");        

    }
    
}
