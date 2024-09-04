package com.sparta.newsfeed19.global.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ResponseCode {
    // 공통 응답 코드
    SUCCESS("정상 처리되었습니다", HttpStatus.OK),
    INVALID_REQUEST("잘못된 요청입니다.", HttpStatus.BAD_REQUEST),

    // 사용자 응답 코드
    NOT_FOUND_USER("존재하지 않는 사용자입니다.", HttpStatus.NOT_FOUND),
    EXIST_EMAIL("존재하는 이메일 입니다.", HttpStatus.BAD_REQUEST),
    INVALID_PASSWORD("비밀번호가 일치하지 않습니다.", HttpStatus.BAD_REQUEST),
    SAME_PASSWORD("기존 비밀번호와 일치합니다.", HttpStatus.BAD_REQUEST),

    // 게시물 응답 코드
    POST_NOT_FOUND("게시물을 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    POST_CREATION_FAILED("게시물 생성에 실패했습니다.", HttpStatus.BAD_REQUEST),
    POST_UPDATE_FAILED("게시물 수정에 실패했습니다.", HttpStatus.BAD_REQUEST),

    // 댓글 응답 코드

    // 팔로우 응답 코드
    INVALID_FOLLOW_REQUEST("자기 자신을 팔로우할 수 없습니다.", HttpStatus.BAD_REQUEST),
    ALREADY_FOLLOWED_USER("이미 팔로우중인 사용자입니다.", HttpStatus.CONFLICT),
    ALREADY_UNFOLLOWED_USER("팔로우중이 아닌 사용자는 언팔로우할 수 없습니다.", HttpStatus.BAD_REQUEST),
    ;

    private final String message;
    private final HttpStatus code;

    ResponseCode(String message, HttpStatus code) {
        this.message = message;
        this.code = code;
    }
}
