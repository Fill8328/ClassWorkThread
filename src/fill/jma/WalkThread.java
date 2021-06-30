package fill.jma;

public class WalkThread implements Runnable {
    private final int counter;
    private final String name = "(I love tits)";
    public WalkThread (int counter) {
        this.counter = counter;
    }


    @Override
    public  void run(){
        for (int i = 0; i < counter; i++) {
            System.out.println("Walking Runnable " + i);

        }
        System.out.println("Runnable " + name + " is finished");
    }
}
