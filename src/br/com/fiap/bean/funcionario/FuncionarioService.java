package br.com.fiap.bean.funcionario;

public class FuncionarioService extends FuncionarioEntity {
    public FuncionarioEntity registrar(String nome, String registro) {
        try{
            if (nome != null && nome.length() > 2){
                if (registro != null && registro.length() > 2){
                    FuncionarioEntity funcionario = new FuncionarioEntity(nome, registro);
                    System.out.println("Usuário criado com sucesso!");
                    return funcionario;
                } else {
                    throw new Error("O registro deve ter mais de 2 caracteres");
                }
            } else {
                throw new Error("O nome deve ter mais de 2 caracteres");
            }
        }catch (Exception err) {
            throw new Error(err);
        }
    };
}
