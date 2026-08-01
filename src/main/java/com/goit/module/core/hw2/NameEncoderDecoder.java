package com.goit.module.core.hw2;

public class NameEncoderDecoder {
    // Константи для префікса та суфікса, щоб не дублювати їх у коді
    private static final String PREFIX = "NOTFORYOU";
    private static final String SUFFIX = "YESNOTFORYOU";

    public String encode(String name) {
        if (name == null) return null;

        // 1. Замінюємо голосні на цифри
        // Метод replace() замінює всі входження підрядка
        String encrypted = name.replace('e', '1')
                .replace('u', '2')
                .replace('i', '3')
                .replace('o', '4')
                .replace('a', '5');

        // 2. Додаємо префікс та суфікс
        return PREFIX + encrypted + SUFFIX;
    }

    public String decode(String name) {
        if (name == null) return null;

        // 1. Видаляємо префікс та суфікс за допомогою substring
        int startIndex = PREFIX.length();
        int endIndex = name.length() - SUFFIX.length();

        String middlePart = name.substring(startIndex, endIndex);

        // 2. Замінюємо цифри назад на голосні
        return middlePart.replace('1', 'e')
                .replace('2', 'u')
                .replace('3', 'i')
                .replace('4', 'o')
                .replace('5', 'a');
    }

    public static void main(String[] args) {
        NameEncoderDecoder converter = new NameEncoderDecoder();

        // Тест 1: Звичайне ім'я
        System.out.println("Test encode 'Crab': " + converter.encode("Crab"));
        // Очікуємо: NOTFORYOUCr5bYESNOTFORYOU
        System.out.println("Test decode:       " + converter.decode("NOTFORYOUCr5bYESNOTFORYOU"));
        // Очікуємо: Crab

        // Тест 2: Складне ім'я (з літерами, що самі по собі схожі на частини префіксів)
        System.out.println("Test decode complex: " + converter.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU"));
        // Очікуємо: NOTFORYOU

        // Тест 3: Ім'я без голосних (не повинно змінитися, крім префіксів)
        System.out.println("Test 'Sky': " + converter.encode("Sky"));
        // Очікуємо: NOTFORYUSkyYESNOTFORYOU
    }
}
