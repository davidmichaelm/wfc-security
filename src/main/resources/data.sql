insert into users(username, password, enabled)
values('sread', '$2a$10$9Yaexvn/hsQJaGy1GnHbgOt/rWO2ioNFB9v0IA.O0sbopdH0siyE.', 'T');

insert into users(username, password, enabled)
values('mgreen', '$2a$10$0MohW6QFaXXxdmeffHYi4ecuJ7AZsqYLtsUFdUaF9LuxiCYA7LlzC', 'T');

insert into users(username, password, enabled)
values('csandals', '$2a$10$XSNM8A4kMnSl8CijceZTpuH7PTebBJYk3gkDxziz0ItUSt3oqw5.m', 'T');

insert into authorities(username, authority)
values ('sread', 'employee');

insert into authorities(username, authority)
values ('mgreen', 'employee');

insert into authorities(username, authority)
values ('csandals', 'major');