package com.hometalk.onepass.billing.repository;


import com.hometalk.onepass.billing.entity.BillingDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingDetailRepository extends JpaRepository<BillingDetails, Long> {

    /**
     * 고지서 모달 - billing_id 기준 상세 항목 전체 조회
     * 입주민/관리자 미리보기 공용
     */

    /**
     * 업로드 UPSERT UPDATE 케이스 - 기존 상세 항목 전체 삭제 후 재삽입
     * C6: billing_id 기준 삭제 (CASCADE와 별개로 서비스 레이어에서 명시적 삭제)
     */

}