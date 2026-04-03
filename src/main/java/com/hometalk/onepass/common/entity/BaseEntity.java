package com.hometalk.onepass.common.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

/**
 * 공통 엔터티 (모든 테이블 공통 컬럼)
 *
 * Common Entity 명세:
 *  - created_at  : 생성 시간
 *  - deleted_at  : 삭제 시간
 *  - updated_at  : 수정 시간
 *  - title       : 제목 (VARCHAR 30, NULL 허용)
 *  - content     : 내용 (TEXT, NULL 허용)
 *
 * title / content는 필요한 Entity에서만 @AttributeOverride 또는 직접 선언하여 사용.
 * 관리비 도메인(Billings, BillingDetails, BillingLogs)은 title·content 미사용.
 */
@MappedSuperclass
@Getter
public abstract class BaseEntity {

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
}