package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArray = new int[10];
        int i,num,rem;
        System.out.println(intArray.length);
        // we are cheking of index value have or not
        for(i = 0; i <intArray.length;i++){
            System.out.println("intArray["+i+"]"+"\tIndex Value is "+"["+intArray[i]+"]");
        }
        System.out.println("**********************");
        System.out.println("Enter a number");
        num = sc.nextInt();
        System.out.println("you entered number is :"+num);

        while(num>0){
            rem = num%10;
            if(intArray[rem]==1){
                break;
            }else{
                intArray[rem]=1;
                num = num/10;
            }
        }

        if(num>0){
            System.out.println("Repeated number");
        }else{
            System.out.println("not repeated number");
        }


    }
}
