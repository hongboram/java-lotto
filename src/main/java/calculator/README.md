# 1단계 - 문자열 덧셈 계산기

## 기능 목록
* 문자열이 null 이거나 공백일 경우 0 반환
* 문자열 숫자가 하나일 경우 숫자로 형변환해서 반환
* 쉼표 구분자가 있을 경우 쉼표 기준으로 분리해서 각 숫자를 더한 값을 반환
* 쉼표, 콜론 구분자가 있을 경우 쉼표, 콜론 기준으로 분리해서 각 숫자를 더한 값을 반환
* 커스텀 구분자가 있을 경우 커스텀 구분자 기준으로 분리해서 각 숫자를 더한 값을 반환
* 음수가 있을 경우 RuntimeException 예외 발생