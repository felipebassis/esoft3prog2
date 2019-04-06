package br.com.unicesumar.aula20190326;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class VaultTest {

    @Test
    void shouldCloseAndOpenVault() {
        Vault vault = new Vault();
        assertEquals(VaultState.OPEN_WITHOUT_PASSWORD, vault.getState());

        vault.inputPassword(1003);
        assertEquals(VaultState.CLOSED_WITH_PASSWORD, vault.getState());

        vault.inputPassword(1003);
        assertEquals(VaultState.OPEN_WITHOUT_PASSWORD, vault.getState());
    }

    @Test
    void shouldCloseAndThrowExceptionWhenPasswordIsNotTheSame() {
        Vault vault = new Vault();
        assertEquals(VaultState.OPEN_WITHOUT_PASSWORD, vault.getState());

        vault.inputPassword(1003);
        assertEquals(VaultState.CLOSED_WITH_PASSWORD, vault.getState());

        Executable executable = () -> vault.inputPassword(1000);
        var exception = assertThrows(RuntimeException.class, executable);
        assertEquals("Wrong Password", exception.getLocalizedMessage());
    }
}