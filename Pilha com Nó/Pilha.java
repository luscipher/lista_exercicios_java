public class Pilha {
    No pilha[];
    int TAM;
    //ponteiro de controle da pilha
    int topo = -1;
    public Pilha(int tam){
        pilha = new No[tam];
        this.TAM = tam;
    }
    //push
    public void empilha(No n){
        if(topo == -1 || topo<(this.TAM-1)){
            topo = topo +1;
            pilha[topo] = n;
            System.out.println(n.tostring());
        }
        else{
            System.out.println("PILHA CHEIA...");
        }
    }
    //pop - desempilha - sempre no final
    public No desempilha(){
        if(topo !=-1){
            No temp = pilha[topo];
            pilha[topo] = null;
            topo = topo-1;
            System.out.println(temp.tostring());
            return temp;
        }
        else{
            System.out.println("Pilha vazia");
            return null;
        }
    }
    public void imprime(){
        for(int i = this.topo; i >= 0; i--) {
            System.out.println(i+" - " +pilha[i].tostring());
        }
    }
}