package br.com.demo.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtil {

    public static String gerarBCrypt(String senha) {
        if (senha != null) {

            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
            return bCryptPasswordEncoder.encode(senha);
        }
        return null;
    }


    public static boolean senhaValida(String senha, String senhaEnconder) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.matches(senha, senhaEnconder);
    }
}
