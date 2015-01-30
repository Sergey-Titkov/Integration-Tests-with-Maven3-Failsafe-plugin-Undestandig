# Integration-Tests-with-Maven3-Failsafe-plugin-Undestandig
Разбираюсь как писать интеграционные тесты с использованием maven и Failsafe плугина

Попытка посчитать покрытие кода тестами с помощью Clover.
Как настроить: https://confluence.atlassian.com/display/CLOVER/Clover-for-Maven+2+and+3+Quick+Start+Guide
Как запустить: mvn clean clover2:setup test clover2:aggregate clover2:clover
Да считает, но хочет денег и много. И почему то игнорирует интеграционные тесты.

Попытка получить результаты покрытия в SonarQube провалились.
mvn clean clover2:setup test clover2:aggregate clover2:clover
mvn sonar:sonar

В логе ошибка:
[INFO] [21:58:59.751] Findbugs output report: C:\GIT_REPO\Integration-Tests-with-Maven3-Failsafe-plugin-Undestandig\integration-test-with-unit-tests\target\sonar\findbugs-result.xml
The following classes needed for analysis were missing:
  com_atlassian_clover.TestNameSniffer
  com_atlassian_clover.CoverageRecorder
[INFO] [21:59:01.649] Execute Findbugs 3.0.0 done: 3427 ms

Данных в сонаре нет.
Дальше копать пока не буду, нет на это время.

