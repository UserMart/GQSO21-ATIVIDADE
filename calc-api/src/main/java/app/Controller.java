package app;

import io.jooby.annotations.*;

@Path("/")
public class Controller {

  @GET
  public String sayHi() {
    return "Bem Vindo a sua Calculadora API!";
  }
}
