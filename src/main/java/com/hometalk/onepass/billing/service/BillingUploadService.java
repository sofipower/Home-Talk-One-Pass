package com.hometalk.onepass.billing.service;

import com.hometalk.onepass.billing.dto.BillingDetailResponse;
import com.hometalk.onepass.billing.entity.BillingDetails;
import com.hometalk.onepass.billing.entity.BillingLogs;
import com.hometalk.onepass.billing.entity.BillingLogs.BillingActionType;
import com.hometalk.onepass.billing.entity.Billings;
import com.hometalk.onepass.billing.entity.Billings.BillingStatus;
import com.hometalk.onepass.billing.repository.BillingDetailRepository;
import com.hometalk.onepass.billing.repository.BillingLogRepository;
import com.hometalk.onepass.billing.repository.BillingRepository;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BillingUploadService {
}
    /**
     * 엑셀 파싱 데이터 유효성 검사 및 미리보기 결과 반환
     * @return 유효성 검사 결과 (정상/오류 행 포함)
     */

    /**
     * 업로드 확정 처리
     * - UPSERT: household_id + billing_month 기준 (C1)
     *   · INSERT: 신규 세대/월 데이터 생성, status = UNPAID
     *   · UPDATE: total_amount, due_date 갱신 + billing_details Delete-Insert
     * - billing_logs UPLOAD 기록
     * - 확정 후: 입주민 미납 배너 즉시 갱신 (status = UNPAID 자동 설정)
     */

