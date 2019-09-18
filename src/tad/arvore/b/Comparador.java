package tad.arvore.b;

public class Comparador implements IComparador{

	@Override
    public Object compare(Object x, Object y) {
        return (int) x - (int) y;
    }

}
