/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiopublica;

/**
 *
 * @author Matheus
 */
public  class  Tabela {
    protected int jogo;
    protected int placar;
    protected int mintemp;
    protected int maxtemp;
    protected int quebramin;
    protected int quebramax;
    protected int contmin=0;
    protected int contmax=0;

    
     public Tabela(){
     }
  
     public  Tabela(int jogo, int placar, int mintemp, int maxtemp, int quebramin, int quebramax) {
        this.jogo = jogo;
        this.placar = placar;
        this.mintemp = mintemp;
        this.maxtemp = maxtemp;
        this.quebramin = quebramin;
        this.quebramax = quebramax;
        this.contmax = quebramax;
        this.contmin = quebramin;
     }

  
    public int getJogo() {
        return jogo;
    }

    public void setJogo(int jogo) {
        this.jogo = jogo;
    }

    public int getPlacar() {
        return placar;
    }

    public void setPlacar(int placar) {
        this.placar = placar;
    }

    public int getMintemp() {
        return mintemp;
    }

    public void setMintemp(int mintemp) {
        this.mintemp = mintemp;
    }

    public int getMaxtemp() {
        return maxtemp;
    }

    public void setMaxtemp(int maxtemp) {
        this.maxtemp = maxtemp;
        if (maxtemp>=1){
            contmax++;
        }      
    }

    public int getQuebramin() {
        return quebramin;
    }

    public void setQuebramin(int qubramin) {
        this.quebramin = qubramin;
    }

    public int getQuebramax() {
        return quebramax;
    }

    public void setQuebramax(int quebramax) {
        this.quebramax = quebramax;
    }
    
    public String geTabela() {
        System.out.println ("jogo    "
                + "Placar    "
                + "Minimo da Temporada    "
                + "Maximo da Temporada    "
                + "Quebra Recorde Minimo    "
                + "Quebra Recorde Maximo    ");
        
         System.out.println (" " +this.getJogo()+ 
                 "        "+this.getPlacar()+
                 "               "
                 +this.getMintemp()+
                 "                    "
                 +this.getMaxtemp()+
                 "                       "
                 +this.getQuebramin()+
                 "                        "
                 +this.getQuebramax());
                 
        return  (" ");
        
                }
 
    public int getMin(){
       
        return contmin;
    }
    
    public int getMax(){
       
        return contmax;
                
                
    
}
}
