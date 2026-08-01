package com.goit.module.core.other;

public class YearVariablesTask {
   public static void main(String[] args) {
       // Сумма весенних, летних и осенних месяцев: 3 + 3 + 3 = 9
       byte allMonthCountButNotWinter = 9;

       // 1996 год был високосным, поэтому в феврале было 29 дней
       short february1996DayCount = 29;

       // Весенние дни: 31 (март) + 30 (апрель) + 31 (май) = 92. Половина: 92 / 2 = 46
       int halfOfTotalSpringDayCount = 46;

       // Секунд в году: 365 дней * 24 часа * 60 минут * 60 секунд = 31,536,000
       long yearSecondCount = 31536000L;

       // Дней в мае: 31. 31 / 4 = 7.75. Округляем до 7.8
       float quarterOfMayDayCount = 7.8f;

       // Месяцы с 31 днем: январь, март, май, июль, август, октябрь, декабрь (7 месяцев).
       // 7 * 31 = 217
       double dayCountOfLongMonths = 217.0d;

       // 4-й месяц - April. 3-й символ в нижнем регистре - 'r'
       char springLetter = 'r';

       // 1900 год делится на 100, но не делится на 400, поэтому он не високосный
       boolean isLeap1900 = false;

       // --- Вывод для проверки ---
       System.out.println("allMonthCountButNotWinter = " + allMonthCountButNotWinter);
       System.out.println("february1996DayCount = " + february1996DayCount);
       System.out.println("halfOfTotalSpringDayCount = " + halfOfTotalSpringDayCount);
       System.out.println("yearSecondCount = " + yearSecondCount);
       System.out.println("quarterOfMayDayCount = " + quarterOfMayDayCount);
       System.out.println("dayCountOfLongMonths = " + dayCountOfLongMonths);
       System.out.println("springLetter = " + springLetter);
       System.out.println("isLeap1900 = " + isLeap1900);
    }
}
