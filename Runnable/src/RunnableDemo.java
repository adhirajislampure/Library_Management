public class RunnableDemo {
    public static void main(String[] args) {
        CounterTask counterTask = new CounterTask();
        Thread thread1 = new Thread(counterTask);
        thread1.start();
        Thread thread2 = new Thread(counterTask);
        thread2.start();
        Thread thread3=new Thread(counterTask);
        thread3.start();
        Thread thread4=new Thread(counterTask);
        thread4.start();
        Thread thread5=new Thread(counterTask);
        thread5.start();
        Thread thread6=new Thread(counterTask);
        thread6.start();
        Thread thread7=new Thread(counterTask);
        thread7.start();

    }
}


//
//    git config --global user.name "adhirajislampure"
//        git config --global user.email "adhirajislampure549@gmail.com"