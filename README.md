# AutoClosableDemo

AutoClosableDemo - это Spring Boot приложение, демонстрирующее работу с AutoClosable в Java.

## 📌 Требования
- Java 21
- Maven 3+
- Spring Boot 2.7+

## 📦 Установка и запуск

### Клонирование репозитория
```sh
git clone <репозиторий>
cd AutoClosableDemo
```

### Сборка проекта
```sh
mvn clean install
```

### Запуск приложения
```sh
mvn spring-boot:run
```

## 📁 Структура проекта
```
AutoClosableDemo/
│── src/main/java/uz/nodir/autoclosabledemo/
│   ├── AutoClosableDemoApplication.java  # Главный класс приложения
│   ├── configuration/
│   │   └── RestTemplateConfig.java  # Конфигурация RestTemplate
│   ├── endpoint/
│   │   └── OrderTestController.java  # Контроллер для тестирования заказов
│   ├── model/
│   │   ├── domain/Transaction.java  # Модель транзакции
│   │   ├── enums/Status.java  # Перечисление статусов
│   │   ├── transaction/request/TransactionCheckRequest.java  # Запрос на проверку транзакции
│   │   └── transaction/response/TransactionCheckResponse.java  # Ответ на проверку транзакции
│   ├── service/
│   │   ├── business/
│   │   │   ├── OrderFinishService.java  # Сервис для завершения заказов
│   │   │   ├── TransactionManager.java  # Менеджер транзакций
│   │   │   ├── impl/OrderFinishServiceImpl.java  # Реализация OrderFinishService
│   │   ├── core/
│   │   │   ├── OrderDAO.java  # DAO для работы с заказами
│   │   │   └── impl/OrderDAOImpl.java  # Реализация OrderDAO
│── application.yml  # Конфигурация приложения
│── pom.xml  # Maven зависимости
```


## 🛠 Технологии
- Java 21
- Spring Boot
- Maven

