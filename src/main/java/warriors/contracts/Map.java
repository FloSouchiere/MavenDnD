package warriors.contracts;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import warriors.board.Case;


public interface Map {

	Map emptyMap = null;

	String getName();
	int getNumberOfCase();
	List<Case> getListCase();
	int size();
	boolean isEmpty();
	boolean containsKey(Object key);
	boolean containsValue(Object value);
	Set keySet();
	Collection values();
	Set entrySet();
	void clear();
	void putAll(Map m);
	Object remove(Object key);
	Object put(Object key, Object value);
	Object get(Object key);
}