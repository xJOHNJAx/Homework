package HashMap;

import java.util.HashMap;
import java.util.Map;

public class AlarmCodes {

    private final Map<String, String> alarmCodeMap;

    public AlarmCodes() {
        alarmCodeMap = new HashMap<>();
        initializeAlarmCodes();
    }

    private void initializeAlarmCodes() {
// Здесь мы инициализируем карту сигнализаций с кодами и их значениями
        alarmCodeMap.put("100", "Пожарная сигнализация");
        alarmCodeMap.put("200", "Сигнализация о взломе");
        alarmCodeMap.put("300", "Техническая сигнализация");
// Добавьте другие коды и их значения по мере необходимости
    }

    public String getAlarmDescription(String code) {
// Получаем описание сигнализации по её коду
        return alarmCodeMap.getOrDefault(code, "Неизвестный код сигнализации");
    }

    public static void main(String[] args) {
        AlarmCodes alarmCodes = new AlarmCodes();

// Пример получения описания сигнализации по коду
        String alarmDescription = alarmCodes.getAlarmDescription("400");
        System.out.println("Описание сигнализации для кода 400: " + alarmDescription);
    }
}
