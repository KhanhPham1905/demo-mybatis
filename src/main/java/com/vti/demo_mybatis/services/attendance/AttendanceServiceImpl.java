package com.vti.demo_mybatis.services.attendance;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vti.demo_mybatis.entities.AttendanceEntity;
import com.vti.demo_mybatis.mappers.AttendanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @description:
 * @author: dung.nguyendinh
 * @date: 17/02/2025 17:30
 */

@Service
public class AttendanceServiceImpl extends ServiceImpl<AttendanceMapper, AttendanceEntity> implements AttendanceService {
    @Autowired
    private AttendanceMapper attendanceMapper;

    @Override
    public AttendanceEntity getAttendance(int id) {
        return attendanceMapper.selectById(id);
    }
}
