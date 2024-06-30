package com.lz.sprringboot2.Service.Impl;

/*
 * Created with IntelliJ IDEA.
 * @Author: lz
 * @Date: 2024/06/28/下午9:49
 * @Description:
 */

import com.lz.sprringboot2.Service.ReviewService;
import com.lz.sprringboot2.demo.pojo.review;
import com.lz.sprringboot2.mapper.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author lz
 */
@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewMapper reviewMapper;
    @Override
    public List<review> getReviews() {
        return reviewMapper.selectList(null);
    }
}