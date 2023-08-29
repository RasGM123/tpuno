/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmaker.tpuno;

public class Operadores {
    public double Resultado;
    public void sumar(double num1,double num2){
        Resultado = num1+num2;
    }
    
    public void cuadrado(double num){
        Resultado = Math.pow(num,2);
    }
    
    public void compipul(double num, int n){
        if(n==1){
          Resultado = num*39.37;  
        }else if(n==2){
            Resultado = (num*39.37)*12;
        }
    }
    
    public void calcularHipotenusa(double cateto1, double cateto2){
        Resultado = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }
    
    public void factorial(double n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {                                                                            
            fact = fact * i;
        }
        Resultado=fact;
    }
    public int buscarMenorQueCero(int[] v) {

  for(int i=0; i<v.length; i++) {
    if(v[i] < 0) {
      return i;
    }
  }

  return -1;

}

public int buscarMayor(int[] v) {

  int mayor = v[0];

  for(int i=1; i<v.length; i++) {
    if(v[i] > mayor) {
      mayor = v[i]; 
    }
  }

  return mayor;

}

    public int indiceDelMayor(int[] v, int mayor) {

      for(int i=0; i<v.length; i++) {
        if(v[i] == mayor) {
          return i;
        }
      }

      return -1;

    }
    
    /**
     *
     * @param m
     */
    public void generarMatrizUnidad(int[][] m) {
    for(int i=0; i<m.length; i++) {
      for(int j=0; j<m[i].length; j++) {  
        if(i==j) {  
          m[i][j] = 1;
        } else {
          m[i][j] = 0;
        }
      }
    }
  }
}

