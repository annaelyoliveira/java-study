interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
    void desligar();
    void mutar();
    void colocarEmEspera();
    void acessarListaDeContatos();
    void enviarMensagemDeTexto(String contato, String mensagem);
}

interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
    void ajustarVolume(int volume);
    void reproduzirVideo();
    void sincronizarComiTunes();
}

// Interface NavegadorInternet
interface NavegadorInternet {
    void navegarViaSafari();
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

// Interface ControleVolume
interface OutrasFuncionalidades {
    void enviarEmail(String MensagemEmail);
    void fazerNotas (String nota);
    void gerenciarCalendarioELembretes();
}


interface Camera {
    void abrirCamera();
    void tirarFoto();
    void fazerVideo();
    void abrirGaleria();
}


interface Maps {
    void abrirMapa();
    void buscarEndereco(String endereco);
}

class iPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet, OutrasFuncionalidades, Camera, Maps {

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o telefone");
    }

    @Override
    public void mutar() {
        System.out.println("Mudando para o modo mudo");
    }

    @Override
    public void colocarEmEspera() {
        System.out.println("Colocando em espera");
    }

    @Override
    public void acessarListaDeContatos() {
        System.out.println("Acessando lista de contatos");
    }

    @Override
    public void enviarMensagemDeTexto(String contato, String mensagem) {
        System.out.println("Enviando mensagem para " + contato + ": " + mensagem);
    }

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ajustarVolume(int volume) {
        System.out.println("Ajustando volume para " + volume);
    }

    @Override
    public void reproduzirVideo() {
        System.out.println("Reproduzindo vídeo");
    }

    @Override
    public void sincronizarComiTunes() {
        System.out.println("Sincronizando com iTunes");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void navegarViaSafari() {
        System.out.println("Navegando via Safari");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    // Implementação dos métodos da interface OutrasFuncionalidades
    @Override
    public void enviarEmail(String mensagemEmail) {
        System.out.println("Enviando email: " + mensagemEmail);
    }

    @Override
    public void fazerNotas(String nota) {
        System.out.println("Fazendo anotação: " + nota);
    }

    @Override
    public void gerenciarCalendarioELembretes() {
        System.out.println("Gerenciando calendário e lembretes");
    }

    // Implementação dos métodos da interface Camera
    @Override
    public void abrirCamera() {
        System.out.println("Abrindo câmera");
    }

    @Override
    public void tirarFoto() {
        System.out.println("Tirando foto");
    }

    @Override
    public void fazerVideo() {
        System.out.println("Fazendo vídeo");
    }

    @Override
    public void abrirGaleria() {
        System.out.println("Abrindo galeria de fotos e vídeos");
    }

    // Implementação dos métodos da interface Maps
    @Override
    public void abrirMapa() {
        System.out.println("Abrindo aplicativo de mapas");
    }

    @Override
    public void buscarEndereco(String endereco) {
        System.out.println("Buscando endereço: " + endereco);
    }
}

// Exemplo de uso do iPhone com as funcionalidades implementadas
public class iPhoneDesafio {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        // Exemplo de uso das funcionalidades
        iphone.ligar("987654321");
        iphone.atender();
        iphone.selecionarMusica("Stairway to Heaven - Led Zeppelin");
        iphone.tocar();
        iphone.ajustarVolume(50);
        iphone.abrirCamera();
        iphone.tirarFoto();
        iphone.enviarEmail("Olá! Estou enviando este email do meu iPhone.");
        iphone.abrirMapa();
        iphone.buscarEndereco("Rua Albino Coronel, N 185, Brasil, Monteiro-PB");
    }
}
