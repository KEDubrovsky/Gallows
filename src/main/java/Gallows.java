public class Gallows {
    public static void print(int errorCount) {
        System.out.println("╔ ═ ═ ═ ═ ═ ═ ═");
        System.out.println("║" + (errorCount > 0 ? "           │" : ""));
        System.out.println("║" + (errorCount > 1 ? "           ◯" : ""));
        System.out.println("║" + (errorCount > 2 ? "          /" : "") + (errorCount > 3 ? "│" : "") + (errorCount > 4 ? "\\" : ""));
        System.out.println("║" + (errorCount > 5 ? "          /" : "") + (errorCount > 6 ? " \\" : ""));
        System.out.println("║");
        System.out.println("║");
        System.out.println("╚═ ═ ═ ═ ═ ═ ═ ═ ");
    }
}
