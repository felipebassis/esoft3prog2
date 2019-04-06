package br.com.unicesumar.aula20190326;

import java.util.Objects;

class Vault {

    private Integer password;

    private VaultState state = VaultState.OPEN_WITHOUT_PASSWORD;

    void inputPassword(Integer input) {
        if (Objects.isNull(this.password) && Objects.nonNull(input)) {
            this.password = input;
            this.state = VaultState.CLOSED_WITH_PASSWORD;
        }
        if (this.password.equals(input)) {
            this.password = null;
            this.state = VaultState.OPEN_WITHOUT_PASSWORD;
        }
        throw new RuntimeException("Wrong Password");
    }

    VaultState getState() {
        return state;
    }
}
