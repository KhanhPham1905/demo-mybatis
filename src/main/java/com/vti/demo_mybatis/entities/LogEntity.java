//package com.vti.demo_mybatis.entities;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Positive;
//import lombok.Data;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//@Entity
//@Data
//@Table(name = "logs")
//public class LogEntity {
//    @Id
//    private Long id;
//    @Positive
//    private long employeeId;
//
//    @NotNull
//    private LocalDateTime checkTime;
//    @NotNull
//    private LocalDate attendanceDate;
//
//    @Positive
//    private long deviceId;
//
//    @NotNull
//    @Enumerated(value = EnumType.STRING)
//    private LogType type;
//
//    private Boolean logLated;
//
//    private Integer requestId;
//
//    private Integer attendanceId;
//
//    private Boolean active;
//
//    private Boolean isFakeLog;
//}
