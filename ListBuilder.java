import java.util.ArrayList;
import java.util.List;

public class ListBuilder<T> {

    private List<T> innerList;

    public static <T> ListBuilder<T> build(Class<T> clazz) {
        return new ListBuilder<T>();
    }

    public ListBuilder<T> add(T t) {
        if (null == innerList) {
            innerList = new ArrayList<>();
        }
        innerList.add(t);
        return this;
    }

    public List<T> get() {
        return innerList;
    }
}
