import java.util.Scanner;

public class Sodoku {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner (System.in); 
		 
		 int N = 0, n[][] = new int[9][9];        
		 int nao = 0;
		 int sim = 0;
		 int n2 = 0;
		 int s2 = 0;         
		 
		 System.out.println(" Digite a quantidade de jogadores: ");         
		 N = sc.nextInt();        
		 
		 String[] M = new String[N];         
		 
		 for (int cont = 0; cont < N; cont++) {            
			 System.out.printf(" Digite o nome do jogador ", (cont + 1) + " :");             
			 M[cont] = sc.next();        

		 }         
		
		 for (int jogadores = 0; jogadores < N; jogadores++) {            
			 
			 for (int l = 0; l < 9; l++) {                
				 for (int c = 0; c < 9; c++) {                    
					 System.out.printf("Digite o valor: ");                     
					 n[l][c] = sc.nextInt();                    
					 
					 if (n[l][c] < 1 || n[l][c] > 9) {                         
						 System.out.println(" insira um valor acima de 0 e menor que 9");                        
						 c--;                    
						 
					 	}                
					 }             
				 }             
			
			 for (int l = 0; l < 9; l++) {                
				 for (int c = 0; c < 9; c++) {                    
					 
		int valorN = n[l][c];                     
		
		for (int contV = c + 1; contV < 9; contV++) {                         
			
			if (valorN == n[l][contV]) {                            
				
				nao++;  
			} 
			
			else {   
				
				sim++;                    
						
						}                     
					}              
				 }             
			 }            
			 
			 for (int l = 0; l < 9; l++) {                
				 for (int c = 0; c < 9; c++) {                     
					 
		int valorN = n[l][c];                     
		
		for (int contV = l + 1; contV < 9; contV++) {                        
			
			if (valorN == n[contV][c]) {                             
				
				nao++; 
			} 
			
			else {  
				
				sim++;                         
				
						}                     
					}                
				 }            
			}            
			 
		for (int l = 0; l < 9; l += 3) {                 
			for (int c = 0; c < 9; c += 3) {                     
				
				for (int contL = l; contL < l + 3; contL++) {                         
					for (int contC = c; contC < c + 3; contC++) {                             
						
		int valorN = n[contL][contC];                            
		
		for (int contV = contC + 1; contV < c + 3; contV++) {                                 
			
			if (valorN == n[contL][contV]) {                                    
				
				n2++;                               	
			} 
			
			else {                                     
				
				s2++;                                
				
							}                            
						} 	                       
					}                    
				}                
			}            
		}            
		
		System.out.println("\nSodoku do: " + M[jogadores] + "\n");            
		
		for (int l = 0; l < 9; l++) {                
			for (int c = 0; c < 9; c++) {                    
				
				if (c == 3 || c == 6) {                         
					System.out.print("| ");                 
					
				}                    
				
				if (l == 3 && c == 0 || l == 6 && c == 0) {                        
					
		System.out.println( "---------------------" );                   
					
				}                     
				
		System.out.print(n[l][c] + " ");              
				
				}                 
			
		System.out.println();           
			
				}            
		
				
		if (n2 == 0 && nao == 0) {               
			System.out.println("\nSIM!");           
			
		} 
		
		else {               
				
				System.err.println("\nNÃO!");             
				
					}         
		 		}    
			}
		}
