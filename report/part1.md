# Разбираем наивный пример где вообще не думали про ошибки
## Когда все ок
### C
```
123 * 123 = 15129
```
### Golang
```
123 * 123 = 15129
```
### Rust
```
123 * 123 = 15129
```
### Kotlin
```
123 * 123 = 15129
```
## Не существующий файл
### C
```
Segmentation fault (core dumped)
```
### Golang
```
0 * 0 = 0
```
### Rust
```
thread 'main' panicked at 'called `Result::unwrap()` on an `Err` value: Os { code: 2, kind: NotFound, message: "No such file or directory" }', src/p1/e1/main.rs:9:38
note: run with `RUST_BACKTRACE=1` environment variable to display a backtrace
```
### Kotlin
```
Exception in thread "main" java.io.FileNotFoundException: resources/part_1/__no_such_file__.txt (No such file or directory)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:158)
	at P1_e1Kt.main(p1_e1.kt:11)
```
## Дирктория
### C
```
0 * 0 = 0
```
### Golang
```
0 * 0 = 0
```
### Rust
```
thread 'main' panicked at 'called `Result::unwrap()` on an `Err` value: Os { code: 21, kind: IsADirectory, message: "Is a directory" }', src/p1/e1/main.rs:11:36
note: run with `RUST_BACKTRACE=1` environment variable to display a backtrace
```
### Kotlin
```
Exception in thread "main" java.io.FileNotFoundException: resources/part_1 (Is a directory)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:158)
	at P1_e1Kt.main(p1_e1.kt:11)
```
## Забыли передать параметр
### C
```
Segmentation fault (core dumped)
```
### Golang
```
panic: runtime error: index out of range [1] with length 1

goroutine 1 [running]:
main.main()
	/media/comdiv/data/code/error_handling/golang/cmd/p1/e1/go_1_1.go:10 +0x165
```
### Rust
```
thread 'main' panicked at 'index out of bounds: the len is 1 but the index is 1', src/p1/e1/main.rs:8:21
note: run with `RUST_BACKTRACE=1` environment variable to display a backtrace
```
### Kotlin
```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
	at P1_e1Kt.main(p1_e1.kt:8)
```
## Число с пробелами вокруг
### C
```
123 * 123 = 15129
```
### Golang
```
0 * 0 = 0
```
### Rust
```
thread 'main' panicked at 'called `Result::unwrap()` on an `Err` value: ParseIntError { kind: InvalidDigit }', src/p1/e1/main.rs:13:41
note: run with `RUST_BACKTRACE=1` environment variable to display a backtrace
```
### Kotlin
```
Exception in thread "main" java.lang.NumberFormatException: For input string: "  123"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:651)
	at java.base/java.lang.Integer.parseInt(Integer.java:781)
	at P1_e1Kt.main(p1_e1.kt:13)
```
## Число после которого сразу буквы
### C
```
123 * 123 = 15129
```
### Golang
```
0 * 0 = 0
```
### Rust
```
thread 'main' panicked at 'called `Result::unwrap()` on an `Err` value: ParseIntError { kind: InvalidDigit }', src/p1/e1/main.rs:13:41
note: run with `RUST_BACKTRACE=1` environment variable to display a backtrace
```
### Kotlin
```
Exception in thread "main" java.lang.NumberFormatException: For input string: "123ABC"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:665)
	at java.base/java.lang.Integer.parseInt(Integer.java:781)
	at P1_e1Kt.main(p1_e1.kt:13)
```
## Вообще не число
### C
```
0 * 0 = 0
```
### Golang
```
0 * 0 = 0
```
### Rust
```
thread 'main' panicked at 'called `Result::unwrap()` on an `Err` value: ParseIntError { kind: InvalidDigit }', src/p1/e1/main.rs:13:41
note: run with `RUST_BACKTRACE=1` environment variable to display a backtrace
```
### Kotlin
```
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:665)
	at java.base/java.lang.Integer.parseInt(Integer.java:781)
	at P1_e1Kt.main(p1_e1.kt:13)
```
## Переполнение разрядности Int
### C
```
999999999 * 999999999 = 808348673
```
### Golang
```
999999999 * 999999999 = 999999998000000001
```
### Rust
```
thread 'main' panicked at 'attempt to multiply with overflow', src/p1/e1/main.rs:14:46
note: run with `RUST_BACKTRACE=1` environment variable to display a backtrace
```
### Kotlin
```
999999999 * 999999999 = 808348673
```
## Пустой файл
### C
```
0 * 0 = 0
```
### Golang
```
0 * 0 = 0
```
### Rust
```
thread 'main' panicked at 'called `Result::unwrap()` on an `Err` value: ParseIntError { kind: Empty }', src/p1/e1/main.rs:13:41
note: run with `RUST_BACKTRACE=1` environment variable to display a backtrace
```
### Kotlin
```
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Range [0, 0 + -1) out of bounds for length 10
	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)
	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:52)
	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:213)
	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:210)
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:98)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckFromIndexSize(Preconditions.java:118)
	at java.base/jdk.internal.util.Preconditions.checkFromIndexSize(Preconditions.java:397)
	at java.base/java.lang.String.checkBoundsOffCount(String.java:4590)
	at java.base/java.lang.String.<init>(String.java:523)
	at P1_e1Kt.main(p1_e1.kt:12)
```
