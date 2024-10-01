package org.example;

public class User {
    private String password;
    public void initPassword(PasswordGenerator passwordGenerator){
        //RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        //String randomPassword = randomPasswordGenerator.generatePassword();
        // 위 방식처럼 내부에서 RandomPasswordGenerator의 값을 받으면
        // 입력되는 값에 따라 테스트가 실패하기도 하고, 성공하기도 해서 제어가 불가능하다.
        // (운영 시에는 RandomPasswordGenerator를 쓰겠지만 테스트 시에는 아래와 같이 진행한다.)
        // 이를 해결하기 위해 PasswordGenerator 인터페이스를 만들어
        // 항상 성공하는 CorrectFixedPasswordGenerator와 항상 실패하는 WrongFixedPasswordGenerator를 생성해
        // 테스트 결과를 예상 검증 할 수 있게 만들었다.


        String randomPassword = passwordGenerator.generatePassword();
        /*
        비밀번호는 최소 8자 이상, 12자 이하여야 한다.
         */
        if(randomPassword.length()>=8 && randomPassword.length()<=12){
            this.password = randomPassword;
        }
    }

    public String getPassword() {
        return password;
    }
}
