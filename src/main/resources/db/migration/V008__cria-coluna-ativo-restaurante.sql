
alter table restaurante add column ativo boolean not null default true;
update restaurante set ativo = true;