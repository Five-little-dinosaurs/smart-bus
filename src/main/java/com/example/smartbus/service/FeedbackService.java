package com.example.smartbus.service;

import com.example.smartbus.dto.CommonResult;
import com.example.smartbus.entity.Feedback;

import java.util.List;

public interface FeedbackService {
    List<Feedback> findAll();

    List<Feedback> findByUserId(String id);

    CommonResult deleteByUserId(String id);

    CommonResult insert(Feedback feedback);

    CommonResult update(Feedback feedback);

}
