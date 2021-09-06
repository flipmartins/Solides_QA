#language: pt

Funcionalidade: Editar perfil

  Cenário: Editar perfil
    Dado que acessei a página inicial
    E informo o email
    E preencher o campo Senha
    E clico em Entrar
    Então visualizo a página do usuario
    Quando preencho o campo telefone
    E marcar a opção do Whatsapp
    E escolhe o genero
    E preencher a data de nascimento
    E clicar para salvar
    Então  verifico se o perfil foi editado com sucesso