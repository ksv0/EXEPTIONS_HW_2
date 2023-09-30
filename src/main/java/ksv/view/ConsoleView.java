package ksv.view;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner in;
    public ConsoleView(Scanner in) {
        this.in = in;
    }

    public ConsoleView() {
        this.in = new Scanner(System.in);
    }

    @Override
    public String get() {
        return in.nextLine();
    }

    @Override
    public void set(String message) {
        System.out.println(message);
    }
}
