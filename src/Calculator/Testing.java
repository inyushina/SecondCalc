package Calculator;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.Reporter;

public class Testing {
    @Test

    public void PositiveSum() {
        int x = 12, y = 6, z = 18;
        Assert.assertEquals(Calculator.Sum(x, y), z);
    }

    @Test

    public void NegativeSum() {
        int x = 5, y = 6, z = 10;
        Assert.assertEquals(Calculator.Sum(x, y), z);
    }

    @Test

    public void PositiveMultiply() {
        int x = 9, y = 6, z = 54;
        Assert.assertEquals(Calculator.Mult(x, y), z);

    }

    @Test

    public void NegativeMultiply() {
        int x = 0, y = 6, z = 8;
        Assert.assertEquals(Calculator.Mult(x, y), z);

    }

    @Test

    public void PositiveAdj() {
        int x = 40, y = 6, z = 34;
        Assert.assertEquals(Calculator.Adj(x, y), z);

    }

    @Test

    public void NegativeAdj() {
        int x = 67, y = 6, z = 54;
        Assert.assertEquals(Calculator.Adj(x, y), z);

    }

    @Test

    public void PositiveDiv() {
        int x = 9, y = 9, z = 1;
        Assert.assertEquals(Calculator.Div(x, y), z);

    }

    @Test

    public void NegativDiv() {
        int x = 6, y = 0, z = 1;
        Assert.assertEquals(Calculator.Div(x, y), z);

    }

}
