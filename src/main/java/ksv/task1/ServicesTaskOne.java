package ksv.task1;

import ksv.view.ConsoleView;
import ksv.view.View;

public class ServicesTaskOne {
    View view;

    public ServicesTaskOne() {
        this.view = new ConsoleView();
    }


    public Float inputFloat(String message) {
        float res;
        if (!message.equals("")) {
            view.set(message);
        }
        try {
            return Float.parseFloat(view.get());
        } catch (NumberFormatException e) {
            view.set(e.toString());
            throw new RuntimeException();
        }
    }

    public float inputFloat() {
        return inputFloat("");
    }
}
