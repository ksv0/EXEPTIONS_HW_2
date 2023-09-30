package ksv.task4;

public class ProgramTaskFour {
    public static void main(String[] args) {
        ServicesTaskTwo p = new ServicesTaskTwo();
        try{
            p.view.set(p.input());
        } catch (EmptyStringException e) {
            p.view.set(e.getMessage());
            p.view.set("Пустые строки вводить нельзя");
        }
    }
}
