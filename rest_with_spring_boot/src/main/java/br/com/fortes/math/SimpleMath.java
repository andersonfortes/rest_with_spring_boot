package br.com.fortes.math;

import br.com.fortes.exception.UnsupportedMathOperationException;

import static org.apache.el.lang.ELArithmetic.isNumber;

public class SimpleMath {

    public static Double soma(Double n1, Double n2)  {

        return (n1) + (n2);
    }

    public static Double division(Double n1, Double n2){
        if(!isNumber(n1) || !isNumber(n2)) throw new UnsupportedMathOperationException("Favor fornecer numeros validos!");
        return (n1)/ (n2);
    }


    public static Double multi(Double n1, Double n2){
        return (n1) * (n2);
    }

    public static Double media(Double n1,  Double n2){
        return ((n1)+(n2))/2;
    }


    public static Double raiz(Double n){
        return Math.sqrt(n);
    }

}
