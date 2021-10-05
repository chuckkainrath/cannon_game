package com.saggezza.cannon_game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VelocityValidityCheckObjTest {
@Test
    public void checkVelocityTest20(){
        //Given: The user is asked for a velocity input
        //When: The user inputs a velocity of 20

    IVelocityValidityCheckObj vel = new VelocityValidityCheckObj();
    boolean result = vel.checkVelocity(20);

    //Then: The velocity is valid

        assertEquals(true,result);
    }
@Test
    public void checkVelocityTest2(){
        //Given: The user is asked for a velocity input
        //When: The user inputs a velocity of 2

        IVelocityValidityCheckObj vel = new VelocityValidityCheckObj();
        boolean result = vel.checkVelocity(2);

        //Then: The velocity is valid

        assertEquals(true,result);
    }
@Test
    public void checkVelocityTestdecimal(){
        //Given: The user is asked for a velocity input
        //When: The user inputs a velocity of 2.4

        IVelocityValidityCheckObj vel = new VelocityValidityCheckObj();
        boolean result = vel.checkVelocity(2.4);

        //Then: The velocity is valid

        assertEquals(true,result);
    }


    @Test
    public void checkVelocityTest0(){
        //Given: The user is asked for a velocity input
        //When: The user inputs a velocity of 21

        IVelocityValidityCheckObj vel = new VelocityValidityCheckObj();
        boolean result = vel.checkVelocity(0);

        //Then: The velocity is invalid

        assertEquals(false,result);
    }
}
