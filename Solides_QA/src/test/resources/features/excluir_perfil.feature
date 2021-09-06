#language: pt

Funcionalidade: Excluir perfil

  Cenário: Excluir perfil
    Quando acessar a página do perfil
    E clicar no submenu
    E escolher a opção Preferencias
    E clicar no botao Excluir conta
    E preencher a data de nascimento
    E confimar a exclusão
    Então  verifico se o perfil foi excluído com sucesso