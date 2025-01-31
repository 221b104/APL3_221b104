public class Main {
    public static void main(String[] args) {
        Voice voice = new Voice();
        voice.templateMethod(); // Executes in the correct order (prepareVoice -> hear)

        System.out.println("---");

        Voice2 voice2 = new Voice2();
        voice2.templateMethod(); // Executes in the correct order (prepareVoice -> hear)
    }
}
