import br.com.agendacontatos.Contato;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Contato> listaContato = new ArrayList<Contato>();
        Contato contato1 = new Contato();
        contato1.setNome("Adriana");
        contato1.setNumero(19892988);
        listaContato.add(contato1);
    }
}