package lesson49.multithrading.scheduler;

public class Scheduler {
    AsyncTask task;

    public Scheduler (Action task) {
        this.task = new AsyncTask(task);
    }

    public void everyTen () {
        System.out.println("Scheduler started");
        while (true) {
            task.execute();
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void sayStatus () {
        System.out.println("I'm ok. Do something");
    }

    private static class AsyncTask {
        Action task;

        public AsyncTask (Action task) {
            this.task = task;
        }

        private void execute () {
            new Thread() {
                @Override
                public void run () {
                    task.execute();
                }
            }.start();
        }
    }

    Thread t;
}
