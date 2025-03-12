package com.vti.demo_mybatis.controllers;

import com.vti.demo_mybatis.services.attendance.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description:
 * @author: dung.nguyendinh
 * @date: 17/02/2025 17:33
 */

@RestController
public class AttendanceController {

    @Autowired
    AttendanceService attendanceService;

    @GetMapping
    public String getAttendance() {
        return  attendanceService.getAttendance(1).toString();
    }

}
