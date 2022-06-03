package com.example.smartbus.service.Impl;

import com.example.smartbus.dto.CommonResult;
import com.example.smartbus.entity.Feedback;
import com.example.smartbus.mapper.FeedbackMapper;
import com.example.smartbus.service.FeedbackService;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Resource
    FeedbackMapper feedbackMapper;

    @Override
    public List<Feedback> findAll() {
        return feedbackMapper.findAll();
    }

    @Override
    public List<Feedback> findByUserId(String id) {
        return feedbackMapper.findByUserId(id);
    }

    @Override
    public CommonResult deleteByUserId(String id) {
        CommonResult commonResult = new CommonResult();
        try {
            int res = feedbackMapper.deleteByUserId(id);
            if (res == 1) {
                commonResult.setStatus("OK");
            } else {
                commonResult.setStatus("Failed");
            }
            return commonResult;
        } catch (DataAccessException e) {
            commonResult.setStatus("Failed");
            commonResult.setMsg(e.toString());
            return commonResult;
        }
    }

    @Override
    public CommonResult insert(Feedback feedback) {
        CommonResult commonResult = new CommonResult();
        try {
            int res = feedbackMapper.insert(feedback);
            if (res == 1) {
                commonResult.setStatus("OK");
            } else {
                commonResult.setStatus("Failed");
            }
            return commonResult;
        } catch (DataAccessException e) {
            commonResult.setStatus("Failed");
            commonResult.setMsg(e.toString());
            return commonResult;
        }
    }

    @Override
    public CommonResult update(Feedback feedback) {
        CommonResult commonResult = new CommonResult();
        try {
            int res = feedbackMapper.update(feedback);
            if (res == 1) {
                commonResult.setStatus("OK");
            } else {
                commonResult.setStatus("Failed");
            }
            return commonResult;
        } catch (DataAccessException e) {
            commonResult.setStatus("Failed");
            commonResult.setMsg(e.toString());
            return commonResult;
        }
    }
}
