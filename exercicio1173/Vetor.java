
package exercicio1173;

public class Vetor {
    private int n;
   
    public Vetor(){
        
    }
      
     public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    
    public void adiciona(){
        int []v1 = new int[10];
        for(int i=0; i<10; i++){
            System.out.println("N[" + i + "] = " + this.n);
            this.n *=2;
        }
    }

    
}
