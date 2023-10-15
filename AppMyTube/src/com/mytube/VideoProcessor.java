package com.mytube;

import javax.management.Notification;

public class VideoProcessor {

    private VideoEncoder encoder;
    private IntVideoDatabase database ;
    private IntEmailService emailService;
   
    public VideoProcessor(VideoEncoder encoder,
                    IntVideoDatabase database, 
                    IntEmailService emailService
    ) {
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;

    }

    public void process(Video video) {
        //IntVideoEncoder encoder = new VideoEncoder();
        encoder.encode(video);

        //IntVideoDatabase database = new VideoDatabase();
        database.store(video);

        //var emailService = new EmailService();
        emailService.sendEmail(video.getUser());
    }
}

