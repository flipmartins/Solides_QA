#language: pt

Funcionalidade: Criar novo usuário

  Cenário: Criar um novo usuário
    Quando acessar a página
    E clicar no link Registre-se
    E preencher o campo email
    E preencher o campo CPF
    E preencher o campo Senha
    E preencher o campo Repetir Senha
    E clicar no checkbox para concordar com os termos de uso
    E clicar no botão Cadastrar
    Então eu verifico se fui cadastrado com sucesso