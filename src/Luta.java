import java.util.Objects;
import java.util.Random;

import static java.lang.Math.random;

public class Luta {

    private double vencedor;
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {

        if (Objects.equals(l1.getCategoria(), l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
            System.out.println("====================");
            System.out.println("Luta Agendada! " + this.desafiante.getNome() + " VS " + this.desafiado.getNome());
            System.out.println("====================");
        }
        else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
            System.out.println("Impossível agendar luta.");
        }

    }
    public void lutar() {
        if (getAprovada()) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();

            Random random = new Random();
            int vencedor = random.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("EMPATE");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("VITÓRIA DE: " + getDesafiado().getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("VITÓRIA DE: " + getDesafiante().getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }



        }
        else {
            System.out.println("Esta luta não poderá acontecer.");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
