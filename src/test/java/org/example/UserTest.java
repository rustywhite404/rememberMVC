package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @DisplayName("패스워드를 초기화한다.")
    @Test
    void passwordTest() {
        //given - User 객체가 주어졌다
        User user = new User();
        //when - 이 메서드를 호출했을 때
        user.initPassword(new CorrectFixedPasswordGenerator());
        //then
        assertThat(user.getPassword()).isNotNull();

    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화 되지 않는다.")
    @Test
    void passwordTest2() {
        //given - User 객체가 주어졌다
        User user = new User();
        //when - 이 메서드를 호출했을 때
        user.initPassword(new WrongFixedPasswordGenerator());
        //WrongFixedPasswordGenerator는 메서드 하나만 가진 functional Interface기 때문에
        // user.initPassword(()->"ab"));
        // 이렇게 구현해도 동일하다.

        //then
        assertThat(user.getPassword()).isNull();

    }


}