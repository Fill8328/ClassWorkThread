package fill.jma;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class CountAverageCallable implements Callable<Double> {

    private List<Integer> numbers;

    public CountAverageCallable(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public Double call() throws Exception {
        if (numbers.isEmpty())
        return 0d;
        int sum = 0;
        Random random = new Random();
        Thread.sleep(random.nextInt(5000));

        System.out.println("Thread is sleep...");
        System.out.println(Thread.currentThread());

        for (int i = 0; i < numbers.size(); i++) {
            sum+=numbers.get(i);
            System.out.print(numbers.get(i)+ "  ");
        }

        return (double) sum;

    }

}
