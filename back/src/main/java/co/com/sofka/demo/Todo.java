package co.com.sofka.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private Long id;
    private String name;
    private boolean idCompletado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIdCompletado() {
        return idCompletado;
    }

    public void setIdCompletado(boolean idCompletado) {
        this.idCompletado = idCompletado;
    }
}
