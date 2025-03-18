package br.com.cryptocoin.login;

import br.com.cryptocoin.register.Register;

public class Login extends Register{


        String email;
        String password;
        Register register = new Register();

        public Login(){};

        public Login(String email, String password){
                this.email = email;
                this.password = password;
        }

        public String getEmail() {
                return email;
        }

        public String getPassword() {
                return password;
        }

        public Login setEmail(String email) {
                this.email = email;
                return this;
        }

        public Login setPassword(String password) {
                this.password = password;
                return this;
        }

        @Override
        public String toString() {
                return " Usuario Registrado com sucesso";
        }
}
