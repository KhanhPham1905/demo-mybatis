//package com.vti.demo_mybatis.entities;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import jakarta.persistence.*;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Size;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.time.LocalDateTime;
//
//@Entity
//@Getter
//@Setter
//@Table(name = "request_log_lines")
//public class RequestLogLineEntity {
//
//    @Id
//    private Long lineId;
//
//    @JsonIgnore
//    @ManyToOne
//    @JoinColumn(name = "request_id", referencedColumnName = "requestId")
//    private RequestLogEntity request;
//
//    @NotNull
//    @Enumerated(value = EnumType.STRING)
//    private RequestLogLineType forgetType;
//
//    private Boolean workOvernight;
//
//    private LocalDateTime requestCheckIn;
//
//    private LocalDateTime requestCheckOut;
//
//    private LocalDateTime requestCheckOutOvernight;
//
//    private LocalDateTime actualFirstCheckIn;
//
//    private LocalDateTime actualFirstCheckOut;
//
//    @Size(max = 225)
//    private String reason;
//
//    private String evidence;
//
//    private Boolean lateApprove;
//
//
//
//}
