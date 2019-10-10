package exercicio;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numAlunos = 5; 
        
        double[] NotasAlunos = new double [numAlunos] ;
        for (int i = 0; i < numAlunos; ++i){
        System.out.println("insira a nota " +(i+1)+ " aluno da primeira classe");
        NotasAlunos[i]= input.nextDouble();  
                }
        System.out.println("Essas são as notas dos alunos da primeira classe");
         for (int i = 0; i < numAlunos; ++i){
        System.out.println("->" + NotasAlunos[i]);          
                }
         
        int numeAlunos = 5; 
        
        double[] NotassAlunos = new double [numeAlunos] ;
        for (int i = 0; i < numeAlunos; ++i){
        System.out.println("insira a nota " +(i+1)+ " aluno da segunda classe");
        NotassAlunos[i]= input.nextDouble();  
                }
        System.out.println("Essas são as notas dos alunos da segunda classe");
         for (int i = 0; i < numeAlunos; ++i){
        System.out.println("->" + NotassAlunos[i]);          
                }
      
             
         }
       
	}
			
	

         }
       
    
    

    }
    
}
