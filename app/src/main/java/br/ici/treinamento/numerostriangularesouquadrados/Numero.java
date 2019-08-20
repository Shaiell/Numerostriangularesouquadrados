package br.ici.treinamento.numerostriangularesouquadrados;

public class Numero {

    int numero;

    public boolean quadrado(){
        double raizQuadrada = Math.sqrt(numero);

        if (raizQuadrada == Math.floor(raizQuadrada)){
            return true;
        }else{
            return false;
        }
    }

    public boolean triangular(){
        int cont = 1;
        int triangularNumero = 1;

        while (triangularNumero <numero){

            cont++;
            triangularNumero = triangularNumero + cont;
        }

        if(triangularNumero==numero){
            return true;
        }else{
            return false;
        }
    }
}
