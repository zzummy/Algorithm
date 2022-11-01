## 11365. !밀비 급일

​           

**StringBuilder **

String 객체는 변경 불가능하지만 StringBuilder는 변경 가능한 문자열을 만들어줌

```java
// 객체 생성
StringBuilder sb = new StringBuilder();

// .append()로 연결
sb.append("문자열").append("연결");

// 출력 시, toString()으로 변환해줘야함
String str = sb.toString();

```



**StringBuilder 메소드**

- String 클래스와 동일한 메소드
  - chatAt()
  - indexOf() / lastIndexOf()
  - length()
  - replace() : 검색된 문자열 교체
  - substring() : 특정 인덱스 범위 내 문자열 복사해 새로 생성된 인스턴스 반환
  - toString()



- StringBuilder의 메소드
  - append() : 문자열 추가
  - capacity() : 현재 배열 사이즈 반환, String 클래스와 다르게 char[] 사이즈를 여유있게 잡음
  - delete() : 매개변수로 전달 받은 인덱스 사이 문자열 제거 `sb.delete(6,8)`
  - deleteCharAt() : 특정 인덱스의 한 문자만 삭제 `sb.deleteCharAt(6)` = `sb.delete(6,7)`
  - insert() : 특정 위치에 문자열 삽입 `sb.insert(2, "abc")`
  - revers() : 저장된 문자열을 뒤집음