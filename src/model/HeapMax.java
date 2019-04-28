/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Anderson
 */
public class HeapMax {
    private int v[];
    private int n;
    public HeapMax(int v[]){
        this.v = v;
        this.n = v.length - 1;
    }
    public void refaz(int esq, int dir){
        int j = esq * 2;
        int x = this.v[esq];
        while(j <= dir){
            if((j < dir) && (this.v[j] < this.v[j + 1])) {
                j++;
            }
            if(x >= this.v[j]){
                break;
            }
            this.v[esq] = this.v[j];
            esq = j;
            j = esq * 2;
        }
        this.v[esq] = x;
    }
    public void constroi(){
        int esq = n / 2 + 1;
        while(esq > 0){
            esq--;
            this.refaz(esq, this.n);
        }
    }
    /*
    public int retiraMax() throws Exception{
        int maximo;
        if(this.n < 0) throw new Exception ("Erro: heap vazio");
        else{
            maximo = this.v[0];
            this.v[0] = this.v[this.n--];
            refaz(0, this.n);
        }
        return maximo;
    }
    public void aumentaChave(int i, int chaveNova) throws Exception {
        int x = this.v[i];
        while((i > 0) && x >= this.v[i/2]){
            this.v[i] = this.v[i/2];
            i /= 2;
        }
        this.v[i] = x;
    }
    public void insere(int x) throws Exception {
        this.n++;
        if(this.n == this.v.length) throw new Exception ("Erro: heap cheio");
        this.v[this.n] = x;
        this.aumentaChave(n, x);
    }
    public int[] getVetor(){
        return this.v;
    }
    public int max(){
        return this.v[0];
    }
    */
}
