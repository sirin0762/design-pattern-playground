public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("현재 재고가 없습니다. 다음에 시도해주세요.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("현재 재고가 없습니다. 다음에 시도해주세요.");
    }

    @Override
    public void turnCrank() {
        System.out.println("현재 재고가 없습니다. 다음에 시도해주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("현재 재고가 없습니다. 다음에 시도해주세요.");
    }

}
