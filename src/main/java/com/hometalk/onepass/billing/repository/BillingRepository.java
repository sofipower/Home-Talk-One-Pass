package com.hometalk.onepass.billing.repository;

import com.hometalk.onepass.billing.entity.Billings;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BillingRepository extends JpaRepository<Billings, Long> {

    /**
     * 입주민 관리비 내역 목록 (최신순 페이징)
     * - billing_month DESC 정렬
     * - 연도 필터: billing_month BETWEEN 'YYYY-01' AND 'YYYY-12'
     * - 월 필터: billing_month = 'YYYY-MM'
     * - 상태 필터: status = UNPAID / PAID
     */

    /**
     * 입주민 요약 카드 - 이번 달 청구액 조회, 미납 건수
     * 입주민 미납 배너 - 미납 건 존재 여부 + 최신 미납 부과월
     * 최신 미납 부과월 1건만 조회
     */

    /**
     * 관리자 미납 세대 목록 (페이징)
     * - 동 필터, 연도/월 필터, 상태 필터(미납만 보기 / 납부완료) 지원
     * - 3개월 이상 체납 필터: billing_month <= 3개월 전 기준월
     * - 기본 정렬: 최신 부과월 우선, 동/호 오름차순
     */


    /**
     * 관리자 통계 - 전체 세대 수 (billings 기준 distinct household)
     */


    /**
     * 관리자 통계 - 납부 완료 세대 수
     */

    /**
     * UPSERT - household_id + billing_month 기준 기존 데이터 조회
     * 제약조건(UNIQUE) 기반
     */
