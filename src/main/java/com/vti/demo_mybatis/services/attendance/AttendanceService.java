package com.vti.demo_mybatis.services.attendance;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vti.demo_mybatis.entities.AttendanceEntity;

/**
 * @version 1.0
 * @description:
 * @author: dung.nguyendinh
 * @date: 17/02/2025 17:28
 */
public interface AttendanceService extends IService<AttendanceEntity> {
     AttendanceEntity getAttendance(int id);
}
