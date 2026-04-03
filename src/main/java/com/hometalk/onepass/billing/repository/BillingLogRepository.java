package com.hometalk.onepass.billing.repository;

import com.hometalk.onepass.billing.entity.BillingLogs;
import com.hometalk.onepass.billing.entity.BillingLogs.BillingActionType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BillingLogRepository extends JpaRepository<BillingLogs, Long> {

    /**
     * 입주민 요약 카드 - 최근 납부일 조회
     * billing_logs에서 해당 세대의 STATUS_CHANGE 로그 중 가장 최근 created_at
     * 로그 기반으로 납부일 산출
     */
    Optional<BillingLogs> findTopByBilling_HouseholdIdAndActionTypeOrderByCreatedAtDesc(
            Long householdId,
            BillingActionType actionType
    );

    /**
     * 고지서 모달 - 특정 billing_id의 STATUS_CHANGE 로그 created_at → 납부일로 사용
     */
    Optional<BillingLogs> findTopByBilling_IdAndActionTypeOrderByCreatedAtDesc(
            Long billingId,
            BillingActionType actionType
    );
}