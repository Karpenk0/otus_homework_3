import java.util.Scanner;

public class homework_3 {

    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;

        // Ниже вместо null надо написать реализацию,
        // написано так, чтобы просто компилировалось
        String[] questions = new String[5];
        questions[0] = "В файл с каким расширением компилируется java-файл?";
        questions[1] = "С помощью какой команды git можно получить полную копию удаленного репозитория?";
        questions[2] = "Какой применяется цикл, когда не известно количество итераций?";
        questions[3] = "На какие группы делятся типы данных в языке Java?";
        questions[4] = "Для массивов в Java верно";


        String[][] answerOptions = new String[5][];
        answerOptions[0] = new String[4];
        answerOptions[0][0] = "1. cs";
        answerOptions[0][1] = "2. java";
        answerOptions[0][2] = "3. class";
        answerOptions[0][3] = "4. exe";
        answerOptions[1] = new String[4];
        answerOptions[1][0] = "1. commit";
        answerOptions[1][1] = "2. push";
        answerOptions[1][2] = "3. clone";
        answerOptions[1][3] = "4. copy";
        answerOptions[2] = new String[3];
        answerOptions[2][0] = "1. while";
        answerOptions[2][1] = "2. for";
        answerOptions[2][2] = "3. loop";
        answerOptions[3] = new String[5];
        answerOptions[3][0] = "1. Ссылочные (объектные)";
        answerOptions[3][1] = "2. Примитивные";
        answerOptions[3][2] = "3. Примитивные, ссылочные (объектные)";
        answerOptions[3][3] = "4. Переменные, постоянные";
        answerOptions[3][4] = "5. Переменные, примитивные";
        answerOptions[4] = new String[4];
        answerOptions[4][0] = "1. Изменяемый состав элементов разных типов";
        answerOptions[4][1] = "2. Фиксированное количество элементов одного типа";
        answerOptions[4][2] = "3. Изменяемый состав элементов одного типа";
        answerOptions[4][3] = "4. Фиксированное количество элементов разных типов";


        int[] correctAnswers = new int[5];
        correctAnswers[0] = 2;
        correctAnswers[1] = 3;
        correctAnswers[2] = 1;
        correctAnswers[3] = 3;
        correctAnswers[4] = 2;

        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < answerOptions[i].length; j++) {
                System.out.println(answerOptions[i][j]);

            }

            System.out.print("Ваш ответ: ");
            int userAnswer;
            // цикл проверки правильности ввода
                while(true) {
                    if (sc.hasNextInt()) {
                        int input = sc.nextInt();
                        if (input < answerOptions[i].length && input > 0) {
                            userAnswer = input;
                            break;

                        } else {
                            userAnswer = -1;
                            System.out.println("Вы ввели не допустимое число\n"+ "Введите число от " + 1 + " до "+ answerOptions[i].length);
                        }
                    } else {
                        userAnswer = -1;
                        System.out.println("Вы ввели не число \n"  + "Введите число от " + 1 + " до "+ answerOptions[i].length);
                        sc.next();
                    }
                        }



            if (userAnswer == correctAnswers[i]) {
                System.out.println("Верно: " + correctAnswers[i]);
                correctCount++;
            } else {
                System.out.println("Не верно , правильный ответ " + correctAnswers[i]);
                wrongCount++;
            }


            // а также увеличиваем счетчики правильных и неправильных ответов

            System.out.println();
        }

        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}


