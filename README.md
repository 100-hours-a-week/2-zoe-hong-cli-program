# 2-KTB: cli-program
Command Line Interface, 콘솔 형태의 프로그램
**주제 설정:** 판교역에서 카카오테크 부트캠프 OT 장소까지 어떻게 가지?

**개발 환경:** MacOS, IntelliJ, JDK 21

<br/>

## 클래스 다이어그램

![클래스 다이어그램](https://github.com/user-attachments/assets/7454d2a3-20ac-4959-884a-2fb8f0d7482f)
- 차랑-걷기로 1차 상속 관계 정의
- 차량-버스-번호로 2차 상속 관계 정의
- 스크립트를 시뮬레이션 순서도에 기반한 종류로 나누어 클래스 생성 -> main 메소드에 대한 의존성 감소

<br/>

## 프로그램 시연
![Image](https://github.com/user-attachments/assets/7495354e-9aef-4cc1-a331-c6805b6a2006)

### 시뮬레이션 순서도
1. 오프닝
2. 걸어갈 것인가, 버스를 탈 것인가?
3. (버스를 탈 경우) 어떤 버스를 탈 것인가?
4. 엔딩