# Вступление
Серверная сторона ассистента с использованием Google Bard AI на основе фреймворка Spring.
Клиентская часть: https://github.com/CommonPrint/bard-ai-assistant-client/tree/main

# Инструкция
1. Для запуска проекта нужно перейти на официальный сайт https://bard.google.com/
2. Зарегистрировать аккаунт
3. После регистрации аккаунта, нажать на кнопку "F12" (панель разработчика), перейти в раздел "Приложение", затем выбрать раздел "Cookie" и скопировать значение токена __Secure-1PSID
4. Значение скопированного токена вставить в значение свойства "ai.google-bard.token", которое расположено в файле "application.properties".

# Требования
- Не использовать VPN, т.к. API сервиса Google Bard AI находится в процессе разработки
- Задавать вопросы ассистенту только на английском языке, т.к. на других языках не понимает
# Эндпоинт
- http://localhost:{порт_приложения}/google-bard/ask?q={ваш_вопрос}
