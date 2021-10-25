# Система управления рисками

Приложение разработано в рамках хакатона "Анализ и оценка рисковых сервисов"

## Требования для запуска проекта
Для запуска проекта требуются предварительно установленные:
1) Java 11
2) Node 12  

Тестирование проводилось именно с этими версиями

## Инструкция по запуску проекта
1) Перейдите в папку ```client/src/main/ts/client```
2) Запустите в теримнале команду ```npm install```
3) Запустите в терминале команду ```npm run build```
4) Удалите содержимое папки```server/src/main/resources/static``` 
5) Скопируйте папку ```client/src/main/ts/client/dist``` в папку ```server/src/main/resources/static``` 
6) Откройте проект в Idea и нажмите на зелёный треугольник рядом с методом main в классе ```server/src/main/java/hack/server/Application```
7) Откройте браузер и перейдите по адресу localhost:8080