#language: pt

Funcionalidade: Realizar login

  Cenário: um usuário do sistema
    Quando acesso a página de login
    E informar email
    E informar a senha
    E clicar no entrar
    Então eu verifico se estou logado