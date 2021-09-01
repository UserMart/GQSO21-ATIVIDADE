package app;

import io.jooby.Jooby;
import io.jooby.annotations.*;
import io.jooby.exception.*;
import io.jooby.BadRequestException.*;

@Path("/Subtracao/{a}/{b}")
public class Subtracao {
    @GET
    public String RotaSubtracao (@PathVariable("a"),
     String a, @PathVariable("b"), String b) {
         
        //conversão de double e verificacao de erros
        try{
            double result=Double.parseDouble(a) - Double.parseDouble(b);
              // retorno dos valores subtraidos
               return String.format("%2f", result);
        } 
        catch (NumberFormatException nfe){
            throw  new BadRequestException(String.format("Este Parâmetro é inválido!", result));

        }	
     
    }
}