package de.xeqo.a.a;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class e implements Runnable {
    boolean a = false;
    LinkedBlockingQueue queue = new LinkedBlockingQueue();
    private Lock c = new ReentrantLock();
    private /* synthetic */ r d;

    e(r rVar) {
        this.d = rVar;
    }

    public final void run() {
        while (!this.a) {
            c cVar;
            try {
                cVar = (c) queue.take();
            } catch (InterruptedException e) {
                this.a = true;
                cVar = null;
            }
            if (cVar != null) {
                try {
                    this.c.lock();
                    cVar.a();
                } finally {
                    this.c.unlock();
                }
            }
        }
    }
}
