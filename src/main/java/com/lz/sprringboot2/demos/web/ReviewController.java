package com.lz.sprringboot2.demos.web;

/*
 * Created with IntelliJ IDEA.
 * @Author: lz
 * @Date: 2024/06/28/下午9:55
 * @Description:
 */

import com.alibaba.excel.EasyExcel;
import com.lz.sprringboot2.Service.ReviewService;
import com.lz.sprringboot2.demo.pojo.review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author lz
 */
@RestController
@RequestMapping(value = "/reviews")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ReviewController {
    @Autowired
    private ReviewService reviewService;
    // http://localhost:80/campus_entrustment/reviews/exportExcel
    @GetMapping(value = "/exportExcel")
    public void execl(HttpServletResponse response) throws Exception{
        List<review> reviews = reviewService.getReviews();
        if (reviews.size() >0){
            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");

            String fileName = URLEncoder.encode("reviews", "UTF-8").replaceAll("\\+", "%20");
            response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");

            EasyExcel.write(response.getOutputStream(), review.class)
                    .sheet("reviews").doWrite(reviews);

            // 保存到服务器磁盘（这部分根据实际需要决定是否保留）
            // EasyExcel.write("D:\\reviews.xlsx", review.class)
            //         .sheet("评论信息").doWrite(reviews);
            
        }

    }
    
}