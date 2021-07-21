package com.sancheti;

public class VideoProcessor {

    public VideoProcessor(VideoDatabase database, VideoEncoder encoder, NotificationService notificationService) {
        this.database = database;
        this.encoder = encoder;
        this.notificationService = notificationService;
    }

    private VideoDatabase database;
    private VideoEncoder encoder;
    private NotificationService notificationService;

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        notificationService.sendEmail(video.getUser());
    }
}

