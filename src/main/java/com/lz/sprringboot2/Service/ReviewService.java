package com.lz.sprringboot2.Service;

/*
 * Created with IntelliJ IDEA.
 * @Author: lz
 * @Date: 2024/06/28/下午9:49
 * @Description:
 */
import com.lz.sprringboot2.demo.pojo.review;

import java.util.List;

public interface ReviewService {
    List<review> getReviews();
}