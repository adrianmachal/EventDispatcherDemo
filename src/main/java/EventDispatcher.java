import events.Event;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

public class EventDispatcher<T> {
    private final Map<Predicate<T>, Event<T>> eventMap = new LinkedHashMap<>();

    public void register(Predicate<T> predicate, Event<T> event) {
        eventMap.put(predicate, event);
    }

    public void dispatch(T data) {
        eventMap.entrySet().stream()
                .filter(entry -> entry.getKey().test(data))
                .forEach(entry -> entry.getValue().trigger(data));
    }
}
