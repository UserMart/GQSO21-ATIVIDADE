package app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import io.netty.handler.codec.http.HttpContentEncoder.Result;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class SomaTest (){

    static soma1;
    
    @BeforeEach
    public static void setup(){
        soma1 = new Soma();
    }

    @Test
    public void testSoma_OK(){
        assertEquals(2 + 1, soma1.RotaSoma("3.", null));
    }
    @Test
    public void testSoma_nao_pode_letras(){
        assertThrows(IllegalArgumentException.class.()->{
            soma1.RotaSoma("b", null);
        });    
}
    @Test
    public void testSoma_negativos_nao(){
        assertThrows(IllegalArgumentException.class.()-> {
                soma1.RotaSoma("-5", null);
            }
        });
    }
