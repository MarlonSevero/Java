import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserInfoRegister {

    String name;
    LocalDate dt_birth;
    double renda;

    public UserInfoRegister(String name, LocalDate dt_birth, double renda){
        this.name = name;
        this.dt_birth = dt_birth;
        this.renda = renda;
    }

    public String getDt_Formatted(){ /*metodo para formatar a data nascimento padrao brasil*/
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dt_birth.format(formatter);
    }

    public void setDt_birth(LocalDate dt_birth){ /*setter para setar a data de nascimento*/
        this.dt_birth = dt_birth;
    }
}
