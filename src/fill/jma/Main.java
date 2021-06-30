package fill.jma;

public class Main {

    public static void main(String[] args) {
        Thread t = new TalkThread( 5, "bitch");
        Runnable r = new WalkThread(5);
        Thread e = new Thread(r);
        t.setPriority(Thread.MAX_PRIORITY);
        t.run();
        e.run();
        t.start();
        e.start();


        /* синхронизация бывает блокирующая и не блокирующая
        атамарная операция ввел/прочел
        реализация Volatile //privet volatile in value;
        Volatile - для реализации неблокирующих синхронизаций те изменение переменной
         мнгновенно видны всем потокам с примитивным типо данных до 32 бит

         AtomicReference - для любых типов данных
         AtomicInteger
         AtomicBoolean...
         Atomic -

         блокирующая synchronize
         не блокирующая Volatile Atomic

         .yielt() - в текушей операции все сделанно можно выполнять другие потоки того же приоритета
         .sleep() - останавливает поток на время но не освобождает обьект блокировки Time.DAYS.sleep()
         .wait() - спит но снимает блокировку с обьекта можно ждать пока не пнут с помощью .notifyAll .notify
         .join() - 


         */
	// start метод который организует новый поток в данной операционной систвеме
        // native метод реалиованный не на языке джава(С++)
        //способы реализации многопоточности 2
        //1) напрямую от thread extends 2) implements
    }
}
