package chap07.section2
/*
코틀린의 내부 클래스 종류
1. 중첩(Nested) 클래스
2. 이너(Inner) 클래스
자바의 내부 클래스 종류
1. 정적 클래스(static class) : 외부 클래스를 인스턴스화 하지 않고 바로 사용.
2. 멤버 클래스(member class) : 인스턴스 클래스로 불리며 외부 클래스의 필드나 메서드와 연동하는 내부 클래스. 클래스안에 클래스가 들어 있는 경우.
3. 지역 클래스(local class) : 초기화 블록이나 메스더 내의 블록에서만 유효한 클래스
4. 익명 클래스(anonymous class) : 이름이 없고 주로 일회용 객체를 인스턴스화하여 오버라이딩 메서드를 구현하는 내부 클래스.

자바와 코틀린 비교하기
정적 클래스 == 중첩 클래스 : 객체 생성없이 사용 가능
멤버 클래스 == 이너 클래스 : 필드나 메서드와 연동하는 내부 클래스로 inner 키워드가 필요
지역 클래스 == 지역 클래스 : 클래스의 선언이 블록안에 있다면 지역 클래스. 따라서 블록이 끝나면 자동적으로 사라지는 클래스이다.
익명 클래스 == 익명 객체 : 이름이 없고 주로 일회용 객체를 사용하기 위해 object 키워드를 통해 선언된다. 익명 객체로 불리는 이유는 object 키워드를 쓰기 때문.
*/

//자바의 멤버(이너) 클래스
/*
class A {
  ....
  class B {
     //외부 클래스의 A의 필드에 접근 가능
  }
}

//자바의 정적 클래스
class A {
   ....
   static class B { //정적 클래스를 위해 static 키워드를 사용, static이라서 A 클래스가 인스턴스화 되어있지 않아도 바로 사용 가능.
        ....
   }
}

//코틀린의 이너 클래스
class A {
    ....
    inner class B { //자바와 달리 inner 키워드 필요
    //외부 클래스 A의 필드에 접근가능
    }
}
//정적 클래스처럼 사용한 코틀린의 중첩 클래스
class A {
    ....
    class B { //코틀린에서 아무 키워드가 없는 클래스는 기본적으로 중첩클래스 이다.
    자바와는 반대로 되어있다. 중첩클래스이자 정적 클래스이다. 외부 클래스 A의 메서드와 프로퍼티에 기본적으로 접근 불가.

       ...
    }
}
*/

// 정리하기
/*중첩 클래스(Nested 클래스)
        1. 코틀린에서 기본적으로 중첩 클래스는 정적(static)클래스처럼 다뤄진다. 따라서 외부 클래스에 접근이 불가하다.
        2. 접근하려면 멤버(inner) 클래스로 만들어야된다.*/







