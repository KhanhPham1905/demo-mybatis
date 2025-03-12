//package com.vti.demo_mybatis.entities;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Positive;
//import jakarta.validation.constraints.Size;
//import lombok.Getter;
//import lombok.Setter;
//import org.hibernate.annotations.Fetch;
//import org.hibernate.annotations.FetchMode;
//
//import java.util.List;
//
//@Entity
//@Getter
//@Setter
//@Table(name = "request_logs")
//
//public class RequestLogEntity {
//    @Id
//    private Long requestId;
//
//    @Positive
//    private long employeeId;
//
//    @Positive
//    private long departmentId;
//
//    @Positive
//    private long approvingManagerId;
//
//    private Long projectManagerId;
//
//    private Boolean lateApproved;
//
//    @OneToMany(mappedBy = "request", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
//    @Fetch(FetchMode.SUBSELECT)
//    private List<RequestLogLineEntity> requestLines;
//
//    @Size(max = 225)
//    private String note;
//
//    @NotNull
//    @Enumerated(value = EnumType.STRING)
//    private RequestLogStatus status;
//
//}
