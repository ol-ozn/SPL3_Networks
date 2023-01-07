package bgu.spl.net.srv;

import java.io.IOException;

public interface Connections<T> {

    boolean send(int connectionId, T msg);

    void send(String channel, T msg);

    void disconnect(int connectionId);

    boolean login(String username, String password, int connectionId, ConnectionHandler<T> handler );

    void subscribe(T topic, int connectionId, T id);
}
