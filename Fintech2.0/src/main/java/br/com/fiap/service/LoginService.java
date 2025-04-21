package br.com.fiap.service;
import br.com.fiap.dao.AccountDao;
import br.com.fiap.exception.EntityNotFound;
import br.com.fiap.model.user.Account;
import java.sql.SQLException;

public class LoginService {

    private final AccountDao accountDao;

    public LoginService(AccountDao dao){
        this.accountDao = dao;
    }

    public boolean auth(String email, String password) throws SQLException, EntityNotFound {
        try{
        Account account = accountDao.login(email, password);
        return account != null;
        } catch (EntityNotFound e) {
            throw new EntityNotFound("Erro ao realizar login!");
        }
    }
}
