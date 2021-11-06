package app;

import org.junit.jupiter.api.Test;

import io.netty.handler.codec.http.HttpContentEncoder.Result;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomaTest (){

    @Test
    public void testSoma_OK(){
        Soma soma1 = new Soma();
        assertEquals(2 + 1, soma1.soma("3."));
    }
}
