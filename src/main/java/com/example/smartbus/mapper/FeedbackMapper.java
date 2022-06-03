package com.example.smartbus.mapper;

import com.example.smartbus.entity.Feedback;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeedbackMapper {
    List<Feedback> findAll();

    List<Feedback> findByUserId(String id);

    int deleteByUserId(String id);

    int insert(Feedback feedback);

    int update(Feedback feedback);
}
