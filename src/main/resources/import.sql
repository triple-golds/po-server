insert into user_info(id, username) values (1, '50122212');

insert into trade_union_team(id, team_name, sub_union) values (1, '第一小组', '智造技术分会');
insert into trade_union_team(id, team_name, sub_union) values (2, '第二小组', '智造技术分会');
insert into trade_union_team(id, team_name, sub_union) values (3, '第三小组', '智造技术分会');
insert into trade_union_team(id, team_name, sub_union) values (6, 'CF01', 'CF分会');
insert into trade_union_team(id, team_name, sub_union) values (7, 'CF02', 'CF分会');

insert into user_info_trade_union_team(user_info_id, trade_union_team_id) values (1, 1);
insert into user_info_trade_union_team(user_info_id, trade_union_team_id) values (1, 2);
insert into user_info_trade_union_team(user_info_id, trade_union_team_id) values (1, 3);
insert into user_info_trade_union_team(user_info_id, trade_union_team_id) values (1, 6);
insert into user_info_trade_union_team(user_info_id, trade_union_team_id) values (1, 7);
