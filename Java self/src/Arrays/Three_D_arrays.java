/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author amol
 */
public class Three_D_arrays 
{
    public static void main(String[] args) {
        int threed[][][]=new int[3][4][5];
        int i,j,k;
        for(i=0;i<3;i++)
        {
            for(j=0;j<4;j++)
            {
                for(k=0;k<5;k++)
                {
                    threed[i][j][k]=i*j*k;
                }
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<4;j++)
            {
                for(k=0;k<5;k++)
                {
                    System.out.print(threed[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
}
