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
public class QuadrateHashing {
    static int[] table = null;
    static int tableSize;
    static int colCounter = 0;
    
    public QuadrateHashing(int tableSize){
        table = new int[tableSize];
        //initialize the array for checking
        for(int i = 0; i<tableSize; i++){
            table[i]=-1;
        }
        QuadrateHashing.tableSize = tableSize;
    }
    public int[] hash(int[] arr){
        for(int temp: arr){
           QuadrateHashing.hashThis(temp, temp%tableSize);
        }
        return QuadrateHashing.table;
    }
    public static void hashThis(int num,int index){
        if(table[index]==-1){
            table[index]=num;
        }else{
            ++colCounter;
            int newIndex = (num+colCounter*colCounter)%tableSize;
            hashThis(num, newIndex);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Table Size::");
        int tblSize = in.nextInt();
        QuadrateHashing qh = new QuadrateHashing(tblSize);
        int[] arr = {89,18,49,58,69};
        if(arr.length>tblSize){
            throw new ArrayIndexOutOfBoundsException();
        }
        for(int temp : qh.hash(arr)){
            if(temp == -1){
                System.out.println("Empty");
            }else{
                System.out.println(temp);
            }
        }
    }
}
