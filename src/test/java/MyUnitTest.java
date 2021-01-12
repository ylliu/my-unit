import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MyUnitTest {
    @Test
    public void should_create_an_unit_object() {
        assertThat(new MyUnit().testMethodSize(),is(0));
    }

    @Test
    public void should_return_registered_methods_size() {
        MyUnit myUnit = new MyUnit();
        myUnit.registerTestMethod("single_test_method");
        assertThat(myUnit.testMethodSize(),is(1));
        myUnit.registerTestMethod("double_test_method");
        assertThat(myUnit.testMethodSize(),is(2));
    }

    @Test
    public void should_return_registered_methods_names() {
        List<String> expectedMethodsName = new ArrayList<>();
        MyUnit myUnit = new MyUnit();

        myUnit.registerTestMethod("single_test_method");
        expectedMethodsName.add("single_test_method");
        assertThat(myUnit.testMethodNames().toString(), is(expectedMethodsName.toString()));

        myUnit.registerTestMethod("double_test_method");
        expectedMethodsName.add("double_test_method");
        assertThat(myUnit.testMethodNames().toString(), is(expectedMethodsName.toString()));
    }
}
