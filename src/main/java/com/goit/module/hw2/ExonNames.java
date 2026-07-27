package com.goit.module.hw2;

public class ExonNames {

    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLuckyPro(String name) {
        if (name == null) return false;

        // Переводимо все в нижній регістр і шукаємо лише 'a' та 'o'
        String lowerName = name.toLowerCase();
        return lowerName.contains("a") || lowerName.contains("o");
    }

    public String getNameCode(String name){
        // 1. Отримуємо перший символ за індексом 0
        char firstChar = name.charAt(0);

        // 2. Перевіряємо довжину рядка, щоб обробити випадок з одним символом
        if (name.length() == 1) {
            // Якщо символ один, повертаємо його у верхньому регістрі
            return String.valueOf(firstChar).toUpperCase();
        } else {
            // Якщо символів більше одного, отримуємо останній за індексом length - 1
            char lastChar = name.charAt(name.length() - 1);

            // Створюємо рядок з двох символів та переводимо у верхній регістр
            return ("" + firstChar + lastChar).toUpperCase(); // Конкатенація з порожнім рядком робить результат String
        }
    }

    public boolean isMoneyName(String name) {
        // 1. Перевірка на null або порожній рядок (захист від помилок)
        if (name == null || name.isEmpty()) {
            return false;
        }

        // 2. Отримуємо перший символ
        char firstChar = name.charAt(0);

        // 3. Отримуємо останній символ
        char lastChar = name.charAt(name.length() - 1);

        // 4. Перевіряємо, чи є обидва символи цифрами (використовуємо підказку з умови)
        boolean isFirstDigit = firstChar >= '0' && firstChar <= '9';
        boolean isLastDigit = lastChar >= '0' && lastChar <= '9';

        // Повертаємо true тільки якщо ОБИДВІ умови справджуються (логічне І)
        return isFirstDigit && isLastDigit;
    }

    public boolean isInvisibleName(String name) {
        // 1. Проходимо по кожному символу рядка
        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);

            // 2. Перевіряємо, чи є символ "видимим"
            // Якщо це НЕ пробіл І НЕ перенос рядка І НЕ табуляція
            if (currentChar != ' ' && currentChar != '\n' && currentChar != '\t') {
                // Ми знайшли видимий символ! Ім'я не є невидимим.
                return false;
            }
        }

        // 3. Якщо ми пройшли весь цикл і не знайшли жодного видимого символу,
        // значить рядок або порожній, або складається тільки з пробілів/табів.
        return true;
    }

    public String makeNamePositive(String name) {
        if (name == null) return null;

        // Регулярний вираз "(?i)no":
        // (?i) — це прапорець, який каже: "ігноруй регістр" (case-insensitive).
        // no — сам шаблон, який ми шукаємо.
        return name.replaceAll("(?i)no", "yes");
    }

    public String makeNameClean(String name) {

        if (name == null) {
            return "CLEANnullCLEAN";
        }

        String cleanedName = name.trim();

        return "CLEAN" + cleanedName + "CLEAN";
    }

    public String makeHalfOfName(String name) {
        if (name == null) {
            return "";
        }

        int length = name.length();

        // Знаходимо індекс кінця підрядка.
        // Завдяки цілочисельному діленню (int / int).
        // Наприклад: 9 / 2 = 4.
        int halfLength = length / 2;

        // Використовуємо substring(start, end).
        // endIndex у методі substring НЕ включається в результат.
        return name.substring(0, halfLength);
    }

    public static void main(String[] args) {
        ExonNames names = new ExonNames();

        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);
        System.out.println("names.areNamesEqual(\"gork\", \"Maxon\") = " + names.areNamesEqual("gork", "Maxon"));

        //Should be "exor BIGO"
        String fullName = names.makeFullName("exor", "bigo");
        System.out.println("names.makeFullName(\"exor\", \"bigo\") = " + fullName);
        System.out.println("Test 'Exma': " + names.isNameLuckyPro("Exma"));   // true (є 'a')
        System.out.println("Test 'Igun': " + names.isNameLuckyPro("Igun"));   // false
        System.out.println("Test 'Oxy':  " + names.isNameLuckyPro("Oxy"));    // true (є 'O')
        System.out.println("Test 'sky':  " + names.isNameLuckyPro("sky"));    // false

        //Should be BA
        String nameCode = names.getNameCode("boRA");
        System.out.println("names.getNameCode(\"boRA\") = " + nameCode);

        //Should be true
        boolean isMoneyName = names.isMoneyName("31Boss31");
        System.out.println("names.isMoneyName(\"31Boss31\") = " + isMoneyName);

        System.out.println("Test '':      " + names.isInvisibleName(""));          // true
        System.out.println("Test '\\n':    " + names.isInvisibleName("\n"));       // true
        System.out.println("Test '\\nMiag ': " + names.isInvisibleName("\nMiag ")); // false

        //Should be YesMont
        String positive = names.makeNamePositive("NoMont");
        System.out.println("names.makeNamePositive(\"NoMont\") = " + positive);
        String positive2 = names.makeNamePositive("Henot");
        System.out.println("names.makeNamePositive(\"Henot\") = " + positive2);
        String positive3 = names.makeNamePositive("Berul");
        System.out.println("names.makeNamePositive(\"Berul\") = " + positive3);

        // Тести згідно з прикладами
        System.out.println("Test 'bigar':   " + names.makeNameClean("bigar"));      // CLEANbigarCLEAN
        System.out.println("Test ' ytuki':  " + names.makeNameClean(" ytuki"));     // CLEANytukiCLEAN
        System.out.println("Test ' bur\\n': " + names.makeNameClean(" bur\n"));    // CLEANburCLEAN

        // Тести згідно з прикладами
        System.out.println("Test 'Magicoraxi': " + names.makeHalfOfName("Magicoraxi")); // Очікуємо Magic
        System.out.println("Test 'Javametro':  " + names.makeHalfOfName("Javametro"));  // Очікуємо Java
    }
}
