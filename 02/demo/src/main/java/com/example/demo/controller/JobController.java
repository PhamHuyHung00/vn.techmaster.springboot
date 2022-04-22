package com.example.demo.controller;

import com.example.demo.model.Job;
import com.example.demo.model.Location;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/job")
public class JobController {
    private static List<Job> jobList;
    private List<Location> locations;

    public JobController() {
        jobList = new ArrayList<>();
        jobList.add(new Job("5", "Intern Back-end", "Spring boot", Location.HaNoi, 100, 500, "tuyendung01@gmail.com"));
        jobList.add(new Job("3", "Fresher Front-end", "reactjs", Location.HCM, 110, 510, "tuyendung02@gmail.com"));
        jobList.add(new Job("7", "Junior Back-end", " Spring MVC", Location.HaiPhong, 120, 520, "tuyendung01@gmail.com"));
        jobList.add(new Job("8", "Senior  Front-end", "javascript", Location.DaNang, 130, 530, "tuyendung01@gmail.com"));
    }

    @GetMapping
    public List<Job> getJobList() {
        return jobList;
    }

    @GetMapping("/sortbylocation")
    public List<Job> getJobSortByLocation() {
        return jobList.stream().sorted(Comparator.comparing(Job::getLocation).thenComparing(Job::getId)).collect(Collectors.toList());
    }

    @GetMapping("/salary/{salary}")
    public List<Job> getJosBysalary(@PathVariable("salary") int salary) {
        List<Job> newJob = new ArrayList<>();
        for (int i = 0; i < jobList.size(); i++) {
            if (salary >= jobList.get(i).getMin_salary() && salary <= jobList.get(i).getMax_salary()) {
                newJob.add(jobList.get(i));
            }

        }
        return newJob;

    }

    @GetMapping("/keyword/{keyword}")
    public List<Job> getJobByTitleOrDescription(@PathVariable("keyword") String keyword) {
        List<Job> newJob = new ArrayList<>();
        for (int i = 0; i < jobList.size(); i++) {
            if (jobList.get(i).getTitle().contains(keyword) || jobList.get(i).getDescription().contains(keyword)) {
                newJob.add(jobList.get(i));
            }

        }
        return newJob;
    }

    @GetMapping("/query")
    public List<Job> getJobByTitleOrDescriptionAndLocation(@RequestParam("keyword") String keyword,
                                                           @RequestParam("location") Location location) {
        List<Job> newJob = new ArrayList<>();
        for (int i = 0; i < jobList.size(); i++) {
            if (jobList.get(i).getTitle().contains(keyword) || jobList.get(i).getDescription().contains(keyword)
                    && jobList.get(i).getLocation().equals(location)) {
                newJob.add(jobList.get(i));
            }

        }
        return newJob;

    }

}
