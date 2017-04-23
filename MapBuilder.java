import java.util.HashMap;
import java.util.Map;

public class MapBuilder<K, V> {

	private Map<K, V> innerMap;

	public static <K, V> MapBuilder<K, V> buildHashMap(Class<K> kCLass, Class<V> vClass) {
		return new MapBuilder<K, V>();
	}
	
	public MapBuilder<K, V> put(K k,V v) {
		if (null == innerMap) {
			innerMap = new HashMap<K,V>();
		}
		
		innerMap.put(k, v);
		return this;
	}
	
	public Map<K, V> get() {
		return innerMap;
	}
}
