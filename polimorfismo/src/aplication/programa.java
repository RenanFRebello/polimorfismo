package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entidades.produtoimportado;
import entidades.produtonormal;
import entidades.produtousado;
public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault (Locale.ITALY);
		
        Scanner leitor = new Scanner (System.in);
        
                List <produtonormal> listaprodutos = new ArrayList <>();
                System.out.println ("Entre com o n�mero de produtos: ");
                int numero = leitor.nextInt(); 
                
                for (int i=1; i<= numero;i++) {
                System.out.println ("Dados do produto"+i);
                System.out.println();
                
                System.out.println("Digite o tipo de produto de produto normal,importado ou usado: ");
                leitor.nextLine();
                String tipo = leitor.nextLine();
                	
                System.out.println("Digite o nome: ");
                
                String nome = leitor.nextLine();
                
                System.out.println("Digite o pre�o do produto: ");
                double preco = leitor.nextDouble();
                
                System.out.println("Digite a quantidade do produto: ");
                int qtd = leitor.nextInt();
                
                if( tipo == "importado") {
                   System.out.println("Digite a taxa de importa��o");
                   double tximport = leitor.nextDouble();
                   produtonormal prod = new produtoimportado (nome,preco,qtd,tximport);
    	           listaprodutos.add(prod);
                } else {
                if(tipo == "usado") {
                	System.out.println("Digite o c�digo de uso)");
                	int cduse = leitor.nextInt();
                	produtonormal prod2 = new produtousado (nome,preco,qtd,cduse);
                	listaprodutos.add (prod2);
                } else {
                if (tipo == "normal") {
                	produtonormal prod3 = new produtonormal (nome,preco,qtd);
                	listaprodutos.add(prod3);
                }
                }
                }
                }
                System.out.println();
                System.out.println("etiquetas de valores");
                
                for (produtonormal produto :listaprodutos) {
                System.out.println("nome "+ produto.getNome()+produto.calcularprecofinal());
                }
        
        
        
        
        
        
        
        
        
        leitor.close();
	}

}
