package ksv.task1;


public class MainHere {
    public static void main(String[] args) {
        ServicesTaskOne p = new ServicesTaskOne();
        Float someVariable = null;
        boolean flag= true;
        while (flag){
            try {
                someVariable = p.inputFloat("Введи число с плавающей точкой");
                flag = false;
            } catch (RuntimeException e) {
            }
        }
        p.view.set(someVariable.toString());
    }
}
