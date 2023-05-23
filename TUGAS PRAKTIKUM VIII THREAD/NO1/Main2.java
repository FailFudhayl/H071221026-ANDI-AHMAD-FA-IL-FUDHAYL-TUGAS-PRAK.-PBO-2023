import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TaskTimeHelper {
    public static int getRandomExecutionTime() {
        Random random = new Random();
        return random.nextInt(7);
    }
}

class SumberData {
    int dataSuccess = 0;
    int dataFailed = 0;
    int dataProcess = 0;

    public int getDataSuccess() {
        return dataSuccess;
    }

    public int getDataFailed() {
        return dataFailed;
    }

    public int getDataProcess() {
        return dataProcess;
    }

    int sucess() {
        return this.dataSuccess += 1;
    }

    int failed() {
        return this.dataFailed += 1;
    }

    int proses() {
        return this.dataProcess += 1;
    }
}

public class Main2 {
    public static void main(String[] args) {
        int datass = 4;
        ExecutorService executor = Executors.newFixedThreadPool(3);
        SumberData sbd = new SumberData();
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Start load " + datass + " data.");
                int sec = 0;
                while (sbd.getDataProcess() != datass) {
                    sec++;
                    System.out.println("Loading... (" + sec + "S)");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Task Finish.");
                System.out.println("Time Execution : " + sec + "S");
                System.out.println(
                        sbd.getDataSuccess() + " Data Successfully Loaded & " + sbd.getDataFailed()
                                + " Data failed to load.");
            }
        });

        for (int i = 0; i < datass; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    int ranTime = TaskTimeHelper.getRandomExecutionTime();
                    if (ranTime > 4) {
                        System.out.println("Request Timeout");
                        sbd.failed();
                    } else {
                        sbd.sucess();
                    }

                    sbd.proses();

                }

            });
        }

        executor.shutdown();
    }
}
