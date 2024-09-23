package Exercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;

public class Calendario {

	private HashSet<LocalDate> feriados;

    public Calendario() {
        feriados = new HashSet<>();
        feriados.add(LocalDate.of(LocalDate.now().getYear(), 1, 1)); 
        feriados.add(LocalDate.of(LocalDate.now().getYear(), 12, 25)); 
    }

    public void adicionarFeriado(int dia, int mes) {
        feriados.add(LocalDate.of(LocalDate.now().getYear(), mes, dia));
        System.out.println("Feriado adicionado com sucesso!");
    }

    public boolean verificarFeriado(int dia, int mes) {
        LocalDate data = LocalDate.of(LocalDate.now().getYear(), mes, dia);
        return feriados.contains(data);
    }

    public void exibirCalendario(int mes, int ano) {
        YearMonth anoMes = YearMonth.of(ano, mes);
        LocalDate primeiroDia = anoMes.atDay(1);
        int diasNoMes = anoMes.lengthOfMonth();

        System.out.println("\nCalendário de " + anoMes.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()) + " " + ano + ":");
        System.out.println("Dom Seg Ter Qua Qui Sex Sab");

        int diaDaSemana = primeiroDia.getDayOfWeek().getValue();
        for (int i = 1; i < diaDaSemana; i++) {
            System.out.print("    ");
        }

        for (int dia = 1; dia <= diasNoMes; dia++) {
            System.out.printf("%3d ", dia);
            if ((dia + diaDaSemana - 1) % 7 == 0) {
                System.out.println(); 
            }
        }
        System.out.println();
    }
    
    public long diferencaEntreDatas(LocalDate data1, LocalDate data2) {
        return ChronoUnit.DAYS.between(data1, data2);
    }
}
