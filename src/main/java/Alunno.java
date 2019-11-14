
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tss
 */
public class Alunno {

   private String cognome;
    private String nome;
    private int voto;
    private LocalDateTime datanascita = LocalDateTime.now();
   private String segnoZodiacale;
    
      public Alunno(String cognome, String nome, int voto) {
        this.cognome = cognome;
        this.nome = nome;
        this.voto = voto;
        datanascita = LocalDateTime.now();
        
    }
    
    public Alunno(String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
       datanascita = LocalDateTime.now();
    }

    public Alunno() {

        cognome = "";
        nome = "";
        datanascita = LocalDateTime.now();
        segnoZodiacale = "pesci";
        int anno = datanascita.getYear();
        if (anno == 2018) {
            segnoZodiacale = "drago";
        }
        if (anno == 2019) {
            segnoZodiacale = "Serpente";
        }
        if (anno == 2020) {
            segnoZodiacale = "topo";
        }
        //costruttore metodo con stessa  nome classe

    }

    //costruttore
    public Alunno(String cognome) {
        String okcognome;

        if (cognome.length() > 50) {
            okcognome = cognome.substring(0, 50);
        } else {
            okcognome = cognome;
        }
        okcognome = okcognome.toUpperCase();

        this.cognome = okcognome;
        nome = "";
        datanascita = LocalDateTime.now();
        segnoZodiacale = "pesci";
        int anno = datanascita.getYear();
        if (anno == 2018) {
            segnoZodiacale = "drago";
        }
        if (anno == 2019) {
            segnoZodiacale = "Serpente";
        }
        if (anno == 2020) {
            segnoZodiacale = "topo";
        }
        //costruttore metodo con stessa  nome classe

    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public String getSegnoZodiacale() {
        return segnoZodiacale;
    }

    public void setSegnoZodiacale(String segnoZodiacale) {
        this.segnoZodiacale = segnoZodiacale;
    }

    //metodo pubblico per farla vedere ma non per modificarla
    public LocalDateTime getDatanascita() {
        return datanascita;
    }

    public String getPresentazione() {
        String frase;
        frase = "mi chiamo" + cognome + "" + nome;
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");//ww3school
        String formattedDate = datanascita.format(myFormatObj);
        frase += " e sono nato il " + datanascita.toString();

        //sistemo la data
        return frase;

    }

}
