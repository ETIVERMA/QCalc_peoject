package com.crio.qcalc;

public class StandardCalculator {

  private int result;
    //public void add(int num1, int num2)
     public int getResult(){
        return result;
    }

    public void setResult(int value){
      this.result = value;

    }

    
    public void getversion(){
        System.out.println("Standard Calculator 1.0");
    }
    
     public void add(int num1,int num2){
       int result = num1+num2;
        //System.out.println(result);
        setResult(result);
        //return result;
    }


     public int subtract(int num1, int num2){
        int result = num1-num2;
        //System.out.println(result);
        setResult(result);
        return result;
     }


     public int multiply(int num1, int num2){
        int result = num1*num2;
        //System.out.println(result);
        setResult(result);
        return result;
     }


      public int divide(int num1, int num2){
        int result =num1/num2;
       // System.out.println(result);
       setResult(result);
        return result;
      }

      public int clearResult(){
       int result =0;
      return result;
      }

      public void printResult() {
       System.out.println("Standard Calculator Result:" + getResult());
      }
}
