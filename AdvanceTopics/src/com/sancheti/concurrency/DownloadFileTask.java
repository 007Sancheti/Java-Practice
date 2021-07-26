package com.sancheti.concurrency;

public class DownloadFileTask implements Runnable{
    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading file..." + Thread.currentThread().getName());
        for (int i = 0; i < 1_000_000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }
        status.done();
        synchronized (status) {
            status.notifyAll();
        }
        System.out.println("Download complete" + Thread.currentThread().getName());
    }

    public DownloadStatus getStatus() {
        return status;
    }
}
