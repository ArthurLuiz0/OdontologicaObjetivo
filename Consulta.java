package OdontologiaObjetivo;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Consulta {
    private Paciente paciente;
    private LocalDateTime dataConsulta;
    private String descricao;
    private static ArrayList<Dentista> dentista;

    // Construtor
    public Consulta(Paciente paciente, ArrayList<Dentista> dentista, LocalDateTime dataConsulta, String descricao) {
        this.paciente = paciente;
        this.dentista = dentista;
        this.dataConsulta = dataConsulta;
        this.descricao = descricao;
        
    }

    // Getters e Setters
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ArrayList<Dentista> getDentista() {
        return dentista;
    }

    public void setDentista(ArrayList<Dentista> dentista) {
        this.dentista = dentista;
    }

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método para exibir informações da consulta
    @Override
    public String toString() {
        return "Consulta {" +
                "paciente=" + paciente.getNome() +
                ", dataConsulta=" + dataConsulta +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}

