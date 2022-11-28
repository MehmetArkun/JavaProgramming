package day48_Collections;

public class ProcessThreadSynchronized {

    /*
    Process
        programs that are scheduled for execution in the CPU
        an instance of a program running on a computer (activity monitor example)
        a process has code, data, heap, and other segments

        Thread
            a subset of a process
            a sequence of execution within a process
            every single process have at least one thread
            in order for process to perform, a thread has to be created
            a process can have multiple threads
            they share the same source that process has

                Synchronized (Thread-Safety)
                    In case there are multiple threads, ensuring the thread safety is the main issue sometimes
                    in order to ensure thread safety, we have to synchronize it.
                    it means process of controlling the access of multiple threads to any shared resource
                    when one process creates multiple threads, those threads access the resource of that process
                    Lets say a process created 4 threads, all those 4 threads will have access the resource of that process
                    The question is do you want all those threads use the resource at the same time, or do you want them access one at a time
                    which one is safer?
                    If they access one by one then it is synchronized.
                    if we apply synchronization, when thread 1 is executed, the resource will be locked to that one.
                    others will wait for lock.
                    once one thread is completed, other threads will be the next ones one by one.
                    One thread at a time being executed -> synchronized.


     */

}
