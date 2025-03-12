//package com.vti.demo_mybatis.repositories;
//
//import com.vti.demo_mybatis.entities.LogEntity;
//import com.vti.demo_mybatis.entities.LogType;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//public interface LogJpaRepository extends JpaRepository<LogEntity, Long>, JpaSpecificationExecutor<LogEntity> {
//    List<LogEntity> findByIdIn(List<Long> ids);
//
//    List<LogEntity> findByEmployeeId(Long employeeId);
//    LogEntity findFirstByEmployeeIdAndTypeAndIsFakeLogAndCheckTimeBetween(
//            Long userId, LogType type, Boolean isFakeLog, LocalDateTime startDate, LocalDateTime endDate);
//
//    LogEntity findFirstByEmployeeIdAndTypeAndIsFakeLogAndCheckTimeBetweenOrderByCheckTimeDesc(
//            Long userId, LogType type, Boolean isFakeLog, LocalDateTime startDate, LocalDateTime endDate);
//}
