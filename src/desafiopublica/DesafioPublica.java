/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiopublica;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Matheus
 */
public class DesafioPublica  {

    public static void main(String[] args) {
        
     int x = 4;  
     int l;
     int contmin;
     int contmax = 0;
           
     Scanner sc = new Scanner(System.in); /* Permite que o sistema leia oque foi digitado pelo usuario*/

     ArrayList<Tabela> list = new ArrayList<>(); /*Instanciado uma lista para armazenar os elementos*/
    
        Tabela   tabela0 = new Tabela(1,12,12,12,0,0); /* passando os valores da tabela criada por Maria atraves dos paramentros*/
        Tabela   tabela1 = new Tabela(2,24,12,24,0,1);
        Tabela   tabela2 = new Tabela(3,10,10,24,1,1);
        Tabela   tabela3 = new Tabela(4,24,10,24,1,1);
        
        list.add(tabela0); /* essa função adiciona os objetos da tabela em uma lista*/
        list.add(tabela1);
        list.add(tabela2);
        list.add(tabela3);
        
       while (x!=0){ 
          
       System. out.println("Digite 1 para inserir um novo jogo "); /*menu onde o usuario ira escolher uma opcao para a tabela*/
       System. out.println("Digite 2 mostrar tabela");
       System. out.println("Digite 3 para remover um jogo");
       System. out.println("Digite 4 para ver a quantidade de recordes quebrados");
       System. out.println("Digite 0 para sair");
       System.out.println("-----------------------------------------------------------");
        x = sc.nextInt();
      
          switch (x){
            
               case 1: /* ira inserir uma nova tabela*/
                  
                  System.out.println("                                                           "); 
                  System.out.println("                                                           "); 
                  System.out.println("-----------------------------------------------------------"); 
                  System.out.print ("Digite o número do jogo: ");
                    int jogo=sc.nextInt();
                  System.out.print ("Digite o placar do jogo: ");
                    int placar=sc.nextInt();
                  System.out.print ("Digite a pontuação mínima: ");
                    int min = sc.nextInt();
                  System.out.print ("Digite a pontuação máxima: ");
                    int max= sc.nextInt();
                  System.out.print ("Digite a quebra de recorde da pontuação mínima: ");
                    int quebramin = sc.nextInt();
                  System.out.print ("Digite a quebra de recorde da pontuação maxima: ");
                    int quebramax =sc.nextInt(); 
                  System.out.println("-----------------------------------------------------------");
                    list.add(new Tabela(jogo, placar, min, max, quebramin, quebramax));
                  System.out.println("                                                           ");
                  System.out.println("                                                           ");
                  System.out.println("                                                           ");
                         break;
         
                case 2: /* Imprime os objetos da tabela*/
                     
                  System.out.println("                                                           ");
                  System.out.println("                                                           ");
                   for(int i=0; i<list.size();i++){
                     System.out.println (list.get(i).geTabela());
                 
                    }
                 System.out.println("                                                           ");
                 System.out.println("                                                           ");
                        break;
        
                case 3: /* Remove um jogo da tabela*/
         
                   System.out.println("-----------------------------------------------------------");
                   System.out.println("Digite um indice para remover da tabela, lembrando que começa em \"zero\"");
                     l= sc.nextInt();
                     list.remove (l);
                   System.out.println("                                                           ");
                   System.out.println("                                                           ");
                        break;
        
                case 4: /*Imprime a quantidade de recordes quebrados*/
                
                System.out.println("-----------------------------------------------------------");    
                int b =0;   
                int a =0;
                for(int i=0; i<list.size();i++){
                contmax = list.get(i).getMax();
                contmin = list.get(i).getMin();
                    if(contmax>=1){
                     a+=1;
                        }
                    if(contmin>=1){
                        b+=1;      
                        }
                    }
                
                System.out.println("                                                           ");
                System.out.println("                                                           ");
                System.out.println("-----------------------------------------------------------");
                System.out.println ("Quantidade de vezes que o recorde maximo foi quebrado: "+a); 
                System.out.println ("Quantidade de vezes que o recorde minimo foi quebrado: "+b);
                System.out.println("-----------------------------------------------------------");
                System.out.println("                                                           ");
              }
         }
    }       

}
    
                
    