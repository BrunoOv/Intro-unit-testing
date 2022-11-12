package objetos.parcial3.intro;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class RectangleTest {
    @Test
    public void testArea(){

        Rectangle rectangle=new Rectangle(1,2);
        double area =rectangle.getArea();
        Assertions.assertEquals(2.0,area);
        Assertions.assertEquals(1.0,rectangle.getBase());
        Assertions.assertEquals(2.0,rectangle.getHeight());
    }
    @Test
    public void testPerimeter(){
        Rectangle rectangle=new Rectangle(1,2);
        double perimeter =rectangle.getPerimeter();
        Assertions.assertEquals(6,perimeter);
    }
}