public class CounterTask implements Runnable{
    private int counter = 0;

    public void run(){
        for(int i = 0; i < 1000000; i++){
            counter++;
        }
        System.out.println(Thread.currentThread().getName() + ": " + counter);
    }
}
