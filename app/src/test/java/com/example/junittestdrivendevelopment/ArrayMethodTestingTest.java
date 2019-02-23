package com.example.junittestdrivendevelopment;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayMethodTestingTest {

    private ArrayMethodTesting arrayMethodTesting;

    @Before
    public void setup() throws Exception {


    }

    @Test
    public void checkIslessThan10WithMoreThan10() {
        String[] testString = {"stuff", "1", "3", "stuff", "1", "3", "stuff", "1", "3", "24"};
        boolean expectedResult = false;

        boolean result = ArrayMethodTesting.getInstance().isLessThan10(testString);
        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void checkIsLessThan10WithNull() {
        String[] testString = null;
        String[] expectedResult = null;

        boolean result = ArrayMethodTesting.getInstance().isLessThan10(testString);
        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void check_if_sorted_alphabetically() {
        char[] testArray = {'z', 'b', 'a'};
        char[] expectedArray = {'a', 'b','z'};
        char[] result = ArrayMethodTesting.getInstance().sortAlphabetically(testArray);
        Assert.assertEquals(expectedArray, result);

    }

//    @Test
//    public void check_if_returns_sum(){
//        double test = 3.3;
//    double result = ArrayMethodTesting.getInstance().returnSum(test);
//
//    }







    @After
    public void tearDown() throws Exception {

        arrayMethodTesting = null;
    }
}
