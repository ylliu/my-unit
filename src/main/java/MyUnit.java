import java.util.ArrayList;
import java.util.List;

public class MyUnit {
    private final List<String> testMethodNames = new ArrayList<>();
    public int testMethodSize() {
        return testMethodNames.size();
    }

    public void registerTestMethod(String testMethodName) {
        testMethodNames.add(testMethodName);
    }

    public List<String> testMethodNames() {
        return testMethodNames;
    }
}
