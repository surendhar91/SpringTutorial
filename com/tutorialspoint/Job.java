package com.tutorialspoint;

public class Job{
    public Job(){
        System.out.println("Job Construction");
    }

    private void init() {
        System.out.println("Post construct of job");
    }

    private void destroy(){
        System.out.println("Pre destroy of job");
    }
}
