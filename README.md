# 2-KTB: cli-program
Command Line Interface, 콘솔 형태의 프로그램

**주제 설정:** 판교역에서 카카오테크 부트캠프 OT 장소까지 어떻게 가지?<br/>
**개발 환경:** MacOS, IntelliJ, JDK 21
```
1. 프로그램 클래스 설계도(다이어그램) 작성하기
    - 속성, 메소드, 상속의 관계를 먼저 정의한다.
    - 2차 상속은 최소 하나
2. 설계도 기반 콘솔 프로그램 제작
    - 사용자에게 입력받고 진행되는 형태
```

<br/>

## 클래스 다이어그램
![다이어그램](https://github.com/user-attachments/assets/f6797a77-64a8-4599-88bd-a5f08d03131d)

<br/>

## 프로젝트 폴더 트리
```
2-ktb-cli-program
├─ CLI-Program
│  └─ src
│     ├─ Main.java
│     ├─ Script
│     │  ├─ Script.java
│     │  ├─ ScriptBus.java
│     │  ├─ ScriptChoice1.java
│     │  ├─ ScriptChoice2.java
│     │  ├─ ScriptEnding.java
│     │  └─ ScriptOpening.java
│     └─ Transportation
│        ├─ Bus.java
│        ├─ Taxi.java
│        ├─ Transportation.java
│        ├─ Vehicle.java
│        └─ Walk.java
└─ README.md

```
- Transportation 패키지
  - 이동수단-걷기로 1차 상속 관계를 정의하였다.
  - 이동수단-차량-세부차량으로 2차 상속 관계를 정의하였다.
- Script 패키지
  - 시뮬레이션 순서에 따라 스크립트를 나누었다.
  - 부모 클래스에 입력 함수를 만들고 자식 클래스에서 사용하였다.

<br/>

## 설계 시나리오
```
[1] 오프닝 -> 상황 설정
[2] 1번째 선택 분기 -> 범위와 타입에 대해 예외처리
    [1] 걸어간다
    [2] 대중교통을 이용한다(2번째 선택 분기) -> 범위와 타입에 대해 예외처리
        [1] 버스를 탄다.
            [1] 375번
            [2] 누리 4번
            [3] 66번
        [2] 택시를 탄다.
[3] 엔딩 -> 소요 시간(분), 교통 요금(원) 출력
```

<br/>

## 프로그램 시연
![시연 영상](https://github.com/user-attachments/assets/97b21004-8be0-4b03-9383-cc272f39f6de)
