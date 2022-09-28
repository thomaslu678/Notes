import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testNoArgConstructor(){
        BankAccount account = new BankAccount();
        Assertions.assertEquals(0, account.getBalance());
    }

    @Test
    void testParameterConstructor() {
        BankAccount account = new BankAccount(1000000);
        Assertions.assertEquals(1000000, account.getBalance());
    }

    @Test
    void deposit() {
    }

    @Test
    void withdraw() {
    }

    @Test
    void getBalance() {
    }
}