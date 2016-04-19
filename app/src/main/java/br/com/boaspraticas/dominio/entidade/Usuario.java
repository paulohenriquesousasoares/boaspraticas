package br.com.boaspraticas.dominio.entidade;

/**
 * Created by useradmin on 25/03/2016.
 */
public class Usuario {

    private String usuarioNome;
    private String usuarioEmail;
    private String usuarioPassword;

    public Usuario() {
    }

    public Usuario(String usuarioNome, String usuarioEmail, String usuarioPassword) {
        this.usuarioNome = usuarioNome;
        this.usuarioEmail = usuarioEmail;
        this.usuarioPassword = usuarioPassword;
    }

    public String getUsuarioNome() {
        return usuarioNome;
    }

    public void setUsuarioNome(String usuarioNome) {
        this.usuarioNome = usuarioNome;
    }

    public String getUsuarioEmail() {
        return usuarioEmail;
    }

    public void setUsuarioEmail(String usuarioEmail) {
        this.usuarioEmail = usuarioEmail;
    }

    public String getUsuarioPassword() {
        return usuarioPassword;
    }

    public void setUsuarioPassword(String usuarioPassword) {
        this.usuarioPassword = usuarioPassword;
    }
}
