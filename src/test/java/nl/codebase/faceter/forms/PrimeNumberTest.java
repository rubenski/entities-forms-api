package nl.codebase.faceter.forms;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class PrimeNumberTest {

    @Test
    public void findFirst() throws Exception {
        int first = new PrimeNumber().findNth(1);
        Assert.assertEquals(2, first);
    }

    @Test
    public void findSecond() throws Exception {
        int second = new PrimeNumber().findNth(2);
        Assert.assertEquals(3, second);
    }

    @Test
    public void findThird() throws Exception {
        int second = new PrimeNumber().findNth(3);
        Assert.assertEquals(5, second);
    }

    @Test
    public void findFourth() throws Exception {
        int second = new PrimeNumber().findNth(4);
        Assert.assertEquals(7, second);
    }

    @Test
    public void findTwentieth() throws Exception {
        int twentieth = new PrimeNumber().findNth(20);
        Assert.assertEquals(71, twentieth);
    }

    @Test
    public void findOneHundreth() throws Exception {
        int oneHundreth = new PrimeNumber().findNth(100);
        Assert.assertEquals(541, oneHundreth);
    }

}