INSERT INTO categoria(id, imagemSimboloUrl, nome, descricao)
VALUES (1, 'https://cf.shopee.com.br/file/09f1035c96d17ec1c87759dc0f77eb96', 'calcado', 'lorem ipsum');

INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario)
VALUES (1, 'bota', 'lorem ipsum', 'https://cf.shopee.com.br/file/09f1035c96d17ec1c87759dc0f77eb96', '2021-07-01', CURRENT_TIMESTAMP(), '300');

INSERT INTO categoriaProduto(id, id_categoria, id_produto)
VALUES (1, 1, 1);

INSERT INTO tabelaPromocao(id, nome, descricao, dataInicio, dataFim, dataCadastro, dataUltimaAtualizacao)
VALUES (1, 'papapapa', 'lorem ipsum dolor', '2021-08-29', '2021-09-10', '2021-08-29', CURRENT_TIMESTAMP());

INSERT INTO promocaoItem(id, valorPromocao, dataCadastro, dataUltimaAtualizacao, id_tabelaPromocao, id_produto)
VALUES (1, 50, '2021-08-29', CURRENT_TIMESTAMP(), 1, 1);