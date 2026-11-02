# ☕ Cafe Order

### Java 기반 카페 주문 및 금액 계산 프로그램

Java의 기본 문법을 활용해 메뉴 가격을 조회하고, 주문 수량에 따른 총금액을 계산하는 콘솔 프로그램입니다.

GitHub의 **Issue, Branch, Pull Request, Code Review** 기능을 활용하여 협업 개발 프로세스를 실습했습니다.

---

## 📌 프로젝트 소개

| 항목 | 내용 |
|---|---|
| 프로젝트명 | Cafe Order |
| 개발 언어 | Java 17+ |
| 개발 환경 | IntelliJ IDEA |
| 빌드 시스템 | IntelliJ |
| 버전 관리 | Git & GitHub |
| 개발 방식 | GitHub Flow 기반 협업 |
| 실습 일자 | 2026.11.02 |

## ✨ 주요 기능

### 1. 메뉴 가격 조회

메뉴 이름을 입력하면 해당 메뉴의 가격을 반환합니다.

| 메뉴 | 가격 |
|---|---:|
| ☕ 아메리카노 | 3,000원 |
| 🥛 라테 | 4,000원 |
| 등록되지 않은 메뉴 | 0원 |

**구현 메서드**

`Menu.getPrice(String name)`

- `if-else` 조건문을 활용한 메뉴 구분
- `equals()`를 활용한 문자열 비교
- 존재하지 않는 메뉴에 대한 기본값 처리

### 2. 주문 금액 계산

메뉴 가격과 주문 수량을 입력받아 총금액을 계산합니다.

**구현 메서드**

`OrderCalculator.calculate(int price, int quantity)`

**계산 방식**

`총금액 = 메뉴 가격 × 주문 수량`

| 가격 | 수량 | 계산 결과 |
|---:|---:|---:|
| 3,000원 | 2 | 6,000원 |
| 4,000원 | 3 | 12,000원 |
| 4,000원 | 0 | 0원 |
| 4,000원 | -1 | 0원 |

- 정상적인 수량은 가격과 곱하여 계산
- 수량이 0 이하인 경우 0원 반환

## 🗂 프로젝트 구조

```text
cafe-order/
├── src/
│   ├── Main.java
│   ├── Menu.java
│   └── OrderCalculator.java
├── .gitignore
└── README.md
```

| 파일 | 역할 |
|---|---|
| `Main.java` | 프로그램 실행 및 주문 결과 출력 |
| `Menu.java` | 메뉴별 가격 조회 |
| `OrderCalculator.java` | 주문 수량에 따른 총금액 계산 |

## 🚀 실행 방법

**1. 저장소 복제**

```bash
git clone https://github.com/DAYHO00/cafe-order.git
```

**2. 프로젝트 열기**

IntelliJ IDEA에서 `cafe-order` 폴더를 엽니다.

**3. 프로그램 실행**

`src/Main.java`의 `main()` 메서드를 실행합니다.

### 💻 실행 결과

```text
주문
메뉴: 아메리카노, 수량: 2
총금액: 6000원
```

## 🤝 GitHub 협업 프로세스

기능별 브랜치를 생성하고 Pull Request를 통해 코드를 검토한 뒤 `main` 브랜치에 병합합니다.

### 브랜치 전략

| 브랜치 | 담당 기능 |
|---|---|
| `main` | 최종 통합 코드 |
| `feature/menu-price` | 메뉴 가격 조회 |
| `feature/order-total` | 주문 금액 계산 |

### 협업 흐름

**① Issue 생성**

담당 기능과 요구사항을 Issue로 등록합니다.

**② 기능 브랜치 생성**

```bash
git switch main
git pull --ff-only origin main
git switch -c feature/menu-price
```

**③ 기능 개발 및 Commit**

```bash
git add src/Menu.java
git commit -m "feat: 메뉴 가격 조회"
```

**④ 원격 저장소 Push**

```bash
git push -u origin feature/menu-price
```

**⑤ Pull Request 및 Code Review**

- 변경 사항 및 테스트 결과 작성
- 팀원 간 코드 리뷰 진행
- 피드백 반영 및 승인

**⑥ Main 브랜치 병합**

리뷰가 완료된 기능을 `main` 브랜치에 병합합니다.

## ✅ 테스트 시나리오

| 테스트 항목 | 입력값 | 기대 결과 |
|---|---|---|
| 정상 주문 | 아메리카노, 2잔 | 6,000원 |
| 정상 주문 | 라테, 3잔 | 12,000원 |
| 없는 메뉴 | 없는 메뉴, 1잔 | 0원 |
| 수량 0 | 라테, 0잔 | 0원 |
| 음수 수량 | 라테, -1잔 | 0원 |

## 🎯 프로젝트 학습 목표

- Java 클래스 및 정적 메서드 활용
- 조건문과 문자열 비교를 활용한 기능 구현
- 기능별 역할 분리를 통한 코드 구조화
- Git Branch 기반 병렬 개발 경험
- GitHub Issue 및 Project를 활용한 작업 관리
- Pull Request 및 Code Review를 통한 협업
- Merge Conflict 이해 및 해결

---

### ☕ Cafe Order

**작은 기능부터 시작해 협업을 통해 하나의 프로그램으로 완성하는 Java 프로젝트**

*2026.11.02 | Spring Boot & AI 통합 실습*
