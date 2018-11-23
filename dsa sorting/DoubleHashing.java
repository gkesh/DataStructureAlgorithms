/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trials;

import java.util.Scanner;

/**
 *
 * @author G-Kesh
 */
public class DoubleHashing {

    static int[] table = null;
    static int tableSize;
    static int lowerPrime;
    static int colCounter = 0;
    
    public DoubleHashing(int tableSize) {
        table = new int[tableSize];
        //initialize the array for checking
        for(int i = 0; i<tableSize; i++){
            table[i]=-1;
        }
        DoubleHashing.tableSize = tableSize;
        DoubleHashing.lowerPrime = DoubleHashing.lowerPrime(tableSize);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int lowerPrime(int num) {
        if(DoubleHashing.isPrime(num-1)){
            return num-1;
        }else{
            return DoubleHashing.lowerPrime(num-1);
        }
    }
    public int[] hash(int[] arr){
        for(int temp: arr){
           DoubleHashing.hashThis(temp, temp%10);
        }
        return DoubleHashing.table;
    }
    public static void hashThis(int num, int index){
        if(DoubleHashing.table[index]==-1){
            DoubleHashing.table[index]=num;
            colCounter=0;
        }else{
            ++colCounter;
            int tempIndex = DoubleHashing.lowerPrime-(num%DoubleHashing.lowerPrime);
            int nxtIndex = (num+colCounter*tempIndex)%DoubleHashing.tableSize;
            DoubleHashing.hashThis(num, nxtIndex);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Table Size::");
        int tblSize = in.nextInt();
        DoubleHashing dh = new DoubleHashing(10);
        int[] arr = {89,18,49,58,69};
        if(arr.length>tblSize){
            throw new ArrayIndexOutOfBoundsException();
        }
        for(int temp : dh.hash(arr)){
            if(temp == -1){
                System.out.println("Empty");
            }else{
                System.out.println(temp);
            }
        }
    }
}


