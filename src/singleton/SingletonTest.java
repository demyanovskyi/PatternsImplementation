package singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonTest {
    @Test
    public void test() {
        Singleton singleton = Singleton.getInstance();
        assertEquals(singleton, Singleton.getInstance());
        assertEquals(singleton.toString(), Singleton.getInstance().toString());
    }
}
