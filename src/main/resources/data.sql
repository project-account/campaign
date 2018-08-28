insert into TEST
values(1,'soner');

insert into TEST
values(2,'emre');

insert into SELLER
  (id, version, deleted, name)
values
  (1, 0, 0, 'first seller');

insert into CATEGORY
  (id, version, deleted, name)
values
  (1, 0, 0, 'first category');

insert into CAMPAIGN
  (id, version, deleted, title, seller_id, category_id)
values
  (1, 0, 0, 'first campaign', 1, 1);