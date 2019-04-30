/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Jece Xavier
 */
public class Ordering {
    //Attributes
    //Constructor
    //My Functions
    public static void shellsort(int[] nums) {
        
        //imprimeVetor(nums);
        
        int h = 1;
        int n = nums.length;

        while(h < n) {
                h = h * 3 + 1;
        }

        h = h / 3;
        int c, j;

        while (h > 0) {
            for (int i = h; i < n; i++) {
                c = nums[i];
                j = i;
                while (j >= h && nums[j - h] > c) {
                    nums[j] = nums[j - h];
                    j = j - h;
                }
                nums[j] = c;
            }
            h = h / 2;
        }
        //System.out.println("Vetor Ondenado: ");
        //imprimeVetor(nums);
    }
    
    public static void selectionsort(int[] vetor) {
        
        //imprimeVetor(vetor);
        
        
        int n = vetor.length;
        int min, aux;
        
        //imprimeVetor(vetor);

        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[min]) {
                    min = j;
                }
            }
            //System.out.println("troca.: min.: " + vetor[min] + " com.: " + vetor[i]);
            aux = vetor[min];
            vetor[min] = vetor[i];
            vetor[i] = aux;
        }    
        
        //System.out.println("\nVetor Ondenado: ");
        //imprimeVetor(vetor);
    }
    
    public static void insertionsort(int[] vetor) {
        //imprimeVetor(vetor);
        
        int n = vetor.length;
        int aux, j;
        
        //imprimeVetor(vetor);
        
        for (int i = 1; i < n; i++) {
            aux = vetor[i];
            j = i - 1;
            //System.out.println("i = " + i + " > i-esimo.: " + aux);
            while(j >= 0 && aux < vetor[j]){
                //System.out.println("troca.: " + vetor[j]);
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }
        
        //System.out.println("\nVetor Ondenado: ");
        //imprimeVetor(vetor);
    }
    
    public static void bubblesort(int[] vetor) {
        //imprimeVetor(vetor);
        
        int n = vetor.length;
        int aux;
        
        for (int i = 0; i < n-1; i++) {
            //System.out.println(i + 1 + "º Passagem");
            for (int j = 1; j < n; j++) {
                //System.out.println("compara.: " + vetor[j - 1] + " " + vetor[j]);
                if (vetor[j] < vetor[j-1]) {
                    //System.out.println("troca.:");
                    aux = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = aux;
                }
            }
        }
        //System.out.println("\nVetor Ondenado: ");
        //imprimeVetor(vetor);
    }

    private static class LimiteParticoes{int i; int j;}
    
    public static LimiteParticoes particao(int[] v, int esq, int dir) {
        LimiteParticoes p = new LimiteParticoes();
        p.i = esq;
        p.j = dir;
        int x = v[(p.i + p.j) / 2]; //obtem o pivo
        do{
            while(v[p.i] < x) p.i++;
            while(v[p.j] > x) p.j--;
            if(p.i <= p.j){
                //System.out.println("Pivo: " + x + " i = " + p.i + "[" + v[p.i] + "]" + " j = " + p.j + "[" + v[p.j] + "]");
                int aux = v[p.i];
                v[p.i] = v[p.j];
                v[p.j] = aux;
                p.i++;
                p.j--;
            }
        }while(p.i <= p.j);
        return p;
    }
    
    private static void ordena(int[] v, int esq, int dir){
        //System.out.println("Ordena: i = " + esq + " j = " + dir);
        LimiteParticoes p = particao(v, esq, dir);
        if(esq < p.j) ordena(v, esq, p.j);
        if(p.i < dir) ordena(v, p.i, dir);
    }
    
    public static void mergeSort(int[] vetor, int tamanho) {
        //imprimeVetor(vetor);
        
        if (tamanho < 2) {
            return;
        }
        int mid = tamanho / 2;
        int[] l = new int[mid];
        int[] r = new int[tamanho - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = vetor[i];
        }
        for (int i = mid; i < tamanho; i++) {
            r[i - mid] = vetor[i];
        }
        mergeSort(l, mid);
        mergeSort(r, tamanho - mid);

        merge(vetor, l, r, mid, tamanho - mid);
        
        //System.out.println("\nVetor Ondenado: ");
        //imprimeVetor(vetor);
    }
    
    private static void merge( int[] vetor, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                vetor[k++] = l[i++];
            }
            else {
                vetor[k++] = r[j++];
            }
        }
        while (i < left) {
            vetor[k++] = l[i++];
        }
        while (j < right) {
            vetor[k++] = r[j++];
        }
    }
    
    public static void quicksort(int[] v){
        //imprimeVetor(v);
        
        ordena(v, 0, v.length-1);
        
        //System.out.println("\nVetor Ondenado: ");
        //imprimeVetor(v);
    }
     
    public static void heapsort(int[] v) {
        //imprimeVetor(v);
        
        HeapMax heap = new HeapMax(v);
        int dir = v.length-1; //int dir = n;
        heap.constroi();
        while(dir > 0){
            int x = v[0];
            v[0] = v[dir];
            v[dir] = x;
            dir--;
            heap.refaz(0, dir);
        }
        
        //System.out.println("\nVetor Ondenado: ");
        //imprimeVetor(v);
    }
    
    public static void imprimeVetor(int[] v) {
        System.out.println("-----------------------------");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println("");
        System.out.println("-----------------------------");
    }
    
    //Gents and Sets
}
