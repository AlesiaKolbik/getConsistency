package com.testpackage;

public class Main {

    public static void main(String[] args) {
        int[] consistency = new int[100];
        for (int i = 0; i < 100; i++) {
            consistency[i] = 1+ (int) (Math.random() * 101);
        }
        int[] perfectNumbers = new int[1];
        int counter=0;
        for (int i = 1; i<consistency.length; i++) {
            if (checkNumberIsPerfect(i)){
                if(counter>= perfectNumbers.length){
                    int [] perfectNumbersNew=increaseTheArray(perfectNumbers);
                    perfectNumbers=perfectNumbersNew;
                    perfectNumbers[counter]=i;
                }
                perfectNumbers[counter]=i;
                counter++;
            }
        }
        for(int i=0;i<perfectNumbers.length;i++){
            System.out.println(perfectNumbers[i]+" ");
        }
    }

    private static int [] increaseTheArray(int[] array) {
        int [] newArray=new int[array.length+1];
        for(int i=0;i<array.length;i++){
            newArray[i]=array[i];
        }
        return newArray;
    }

    private static boolean checkNumberIsPerfect(int number) {
        boolean result=false;
        int sum=0;
        for(int i=number-1;i>=1;i--){
            if(number%i==0){
                sum+=i;
            }
        }
        if(number==sum){
            result=true;
        }
        return result;
    }
}
