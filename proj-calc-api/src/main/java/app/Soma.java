package app;

import io.jooby.annotations.GET;
import io.jooby.annotations.Path;
import io.jooby.exception.BadRequestException;

@Path("/Soma/{x}/{y}")
public class Soma{
    private String y;
    private string result;
    private double soma;

    @GET
    public String RotaSoma (@PathVariable("x")
     String x, @PathVariable("y") String y) throws BadRequestException{
         
        double resultado = 0.;
    try{
        double soma = Double.parseDouble(x) + Double.parseDouble(y);
        return y;
        return String.format("%2f", soma);
    } catch (IllegalArgumentException iae) {
        throw new BadRequestException(iae.getMessage());
    }
   
}
    public String soma(string result, String x) {
        double resultado =0.;
        try{
            double result1=Double.parseDouble(x) + Double.parseDouble(y);
              // retorno dos valores
               return String.format("%2f", result);
        }
        catch (NumberFormatException nfe){
            throw  new IllegalArgumentException(String.format("Este Parâmetro é inválido!", result));
        }
    }
}