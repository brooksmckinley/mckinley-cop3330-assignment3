package ex44;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestInventory {
    @Test
    public void testParser() {
        // Initializing a few inventories to test the parser
        new Inventory("{ \"products\": [ { \"name\": \"something\", \"price\": 3.0, \"quantity\": 1 } ] }");
        new Inventory("{ \"products\": []}");
        new Inventory("""
                {
                    "products" : [
                        {"name": "Widget", "price": 25.00, "quantity": 5 },
                        {"name": "Thing", "price": 15.00, "quantity": 5 },
                        {"name": "Doodad", "price": 5.00, "quantity": 10 }
                    ]
                }
                """);
    }

    @Test
    public void testExists() {
        Inventory testInventory = new Inventory("""
                {
                    "products" : [
                        {"name": "Widget", "price": 25.00, "quantity": 5 },
                        {"name": "Thing", "price": 15.00, "quantity": 5 },
                        {"name": "Doodad", "price": 5.00, "quantity": 10 }
                    ]
                }
                """);
        Assertions.assertTrue(testInventory.productExists("Widget"));
        Assertions.assertTrue(testInventory.productExists("Thing"));
        Assertions.assertTrue(testInventory.productExists("Doodad"));
        Assertions.assertFalse(testInventory.productExists("ajskdlajsd"));
        Assertions.assertFalse(testInventory.productExists("widget"));
        Assertions.assertFalse(testInventory.productExists("dooDad"));
    }

    @Test
    public void testProductReport() {
        Inventory testInventory = new Inventory("""
                {
                    "products" : [
                        {"name": "Widget", "price": 25.00, "quantity": 5 },
                        {"name": "Thing", "price": 15.00, "quantity": 5 },
                        {"name": "Doodad", "price": 5.00, "quantity": 10 }
                    ]
                }
                """);
        Assertions.assertEquals("""
                Name: Thing
                Price: 15.00
                Quantity: 5
                """, testInventory.getProductReport("Thing"));
        Assertions.assertEquals("""
                Name: Widget
                Price: 25.00
                Quantity: 5
                """, testInventory.getProductReport("Widget"));
        Assertions.assertEquals(
                "Sorry, that product was not found in our inventory.",
                testInventory.getProductReport("asdljaslkd")
        );
    }

    @Test
    public void testGetProduct() {
        Product thing = new Product("Thing", 15.00, 5);
        Inventory testInventory = new Inventory("""
                {
                    "products" : [
                        {"name": "Widget", "price": 25.00, "quantity": 5 },
                        {"name": "Thing", "price": 15.00, "quantity": 5 },
                        {"name": "Doodad", "price": 5.00, "quantity": 10 }
                    ]
                }
                """);
        Product actualProduct = testInventory.getProduct("Thing");
        Assertions.assertEquals(thing.getProductReport(), actualProduct.getProductReport());
        Assertions.assertNull(testInventory.getProduct("ashdkjahskjd"));
    }
}
