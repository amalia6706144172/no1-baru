/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no1;

/**
 *
 * @author Praktikum
 */
import java.util.Scanner;
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                  
		Scanner bilangan  = new Scanner(System.in);
		System.out.print("Masukan deret angka yang ingin di tukar ?");
		int d= bilangan.nextInt();
		for(int z=1;z<=d;z++)
			System.out.print(angka(z) + " ");
		System.out.println();
	}

	private static int tukar (int a)
	{
		if(a==2 || a==1)
			a=2;
		else
			a= angka(a-1) + angka(a-2);
		return a;
	}
        
}
        
    
    

