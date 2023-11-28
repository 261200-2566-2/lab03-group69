public class Main {
    public static void main(String[] args) {
        character demon = new character("demon");
        demon.ShowStat();
        demon.Levelup();
        demon.ShowStat();
        demon.Levelup();
        demon.ShowStat();
        demon.Attacked(25.0);
        demon.ShowStat();
        demon.Attacked(-10);
    }
}