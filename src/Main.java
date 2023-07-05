public class Main {
    public static void main(String[] args) {

       Lutador l[] = new Lutador[6];

       l[1] = new Lutador("Pretty Boy", " França", 31, 1.76, 68,5, 11, 2);

       l[2] = new Lutador("Putscript", "Brasil", 22, 1.80, 68.2, 10, 4, 2);



        Luta UEC = new Luta();
        UEC.marcarLuta(l[1], l[2]);
        UEC.lutar();



    }
}