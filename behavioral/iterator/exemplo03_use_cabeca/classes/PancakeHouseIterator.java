package behavioral.iterator.exemplo03_use_cabeca.classes;

import java.util.ArrayList;

import behavioral.iterator.exemplo03_use_cabeca.interfaces.Iterator;

public class PancakeHouseIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }

}
