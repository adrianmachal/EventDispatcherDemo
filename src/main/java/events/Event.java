package events;

public interface Event<T> {
    void trigger(T data);
}

