package app;

import io.jooby.Jooby;
import io.jooby.annotations.*;

@Path("/Soma/{op}")
public class Soma {
    @GET
    public String RotaSoma () {
        return "Soma";
    }
}