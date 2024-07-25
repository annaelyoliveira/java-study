import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {

    private String tipo;
    private double valor;
    private LocalDateTime data;

    public Transacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = LocalDateTime.now();
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f em %s", tipo, valor, getData());
    }
}
