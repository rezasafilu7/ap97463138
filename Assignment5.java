
package assignment5;

import java.lang.Math;

public class Assignment5 {

    public static void main(String[] args) {
        
       long startTime = System.currentTimeMillis();
        
        double A,B,C,D;
        double finalvalue1,finalvalue2;
        double localmax,localmin,max=0,min=0;
        int x,y;
        
            for ( x=1000, y=1000 ; x >= -1000 && y >= -1000 ; x-=2,y-=2) 
            {
                A = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)); 
                B = x*Math.sin(x+y)+y*Math.cos(x+y);
                finalvalue1 = A / B;

                C = Math.sqrt(Math.pow(x-1 , 2)+Math.pow(y-1 , 2));
                D = (x-1)*Math.sin( (x-1) + (y-1) )+(y-1)*Math.cos( (x-1) + (y-1) );
                finalvalue2 = C / D;

                    if ( finalvalue1 > finalvalue2 ) 
                    {
                        localmax = finalvalue1;
                        localmin = finalvalue2;
                    }
                    else
                    {
                        localmax = finalvalue2;
                        localmin = finalvalue1;
                    }

                    
                    if ( localmax > max ){
                        max = localmax;
                    }
                    if ( localmin < min )
                    {
                        min = localmin;
                    }
            }
            System.out.println("MIN ="+ min + "\n" + "MAX =" + max );
            System.out.println((System.currentTimeMillis()-startTime)+" ms");
    }
    
}
