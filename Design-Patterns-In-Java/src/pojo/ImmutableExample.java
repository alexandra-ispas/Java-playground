package pojo;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableExample {

    private final String name;
    private final String type;
    private final List<String> courses;

    public ImmutableExample(String name, String type, List<String> courses) {
        this.name = name;
        this.type = type;
        this.courses = courses;
    }

    // doar getters fara setters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public List<String> getCourses() {
        // return courses; -- asa nu e immutable
        return new ArrayList<> (courses);  // asa e immutable
    }

    @Override
    public String toString() {
        return "ImmutableExample{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", courses=" + courses +
                '}';
    }
}
