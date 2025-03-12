package com.vti.demo_mybatis.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vti.demo_mybatis.entities.AttendanceEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @version 1.0
 * @description:
 * @author: dung.nguyendinh
 * @date: 17/02/2025 17:27
 */

@Mapper
public interface AttendanceMapper extends BaseMapper<AttendanceEntity> {
}
