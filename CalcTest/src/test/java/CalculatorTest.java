import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest extends Assert {
    Calculator calculator = new Calculator();

    @BeforeMethod
    public void setUp() {

    }

    @AfterMethod
    public void tearDown() {
    }

    //дд для позитивных кейсов для суммы
    @DataProvider(name = "positiveSumData")
    public Object[][] CalcSumData() {
        return new Object[][]{
                {"3", "6", 9},
                {"12", "3", 15},
                {"13", "22", 35},
                {"12342", "123", 12465},
        };
    }

    //дд для позитивных кейсов для умножения
    @DataProvider(name = "positiveMultiplyData")
    public Object[][] CalcMultyplyData() {
        return new Object[][]{
                {"3", "6", 18},
                {"12", "3", 36},
                {"13", "22", 286},
                {"12", "12", 144},
        };
    }

    //дд для позитивных кейсов для разницы
    @DataProvider(name = "positiveDifferenceData")
    public Object[][] CalcDifferenceData() {
        return new Object[][]{
                {"3", "6", -3},
                {"12", "3", 9},
                {"13", "22", -9},
                {"12", "12", 0},
        };
    }

    //дд для позитивных кейсов для деления
    @DataProvider(name = "positiveDivvyData")
    public Object[][] CalcDivvyData() {
        return new Object[][]{
                {"6", "2", 3},
                {"12", "3", 4},
                {"100", "2", 50},
                {"12", "12", 1},
        };
    }

    @Test(dataProvider = "positiveMultiplyData")
    public void testMultiply(String a, String b, int expected) throws Exception {
        //Позитивные кейсы
        assertEquals(calculator.multiply(a, b), expected);
    }

    @Test(dataProvider = "positiveSumData")
    public void testSum(String a, String b, int expected) throws Exception {
        assertEquals(calculator.sum(a, b), expected);
    }

    @Test(dataProvider = "positiveDifferenceData")
    public void testDifference(String a, String b, int expected) throws Exception {
        assertEquals(calculator.difference(a, b), expected);

    }

    @Test(dataProvider = "positiveDivvyData")
    public void testDivvy(String a, String b, int expected) throws Exception {
        Assert.assertEquals(calculator.divvy(a, b), expected);
    }


    @Test
    public void testMultiplyCommon() throws Exception {
        Assert.assertEquals(calculator.multiply("3", "2"), 6);
        Assert.assertEquals(calculator.multiply("300", "2"), 600);
    }

    @Test
    public void testSumCommon() throws Exception {
        Assert.assertEquals(calculator.sum("3", "2"), 5);
        Assert.assertEquals(calculator.sum("134", "22"), 156);
    }

    @Test
    public void testDifferenceCommon() throws Exception {
        Assert.assertEquals(calculator.difference("134", "22"), 112);
        Assert.assertEquals(calculator.difference("133", "3"), 130);
    }

    @Test
    public void testDivvyCommon() throws Exception {
        Assert.assertEquals(calculator.divvy("100", "5"), 20);
        Assert.assertEquals(calculator.divvy("200", "50"), 4);
    }

}
