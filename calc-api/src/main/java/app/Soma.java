package app;

import io.jooby.Jooby;
import io.jooby.annotations.*;
import io.jooby.exception.*;
import io.jooby.BadRequestException.*;

public class Soma {
    @Path("/Soma/{x}/{y}")
    @GET
    public String RotaSoma (@PathParam String x, @PathParam String y) {
         
        //conversão de double e verificacao de erros
        try{
            double result = (Double.parseDouble(x)) + (Double.parseDouble(y));
              // retorno dos valores
               return String.format("%2f", result);

        } catch (NumberFormatException nfe){
            throw  new BadRequestException(String.format("Este Parâmetro é inválido!\"%s\"", result));

        }	
     
    }
}