package com.hometalk.onepass.billing.controller;

/**
 * 관리자 관리비 API, 통계 요약(전체, 납부완료, 미납세대수, 납부율),
 * 미납세대조회(필터, 20건이상 페이징), 납부완료처리,
 * 고지서 업로드 (엑셀 파싱 데이터 유효성검사, 미리보기)
 * 업로드 확정 (UPSERT 실행)
 *
 * 공통 전제:
 *  - @PreAuthorize("hasAnyRole('ADMIN','STAFF')") - 관리자/직원 전용
 *  - admin user_id는 Spring Security에서 추출
 */

public class AdminBillingController {


}