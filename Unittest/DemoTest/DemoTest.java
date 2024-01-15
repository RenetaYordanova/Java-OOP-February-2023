package DemoTest;

import Demo.Utils;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoTest {


    @Test
    public  void testGetMinAllPositiveNumbers() {
        int[] numbers=new int[]{4,17,2,10,1,7,5};

        int min=Utils.getMin(numbers);

      assertEquals(1,min);

    }



    @Test
    public  void testGetMinAllNegativeNumbers() {
        int[] numbers=new int[]{-4,-17,-2,-10,-1,-7,-15};

        int actual=Utils.getMin(numbers);

     assertEquals(-17,actual);

        }



    @Test
    public  void testGetMinLargePositiveNumbers() {
        int[] numbers=new int[]{1004,10017,1002,10010,1001,1007,10015};
        int actual=Utils.getMin(numbers);

        assertEquals(1001,actual);

    }

    @Test
    public  void testGetMinNegativeNumbers() {
        int[] numbers=new int[]{4,17,2,-10,1,7,15};

        int actual=Utils.getMin(numbers);

        assertEquals(-10,actual);

    }
    @Test
    public  void testGetMin() {
        int[] numbers=new int[]{4,17,2,10,1,7,15};


        assertEquals(1, Utils.getMin(numbers));
        }
    }






