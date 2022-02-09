import java.util.Iterator;

public class Waitress {

    MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void printMenu() {
        menuComponent.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = menuComponent.createIterator();
        System.out.println("-------------VEGITERIAN MENU------------");
        while (iterator.hasNext()) {
            MenuComponent component = iterator.next();
            try {
                if(component.isVegetarian()) {
                    component.print();
                }
            } catch (UnsupportedOperationException e) {}
        }
    }

}
