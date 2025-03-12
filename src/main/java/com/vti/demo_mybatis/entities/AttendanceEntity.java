package com.vti.demo_mybatis.entities;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@TableName("attendances")
public class AttendanceEntity {

    @TableId(type = IdType.AUTO)
    private Long id;

    @Positive
    private long employeeId;
    @Positive
    @NotNull
    private long departmentId;

    @NotNull
    private LocalDate fullDate;

    @NotNull
    private LocalDateTime checkin;
    @NotNull
    private LocalDateTime checkout;

//    @Valid
//    @Embedded
//    private WorkingDetails workingDetails;
//
//    @Valid
//    @Embedded
//    private Violate violate;

//    @Valid
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "unauthorizedLate", column = @Column(name = "re_unauthorized_late")),
//            @AttributeOverride(name = "unauthorizedEarly", column = @Column(name = "re_unauthorized_early")),
//            @AttributeOverride(name = "minTimeViolation", column = @Column(name = "re_min_time_violation")),
//            @AttributeOverride(name = "leaveWnNotice", column = @Column(name = "re_leave_wn_notice"))
//    })
//    private Violate reViolate;

    private Boolean active;
}

