package com.mycompany.util;

/**
 *
 * @author adria
 */
public class ValidadorCPF {

    public static String formatCPF(String cpf) {
        cpf = cpf.replaceAll("\\D", ""); // Remove qualquer caractere que não seja número

        if (cpf.length() != 11) {
            throw new IllegalArgumentException("CPF inválido! Deve conter 11 dígitos.");
        }

        return String.format("%s.%s.%s-%s",
                cpf.substring(0, 3),
                cpf.substring(3, 6),
                cpf.substring(6, 9),
                cpf.substring(9, 11));
    }

//    public static boolean isValidCPF(String cpf) {
//        cpf = cpf.replaceAll("\\D", ""); // Remove pontos e traços
//
//        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
//            return false; // CPF não pode ter todos os números iguais
//        }
//
//        // Cálculo dos dígitos verificadores
//        int sum = 0;
//        for (int i = 0; i < 9; i++) {
//            sum += (cpf.charAt(i) - '0') * (10 - i);
//        }
//        int firstDigit = 11 - (sum % 11);
//        if (firstDigit >= 10) {
//            firstDigit = 0;
//        }
//
//        if (firstDigit != (cpf.charAt(9) - '0')) {
//            return false;
//        }
//
//        sum = 0;
//        for (int i = 0; i < 10; i++) {
//            sum += (cpf.charAt(i) - '0') * (11 - i);
//        }
//        int secondDigit = 11 - (sum % 11);
//        if (secondDigit >= 10) {
//            secondDigit = 0;
//        }
//
//        return secondDigit == (cpf.charAt(10) - '0');
//    }
//    public static boolean isValidCPF(String cpf) {
//        // Verifica se o CPF é nulo ou não tem exatamente 11 dígitos numéricos
//        if (cpf == null || cpf.length() != 11 || !cpf.matches("\\d{11}")) {
//            return false; // Retorna false se o CPF não for válido
//        }
//        return true; // Retorna true se o CPF for válido
//    }

    public static boolean isValidCPF(String cpf) {
        // Formata o CPF primeiro
        try {
            cpf = formatCPF(cpf);
        } catch (IllegalArgumentException e) {
            return false; // Retorna false se o CPF não for válido após formatação
        }

        // Verifica se o CPF contém exatamente 11 dígitos numéricos após a formatação
        if (cpf == null || cpf.length() != 14 || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            return false; // Retorna false se o CPF não for válido
        }

        return true; // Retorna true se o CPF for válido
    }

   
}
