package com.hometalk.onepass.billing.service;


import com.hometalk.onepass.billing.dto.ResidentBillingResponse;



public class BillingService {
}
    /**
     * 입주민 관리비 페이지 초기 데이터
     * - 미납 배너 / 요약 카드 3개 / 내역 리스트(최신 3건) 한 번에 응답
     */


    /**
     * 입주민 관리비 내역 필터링 조회 (연도/월/상태 필터 + 페이징)
     *
     * @param householdId 로그인 세대 ID
     * @param year        연도 (null = 전체)
     * @param month       월 "YYYY-MM" (null = 전체)
     * @param status      납부 상태 (null = 전체)
     * @param pageable    페이징
     * @param dong        세대 동
     * @param ho          세대 호
     */

    /**
     * 고지서 모달 전체 데이터 조회
     * - 입주민: billing_id 기반 API 호출
     * - 관리자 미리보기: previewData props 직접 전달
     *
     * @param billingId  고지서 ID
     * @param dong       세대 동
     * @param ho         세대 호
     */

    /**
     * 관리자 납부완료 처리 (UNPAID → PAID)
     * - confirm 팝업 확인 후 호출
     * - billing_logs에 STATUS_CHANGE 기록
     * - 변경 불가 조건: 이미 PAID 상태인 경우 예외
     *
     * @param billingId 처리 대상 고지서 ID
     * @param adminId   작업 관리자 user_id (Spring Security에서 추출)
     */

    /**
     * 관리자 미납 세대 목록 (필터 + 페이징)
     *
     * @param dong          동 필터 (null = 전체 동)
     * @param year          연도 필터 (null = 전체)
     * @param month         월 필터 "YYYY-MM" (null = 전체)
     * @param status        상태 필터 (null = 전체, UNPAID = 미납만)
     * @param overdueMonths 3개월 이상 체납 필터 여부
     * @param pageable      페이징 (기본 20건)
     * @param householdMap  household_id → {dong, ho, residentName} 매핑
     */


    /**
     * 관리자 통계 요약 (전체/납부완료/미납 세대 수, 납부율)
     *
     * @param billingMonth 기준 부과월 (예: "2026-03")
     */


    /**
     * 관리자 통계 응답 record
     */


    /** "2026-02" → "2026년 2월" 변환 */
