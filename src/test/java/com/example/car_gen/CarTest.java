package com.example.car_gen;

import com.example.car_gen.Honda;
import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    Honda civic = new Honda("white", 2020, 200, false);
    Toyota supra = new Toyota("green", 2006, 150, true);

    @Test
    public void testDecelerateSpeed() {
        Assert.assertEquals(45, supra.decelerateSpeed());
    }

    @Test
    public void testAccelerateSpeed(){
        Assert.assertEquals(55, civic.accelerateSpeed());
    }

    @Test
    public void testConvertToElectric(){
        Assert.assertEquals(true, civic.convertToElectric());
    }

}
