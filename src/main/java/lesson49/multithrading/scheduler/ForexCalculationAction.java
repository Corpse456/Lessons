package lesson49.multithrading.scheduler;

public class ForexCalculationAction extends Action {

    @Override
    public void execute () {
        System.out.println("Calculating the dollar exchange rate...");
        try {
            Thread.sleep((long) (Math.random() * 12000 + 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Dollar now = " + Math.random() * 2);
    }
}
