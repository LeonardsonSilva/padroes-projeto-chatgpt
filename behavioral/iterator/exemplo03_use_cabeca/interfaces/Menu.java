package behavioral.iterator.exemplo03_use_cabeca.interfaces;

import java.util.Iterator;

import behavioral.iterator.exemplo03_use_cabeca.classes.MenuItem;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
