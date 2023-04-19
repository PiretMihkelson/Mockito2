import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
public class MathApplicationTester {
 
    @Test
    public void testAddAndSubtract(){
        MathApplication mathApplication = new MathApplication();
        CalculatorService calcService = mock(CalculatorService.class);
        mathApplication.setCalcService(calcService);

        when(calcService.add(5.0,4.0)).thenReturn(9.0);
        when(calcService.subtract(5.0,4.0)).thenReturn(1.0);

        Assertions.assertEquals(mathApplication.subtract(5.0,4.0), 1.0, 0);
        Assertions.assertEquals(mathApplication.add(5.0,4.0), 9.0, 0);

        verify(calcService).add(5.0, 4.0);
        verify(calcService).subtract(5.0, 4.0);
    }
}
