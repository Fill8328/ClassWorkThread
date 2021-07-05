package fill.jma;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class ExecutorServiceDemo {

    public static void  demo(){
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            List<Integer> list = new ArrayList<>();
            Random random = new Random();
            for (int j = 0; j < 10; j++) {
                list.add(j, random.nextInt( 100));
            }
            Future<Double> result = executor.submit(new CountAverageCallable(list));

            try {
                System.out.println(result.get());
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }

}
