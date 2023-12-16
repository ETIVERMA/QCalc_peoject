package com.crio.qcalc;

public class App {
     
    
    
    public String getGreeting() { 
        return "Hello World";
    }
    
    public static void main(String[] args){
        System.out.println(new App().getGreeting());
        //System.out.println("Starting QCalc");
        
        StandardCalculator calc = new StandardCalculator();
        //calc.getversion();
        //int result =calc.add(1, 1);
        calc.add(30, 20);
        //calc.multiply(3, 3);
        //calc.divide(25,5);
        //calc.subtract(5, 20);
        calc.clearResult();
        //calc.result = -1;
        //calc.setResult(-1);
        //System.out.println(calc.getResult());
        calc.printResult();
        
        ScientificCalculator calcS = new ScientificCalculator();
         //System.out.println(calcS.cubeOf(10));

         double result = calcS.cubeOf(4.0);
         System.out.println("cube =" + result);
         
         System.out.println(calcS.powerOf(10,3));

         System.out.println(calcS.squareOf(19));

         int result1 = calcS.modulo(5, 2);
         System.out.println("modulo =" + result1);


         System.out.println(calcS.modulo_double(325, 5));

         
           int a = 5 ;   // integer
           float b = 2.0f; // floating-point number
           float c = a + b; // implicit typecasting occurs here
           System.out.println(c);  // output: 7.0
       }
}
