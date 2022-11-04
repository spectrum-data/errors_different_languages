# Материалы к видео по обработке ошибок в программном коде

## Часть первая. Понятие об ошибках в разных языках

Рассмотрим на примере простой консольной программы.

Назовем ее `sqr`

Приложение получает на вход имя файла,
считывает из него одно число в строковом формате, пробразует к 32 битному `int`
и выводит строку с квадратом вида `5 * 5 = 25`.

Также считаем, что число занимает не больше 10 символов и больше из файла не читаем

Сначала реализуем самый наивный вариант этого приложения на Kotlin, C, Golang, Rust
и посмотрим что из этого выйдет.

Наивный вариант - это тот, в котором мы даже не предполагаем что какие-то ошибки
или проблемы могут существовать.