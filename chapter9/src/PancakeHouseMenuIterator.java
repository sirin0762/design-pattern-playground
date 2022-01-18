import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {

    List<MenuItem> menus;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menus) {
        this.menus = menus;
    }

    @Override
    public boolean hasNext() {
        return menus.size() > position;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menus.get(position);
        position++;
        return menuItem;
    }

}
