import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;

public class CoutingFactorizer {
    private final AtomicLong count = new AtomicLong();

    public long getCount(){
        return count.get();
    }

    public synchronized void service()
    {
        /*
        BigInteger i = extractFromRequest();
        BigInteger[] factors = factor(i);
        count.incrementAndGet();
        encodeIntoResponse();
        */
    }
}
