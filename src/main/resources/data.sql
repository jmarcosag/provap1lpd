INSERT INTO categoria(id, imagemSimboloUrl, nome, descricao)
VALUES (1, '', 'dadada', 'lorem ipsum');

INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario)
VALUES (1, 'tatata', 'lorem ipsum', '', '- -', CURRENT_TIMESTAMP(), '120');

INSERT INTO categoriaProduto(id, id_categoria, id_produto)
VALUES (1, 1, 1);

INSERT INTO tabelaPromocao(id, nome, descricao, dataInicio, dataFim, dataCadastro, dataUltimaAtualizacao)
VALUES (1, 'papapapa', 'lorem ipsum dolor', '- -', '- -', '- -', CURRENT_TIMESTAMP());

INSERT INTO promocaoItem(id, valorPromocao, dataCadastro, dataUltimaAtualizacao, id_tabelaPromocao, id_produto)
VALUES (1, 20, '- -', CURRENT_TIMESTAMP(), 1, 1);