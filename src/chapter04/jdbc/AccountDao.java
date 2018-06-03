package chapter04.jdbc;

public interface AccountDao {
    int addAccount(Account account);

    int updateAccount(Account account);

    int deleteAccount(int id);
}
