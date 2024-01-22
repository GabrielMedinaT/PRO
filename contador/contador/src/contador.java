package contador.contador.src;
public class contador {
    int x = 0;

    public void increment() {
        x++;
    }

    public void decrement() {
        if (x > 0)
            x--;
    }

    public int getValue() {
        return x;
    }


}


