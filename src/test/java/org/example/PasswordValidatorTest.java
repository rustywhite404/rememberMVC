package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

/*
* 비밀번호 검증 - 요구사항
* • 비밀번호는 최소 8자 이상 12자 이하여야 한다.
* • 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생시킨다.
* • 경계조건에 대해 테스트 코드를 작성해야 한다
*/
public class PasswordValidatorTest {
    
    //Alt+insert로 테스트 메서드 단축키 
    @DisplayName("비밀번호가 최소 8자 이상, 12자 이하면 예외가 발생하지 않는다") //테스트 의도를 위한 어노테이션
    @Test
    void validatePasswordTest(){
        assertThatCode(()->PasswordValidator.validate("rustywhite4")).doesNotThrowAnyException();
    }

    //@ParameterizedTest와 @Test는 독립적으로 동작하는 어노테이션이다. 함께 쓸 수 없음
    //@Test는 단일 테스트 메서드에, @@ParameterizedTest는 여러 입력값을 받아서 테스트 할 때 사용된다(경계값 테스트 등)
    //@ValueSource(strings={...})는 문자열 배열을 만들어서 순차적으로 테스트 메서드의 매개변수로 전달한다.
    @DisplayName("비밀번호가 8자 미만, 12자 초과하는 경우 IllegalArgumentException이 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"seven77","length13words"})
    void validatePasswordTest2(String password) {
        //isInstanceOf와 hasMessage는 예외 메시지의 내용을 검증하는 assertJ의 기능이다.
        //isInstanceOf와는 특정 메서드가 IllegalArgumentException을 발생시키는지 검증
        //hasMessage는 발생한 예외의 메시지를 검증한다.
        assertThatCode(()->PasswordValidator.validate(password)).isInstanceOf(IllegalArgumentException.class).hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
    }

    @Test
    void name() {
    }
}
