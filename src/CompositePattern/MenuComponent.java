package CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class MenuComponent {

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getPlace() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public int getPrice() {
        throw new UnsupportedOperationException();
    }

    public String getDays() {
        throw new UnsupportedOperationException();
    }

    public String getDetail() {
        throw new UnsupportedOperationException();
    }

    public ArrayList getList() {
        throw new UnsupportedOperationException();
    }

    public Object[] getObject() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator() {
        throw new UnsupportedOperationException();
    }
}
