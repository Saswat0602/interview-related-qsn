write java  code for Token-Bus medium access scheme .


public class TokenBus {

private boolean token;

public TokenBus() {

token = false;

}

public synchronized void takeToken() {

while (token) {

try {

wait();

} catch (InterruptedException e) { }

}

token = true;

}

public synchronized void releaseToken() {

token = false;

notifyAll();

}

}