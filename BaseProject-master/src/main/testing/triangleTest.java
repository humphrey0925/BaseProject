package testing;

import org.junit.Assert;

import static org.junit.Assert.*;

public class triangleTest {

    @org.junit.Test
    public void getType() throws Exception{
        triangle triangle = new triangle(5,10,5);
        String result = triangle.getType();
        Assert.assertEquals("不是三角形",result);
    }
}
