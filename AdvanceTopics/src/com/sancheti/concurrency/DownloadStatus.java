package com.sancheti.concurrency;

import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    private volatile boolean isDone;
    private LongAdder totalBytes = new LongAdder();
    private int totalFiles;

    public void incrementTotalBytes() {
        synchronized (this) {
            totalBytes.increment();
        }
    }

    public synchronized void incrementTotalFiles() {
        totalFiles++;
    }

    public int getTotalBytes() {
        return totalBytes.intValue();
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}
