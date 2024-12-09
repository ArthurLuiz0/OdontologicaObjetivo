package OdontologiaObjetivo;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PacienteRepository {
    private List<Paciente> pacientes;

    // Construtor
    public PacienteRepository() {
        this.pacientes = new ArrayList<>();
    }

    // Create: Adicionar um novo paciente
    public void adicionar(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente adicionado: " + paciente.getNome());
    }

    // Read: Obter todos os pacientes
    public List<Paciente> listarTodos() {
        return new ArrayList<>(pacientes);
    }

    // Read: Buscar paciente por CPF
    public Optional<Paciente> buscarPorCpf(String cpf) {
        return pacientes.stream()
                .filter(paciente -> paciente.getCpf().equals(cpf))
                .findFirst();
    }

    // Update: Atualizar os dados de um paciente
    public boolean atualizar(String cpf, Paciente pacienteAtualizado) {
        Optional<Paciente> pacienteOptional = buscarPorCpf(cpf);
        if (pacienteOptional.isPresent()) {
            Paciente pacienteExistente = pacienteOptional.get();
            pacienteExistente.setNome(pacienteAtualizado.getNome());
            pacienteExistente.setTelefone(pacienteAtualizado.getTelefone());
            pacienteExistente.setEmail(pacienteAtualizado.getEmail());
            pacienteExistente.setEndereco(pacienteAtualizado.getEndereco());
            pacienteExistente.setDataNascimento(pacienteAtualizado.getDataNascimento());
            System.out.println("Paciente atualizado: " + pacienteExistente.getNome());
            return true;
        }
        System.out.println("Paciente não encontrado com o CPF: " + cpf);
        return false;
    }

    // Delete: Remover um paciente por CPF
    public boolean remover(String cpf) {
        Optional<Paciente> pacienteOptional = buscarPorCpf(cpf);
        if (pacienteOptional.isPresent()) {
            pacientes.remove(pacienteOptional.get());
            System.out.println("Paciente removido com sucesso.");
            return true;
        }
        System.out.println("Paciente não encontrado com o CPF: " + cpf);
        return false;
    }
}