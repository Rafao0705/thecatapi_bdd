# language: pt

  Funcionalidade: Votação

    Cenario: Efetua votação
      Dado que esteja na tela principal
      Quando efetua votação em uma imagem
      Então votação efetuada com sucesso


    Cenario: Deleta votação
      Dado que tenha efetuado uma votação
      Quando efetua a exclusão da votação
      Então exclusao da votação efetuada com sucesso