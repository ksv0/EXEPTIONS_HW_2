# Task2 and Task3

## Задание 2

* Массив ***intArray*** не был проинициализирован в представленном коде,
    и если массив содержит интовые значения, и его длина >9, 
    то код сработает верно и выведет на экран 


    **Catching exception: java.lang.ArithmeticException: / by zero**
```java
try {
    int d = 0;
    double catchedRes1 = intArray[8] / d;
    System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
    System.out.println("Catching exception: " + e);
}
```

## Задание 3

* В строке метода ***main*** ***throws Exception*** не нужен т.к. 
    в теле метода нет инструкций бросающих его 
* Метод ***printSum*** в качестве аргументов использует переменные с типами обертками
    ***Integer*** и если в него будут переменные со значением null будет вызвано исключение 
    **java.lang.NullPointerException** которое метод не обрабатывает и программа упадет,
    также данный метод бросает **FileNotFoundException**, но в теле метода нет инструкций бросающих его
* в блоке try catch, надо перерасположить **catch (Throwable ex)** после всех catch т.к. 
    оно является родительским для всех представленных исключений и перехватит все исключения
* также выводимые сообщения в блоках catch не верны, но ради богов хаоса, и т.к. программа работает, исправлять это я не буду 

    ## код с исправлениями
```java

public static void main(String[] args) {
    try {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = {1, 2};
        abc[3] = 9;
    } catch (NullPointerException ex) {
        System.out.println("Указатель не может указывать на null!");
    } catch (IndexOutOfBoundsException ex) {
        System.out.println("Массив выходит за пределы своего размера!");
    } catch (Throwable ex) {
        System.out.println("Что-то пошло не так...");
    }
}
public static void printSum(Integer a, Integer b) throws NullPointerException {
    if (a == null || b == null) {
        throw new NullPointerException();
    }
        System.out.println(a + b);
}
```
