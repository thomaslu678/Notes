public class Main {
    public void callSelf(){
        System.out.println("test");
        callSelf();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.callSelf();
    }
}