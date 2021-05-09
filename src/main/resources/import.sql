insert into cozinha (id, nome) values (1, 'Tailandesa');
insert into cozinha (id, nome) values (2, 'Indiana');


insert into restaurante (nome, taxa_frete, cozinha_id) values ('Thai Gourmet', 10, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Thai Delivery', 9.50, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Tuk Tuk Comida Indiana', 15, 2);

insert into forma_pagamento(id, descricao, restaurante_id) values (1, 'CREDITO', 2);
insert into forma_pagamento(id, descricao, restaurante_id) values (2, 'DEBITO', 1);
insert into forma_pagamento(id, descricao, restaurante_id) values (3, 'CREDITO', 2);



