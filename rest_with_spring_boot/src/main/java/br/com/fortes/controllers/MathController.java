package br.com.fortes.controllers;

import br.com.fortes.exception.UnsupportedMathOperationException;
import br.com.fortes.math.SimpleMath;
import br.com.fortes.request.converters.ConvertFormat;
import com.sun.tools.jconsole.JConsoleContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static br.com.fortes.request.converters.ConvertFormat.convertToDouble;
import static org.apache.el.lang.ELArithmetic.isNumber;

@RequestMapping("/math")
@RestController
public class MathController {

    //http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{n1}/{n2}")
    public Double soma(
            @PathVariable("n1") String n1,
            @PathVariable("n2") String n2
    ) throws UnsupportedMathOperationException{
        if(!isNumber(n1) || !isNumber(n2))
            throw new UnsupportedMathOperationException("Please ser a numeric value!");

        return SimpleMath.soma(convertToDouble(n1) , convertToDouble(n2));
    }
    @RequestMapping("/division/{n1}/{n2}")
    public Double division(
            @PathVariable("n1") String n1,
            @PathVariable("n2") String n2
    ){
        if(!isNumber(n1) || !isNumber(n2)) throw new UnsupportedMathOperationException("Favor fornecer numeros validos!");
        return SimpleMath.division(ConvertFormat.convertToDouble(n1),ConvertFormat.convertToDouble(n2));
    }




    @RequestMapping("/multi/{n1}/{n2}")
    public Double multi(
            @PathVariable("n1") String n1,
            @PathVariable("n2") String n2){
        if(!isNumber(n1)||!isNumber(n2)) throw new UnsupportedMathOperationException("Digite numeros válidos!");
        return SimpleMath.multi(convertToDouble(n1), convertToDouble(n2));
    }
    @RequestMapping("/media/{n1}/{n2}")
    public Double media(
            @PathVariable("n1") String n1,
            @PathVariable("n2") String n2){
        if(!isNumber(n1)|| !isNumber(n2)) throw new UnsupportedMathOperationException("Digite numeros!");
        return SimpleMath.media(convertToDouble(n1),convertToDouble(n2));
    }

    @RequestMapping("/sqrt/{n}")
    public Double raiz(@PathVariable("n") String n){
        if(!isNumber(n)) throw new UnsupportedMathOperationException("Digite um numero válido! ");
        if(convertToDouble(n)<0) throw new UnsupportedMathOperationException("Digite um numero positivo");
        return SimpleMath.raiz(convertToDouble(n));
    }

}
