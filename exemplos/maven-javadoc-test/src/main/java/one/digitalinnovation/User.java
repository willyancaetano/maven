package one.digitalinnovation;

/**
 * Classe que representa o usuário
 */
public class User {

    private String username;

    private String password;

    private StatusUser status;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public StatusUser getStatus() {
        return status;
    }

    /**
     * Desabilita o usuário informando setando o status DISABLED
     */
    public void disable() {
        this.status = StatusUser.DISABLED;
    }

    /**
     * Habilita o usuário informando setando o status ENABLED
     */
    public void enable() {
        this.status = StatusUser.ENABLED;
    }
}
