public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        Author author1 = new Author("Mogens");
        PrintedBook book1 = new PrintedBook("Børnehjemmet", "SKØN", 3, 100);
        PrintedBook book2 = new PrintedBook("Bjarnes tænder", "BI", 10, 68);
        AudioBook book3 = new AudioBook("Java for Beginners", "FAG", 10, 256);

        author1.addTitle(book1);
        author1.addTitle(book2);
        author1.addTitle(book3);

        System.out.printf(author1.getName() + ": " + "%.2f" + "kr", author1.calculateRoyalties());

    }
}
