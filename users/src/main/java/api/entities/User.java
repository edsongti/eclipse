package api.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private String password;
	
	public User() {
	}
	
	public User(Long id, String nome, String email, String telefone, String password) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.password = password;
	}
	
	public Long getId() {
	    return this.id;
	}
	
	public void setId(Long id) {
		 this.id = id;
	}
	
	public String getNome() {
	    return this.nome;
	}
	
	public void setNome(String nome) {
	    this.nome = nome;
	}
	
	public String getEmail() {
	    return this.email;
	}
	
	public void setEmail(String email) {
	    this.email = email;
	}
	
	public String getTelefone() {
	    return this.telefone;
	}
	
	public void setTelefone(String telefone) {
	    this.telefone = telefone;
	}
	
	public String getPassword() {
	    return this.password;
	}
	
	public void setPassword(String password) {
	    this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, nome, password, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(nome, other.nome)
				&& Objects.equals(password, other.password) && Objects.equals(telefone, other.telefone);
	}
	

}
