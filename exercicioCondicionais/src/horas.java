import java.util.Scanner;

public class horas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, horasJogadas;

        System.out.println("Que horas o jogo começou e terminou?");
        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaFinal > horaInicial){
            horasJogadas = horaFinal - horaInicial;
        } else {
            horasJogadas = 24 - horaInicial + horaFinal;
        }
        System.out.println("O tempo de jogo foi: " + horasJogadas);
    }
}