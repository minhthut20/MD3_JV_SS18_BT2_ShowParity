public class OddThread extends Thread{
    private Thread time;

    public OddThread() {
    }
    public void run(){
        for (int i = 1; i < 11; i++) {
            System.out.println(1);
            try {
                Thread.sleep(10);
            }catch (InterruptedException e ){
                throw new RuntimeException(e);
            }
        }
    }
}
