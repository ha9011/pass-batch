package com.example.batch.passbatch.repository;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class) // jpa 이벤트가 실행될때, 콜백되어 실행해주는 놈
@MappedSuperclass // entity 부모
public class BaseEntity {
    @CreatedDate // entity가 생성될때, 자동생성
    @Column(updatable = false, nullable = false) // 업데이트 X!
    private LocalDateTime createdAt;

    @LastModifiedDate // 변경될때, 자동생성
    private LocalDateTime modifiedAt;


}