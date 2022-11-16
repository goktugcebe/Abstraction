/**
 * The DataBaseLogin program implements an application that
 *  simply create an abstract class for database login.
 *
 */

abstract class DataBaseLogin {
private String username;
private String password;

    /**
     *
     * @param username
     * @param password
     */
    public DataBaseLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    abstract void login();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
