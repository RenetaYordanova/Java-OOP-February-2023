package p01_Database;

import org.junit.Assert;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import java.lang.reflect.Field;


public class DatabaseTest {

    @Test(expected = OperationNotSupportedException.class)
    public void testDatabaseCtorMoreThan16ElementsThrows() throws OperationNotSupportedException{
        Integer[]largeArray=new Integer[16 +1];
        new Database(largeArray);
    }


    @Test(expected = OperationNotSupportedException.class)
    public void testDatabaseCtorLessThan16ElementsThrows() throws OperationNotSupportedException{
        Integer[]smallerArray=new Integer[0];
        new Database(smallerArray);
    }


    @Test
    public void testDatabaseCtorInitialization16Capacity() throws OperationNotSupportedException, IllegalAccessException, NoSuchFieldException {
        Database database=new Database(11,12,13,14,15);
        Field elementsField=Database.class.getDeclaredField("elements");
        elementsField.setAccessible(true);
        Integer [] databaseElements= (Integer[]) elementsField.get(database);
        Assert.assertEquals(16,databaseElements.length);
    }

    @Test
    public void testDatabaseCtor() throws OperationNotSupportedException{
        Integer[]expectedElements= {11,12,13,14,15};

        Database database=new Database(expectedElements);

        Integer[]actualElements= database.getElements();
        Assert.assertEquals(expectedElements.length,actualElements.length);
        Assert.assertEquals(expectedElements[0],actualElements[0]);
        Assert.assertEquals(expectedElements[1],actualElements[1]);
        Assert.assertEquals(expectedElements[2],actualElements[2]);
        Assert.assertEquals(expectedElements[3],actualElements[3]);
        Assert.assertEquals(expectedElements[4],actualElements[4]);



    }

    @Test
    public  void testAdd() throws OperationNotSupportedException {
        Integer[]initialElements= {11,12,13,14,15};
        Database database=new Database(initialElements);

        database.add(16);

        Integer[] actualElements = database.getElements();
        Assert.assertEquals(initialElements.length +1,actualElements.length);

    }


    @Test
    public  void testRemove(){throw new IllegalStateException();

    }
    @Test
    public  void testGetElements(){throw new IllegalStateException();

    }
}
