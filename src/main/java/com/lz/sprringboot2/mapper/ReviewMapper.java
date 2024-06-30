package com.lz.sprringboot2.mapper;

/*
 * Created with IntelliJ IDEA.
 * @Author: lz
 * @Date: 2024/06/28/下午9:50
 * @Description:
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lz.sprringboot2.demo.pojo.review;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lz
 */
@Mapper
public interface ReviewMapper extends BaseMapper<review> {
}