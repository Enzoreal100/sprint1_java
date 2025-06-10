package br.com.fiap.bean.funcionario;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe FuncionarioService gerencia as operações relacionadas aos funcionários.
 * Isso inclui a mockagem inicial de dados de funcionários e a verificação de existência de funcionários.
 */
public class FuncionarioService {
    /**
     * Uma lista para armazenar os objetos Funcionario.
     */
    private List<Funcionario> funcionarios;

    /**
     * Construtor protegido da classe FuncionarioService.
     * Inicializa a lista de funcionários e a preenche com dados mockados de exemplo.
     * Este construtor é protegido, o que significa que só pode ser acessado por classes no mesmo pacote
     * ou por subclasses.
     */
    protected FuncionarioService() {
        this.funcionarios = new ArrayList<>();

        // mockando funcionários na tabela
        Funcionario func1 = new Funcionario();
        func1.setNome("Astrogildo Silva");
        func1.setRegistro("REG001");
        this.funcionarios.add(func1);

        Funcionario func2 = new Funcionario();
        func2.setNome("Rosevaldo Oliveira");
        func2.setRegistro("REG002");
        this.funcionarios.add(func2);

        Funcionario func3 = new Funcionario();
        func3.setNome("Domênico Santos");
        func3.setRegistro("REG003");
        this.funcionarios.add(func3);
    }

    /**
     * Verifica se um funcionário com um determinado registro já existe na lista.
     *
     * @param registro O registro do funcionário a ser verificado.
     * @return O registro do funcionário se encontrado; caso contrário, imprime uma mensagem
     * no console indicando que o usuário não foi encontrado e retorna null.
     */
    public Funcionario checkarFuncionarioExistente (String registro){
        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario.getRegistro().equals(registro)) {
                return funcionario;
            }
        }
        System.out.println("Usuário de registro " + registro + "não encontrado!");
        return null;
    }

    /**
     * Registra um novo funcionário na lista, após validar o nome e o registro.
     *
     * @param nome O nome do funcionário a ser registrado. Deve ter mais de 2 caracteres.
     * @param registro O registro do funcionário a ser registrado. Deve ter mais de 2 caracteres.
     * @throws Error Se o nome ou o registro tiverem 2 ou menos caracteres.
     * Nota: O uso de 'Error' para validação de negócio não é uma prática recomendada.
     * É preferível usar exceções como `IllegalArgumentException` ou uma exceção personalizada.
     */
    public void registrar(String nome, String registro) {
        try {
            if (nome.length() > 2) {
                if (registro.length() > 2) {
                    Funcionario funcionario = new Funcionario();
                    funcionario.setNome(nome);
                    funcionario.setRegistro(registro);
                    this.funcionarios.add(funcionario); // Adicionado para incluir na lista mockada
                    System.out.println("Funcionário " + funcionario.getNome() + " registrado com sucesso!");
                } else {
                    throw new Error("O registro deve ter mais de 2 caracteres");
                }
            } else {
                throw new Error("O nome deve ter mais de 2 caracteres");
            }
        }catch (Exception err) {
            throw new Error(err);
        }
    }
}