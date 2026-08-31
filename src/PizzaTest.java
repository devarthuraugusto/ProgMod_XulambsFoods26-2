import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PizzaTest {

    @BeforeEach
    public void Setup(){
        //Arrange
        pizza = new Pizza();
        pizza.adicionarIngredientes(4);

    }
    @Test
    public void adicionaIngredientesCorretamente(){
        //Arrange
        Pizza pizza = new Pizza();

        //Act
        int quantos = 
            pizza.adicionarIngredientes(4);

        //Assert
        assertEquals(4, quantos);
    }
    @Test 
    public void naoAdicionaIngredientesNegativos(){
        
    }
    
}

    @Test
    public void naoadicionamaisdoqDevia(){
        
    }
