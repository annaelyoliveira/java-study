## Desafio Modelagem e Diagramação de um Componente iPhone
# Objetivo 
Modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico, Navegador na Internet, Camera, Mapa

## Diagrama UML

```mermaid
classDiagram
    class ReprodutorMusical {
        tocar()
        pausar()
        selecionarMusica(String musica)
        ajustarVolume(int volume)
        reproduzirVideo()
        sincronizarComiTunes()
    }

    class AparelhoTelefonico {
        ligar(String numero)
        atender()
        iniciarCorreioVoz()
        desligar()
        mutar()
        ColocarEmEspera()
        acessaListaDeContatos()
        enviarMensagemDeTexto(String contato, String mensagem)
    }

    class NavegadorInternet {
        navegarViaSafari()
        exibirPagina(String url)
        adicionarNovaAba()
        atualizarPagina()
    }
    class OutrasFuncionalidades {
        enviarEmail(String MensagemEmail)
        fazerNotas (String nota)
        gerenciarCalendarioELembretes()
    }
    class Camera {
        abrirCamera()
        tirarFoto()
        fazerVideo()
        abrirGalera()
    }
    class Mapa {
        abrirMapa()
        buscarEndereco(String endereco)
    }
    
class iPhone {

    }
    

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
    iPhone --> OutrasFuncionalidades
    iPhone --> Camera
    iPhone --> Mapa
```

### Implementação em Java está na pasta SRC
