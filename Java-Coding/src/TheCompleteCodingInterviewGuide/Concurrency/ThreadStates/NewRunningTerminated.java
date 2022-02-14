package TheCompleteCodingInterviewGuide.Concurrency.ThreadStates;

public class NewRunningTerminated {
    public static void main(String[] args) {
        Thread t1 = new Thread (() -> {});
        System.out.println ("Created thread t1: " + t1.getState ());

        Runnable runnable = () -> {};
        Thread t2 = new Thread (runnable);
        System.out.println ("Created thread t2: " + t2.getState ());

        Thread t3 = new Thread ( new Runnable () {
            @Override
            public void run() {

            }
        } );
        System.out.println ("Created thread t3: " + t3.getState ());

        Thread t4 = new Thread ( new Thread() {
            @Override
            public void run() {
            }
        });
        System.out.println ("Created thread t4: " + t4.getState ());


        t1.start ();
        System.out.println ("Started thread t1: " + t1.getState ());
        try {
            t2.join ();
            System.out.println ("Closed thread t1: " + t1.getState ());
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
    }
}
