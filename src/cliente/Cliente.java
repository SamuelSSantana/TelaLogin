/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samuel santana
 */
public class Cliente {
    private String nome;
    private String senha;

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
List<String> clientes = new ArrayList<String>();

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((senha == null) ? 0 : senha.hashCode());
    result = prime * result + ((clientes == null) ? 0 : clientes.hashCode());
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Cliente other = (Cliente) obj;
    if (nome == null) {
        if (other.nome != null)
            return false;
    } else if (!nome.equals(other.nome))
        return false;
    if (senha == null) {
        if (other.senha != null)
            return false;
    } else if (!senha.equals(other.senha))
        return false;
    if (clientes == null) {
        if (other.clientes != null)
            return false;
    } else if (!clientes.equals(other.clientes))
        return false;
    return true;
}

@Override
public String toString() {
    return "Cliente [nome=" + nome + ", senha=" + senha + ", clientes=" + clientes + "]";
}
    
}
