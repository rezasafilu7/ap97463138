
package assignment6;

import java.util.Random;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment6 {

    public static void main(String[] args) {
        int a,rand;
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        if ( a > 10 ){
        rand = ((int)(Math.random()*10+(a-10)));
        }
        else{
            rand = ((int)(Math.random()*10));
        }
        ArrayList list = new ArrayList(rand);
        for ( int i=0 ; i<= rand ; i++){
            list.add(Math.random());
        }
        for ( int j=rand ; j >= 0; j-- ){
            System.out.print(list.get(j));
            System.out.print("\t");
        }
        System.out.print("\n");
    }
    
    
}
