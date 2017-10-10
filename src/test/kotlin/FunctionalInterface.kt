import java.util.concurrent.ThreadPoolExecutor

/* functional Java interface (or SAM interface) - an interface with a Single Abstract Method */

/*
    public class JavaCode {
        ThreadPoolExecutor executor;

        public void execute() {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("This runs in a thread pool");
                }
            });
        }

        public void executeLambda() {
            executor.execute(() -> System.out.println("This runs in a thread pool"));
        }
    }
*/

class KotlinEquivalent(private val executor: ThreadPoolExecutor) {
    fun executeObject() {
        // anonymous class
        executor.execute(object : Runnable {
            override fun run() {
                println("This runs in a thread pool")
            }
        })
    }

    fun executeLambda() {
        executor.execute({ println("This runs in a thread pool") })
    }

    val instanceOfFunctionalInterface = Runnable { println("This runs in a thread pool") }
}
