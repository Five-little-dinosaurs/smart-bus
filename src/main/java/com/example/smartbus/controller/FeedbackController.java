package com.example.smartbus.controller;

import com.example.smartbus.dto.CommonResult;
import com.example.smartbus.entity.BusDetail;
import com.example.smartbus.entity.Feedback;
import com.example.smartbus.service.FeedbackService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/v1/entity/feedback")
public class FeedbackController {
    @Resource
    FeedbackService feedbackService;

    @GetMapping
    public List<Feedback> findAll() {
        return feedbackService.findAll();
    }

    @GetMapping("/{id}")
    public List<Feedback> findByUserId(@PathVariable("id") String id) {
        return feedbackService.findByUserId(id);
    }

    @DeleteMapping("/{id}")
    public CommonResult deleteByUserId(@PathVariable("id") String id) {
        return feedbackService.deleteByUserId(id);
    }

    @PostMapping
    public CommonResult insert(@RequestBody Feedback feedback) {
        return feedbackService.insert(feedback);
    }

    @PutMapping
    public CommonResult update(@RequestBody Feedback feedback) {
        return feedbackService.update(feedback);
    }
}
