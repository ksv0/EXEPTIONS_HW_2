package ksv.task4;

import ksv.view.ConsoleView;
import ksv.view.View;

public class ServicesTaskTwo {
    View view = new ConsoleView();

    String input() throws EmptyStringException {
        String str = view.get();
        if (str.trim().equals("")){
            throw new EmptyStringException("Пустая строка либо заполнена пробелами");
        }
        return str;
    }

}
