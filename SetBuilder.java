import java.util.HashSet;
import java.util.Set;

public class SetBuilder<T> {

    private Set<T> innerSet;

    public static <T> SetBuilder<T> build(Class<T> clazz) {
        return new SetBuilder<T>();
    }

    public SetBuilder<T> add(T t) {
        if (null == innerSet) {
        	innerSet = new HashSet<>();
        }
        innerSet.add(t);
        return this;
    }

    public Set<T> get() {
        return innerSet;
    }
}
