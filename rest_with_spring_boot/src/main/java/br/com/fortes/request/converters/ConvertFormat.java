package br.com.fortes.request.converters;

import br.com.fortes.exception.UnsupportedMathOperationException;

public  class ConvertFormat {
    public static Double convertToDouble(String s) throws UnsupportedMathOperationException {
        if(s == null || s.isEmpty())
            throw new UnsupportedMathOperationException("Please ser a numeric value!");
        String number = s.replace(",", ".");
        return  Double.parseDouble(number);
    }
    public boolean isNumber(String s){
        if(s == null || s.isEmpty())
            return false;
        String number = s.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

}
