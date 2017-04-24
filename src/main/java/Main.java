public class Main {
    public static int catCount = 0;

    public Main(){
        catCount = catCount + 1;
    }
    public void finalize(){
        catCount = catCount - 1;
    }

    public static void main(String[] args) {

    }
}
