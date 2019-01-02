create database if not exists `grounpon_new` default character set utf8;

use `grounpon_new`;

drop table if exists user_new;

create table user_new(
  `id` bigint(20) not null auto_increment,
  `password` varchar(45) not null ,
  `name` varchar(45)not null ,
  `login_time` datetime not null ,
  `create_time` datetime not null ,
  `update_time` datetime not null ,
  primary key (`id`),
  unique key `user_name_UNIQUE`(`name`)

)engine=InnoDB DEFAULT CHARSET=utf8;

create table `order_basic_new`(
  `id` bigint(20) unsigned not null auto_increment,
  `user_id` bigint(20) unsigned not null comment '用户id',
  `order_status` int(4) not null comment '订单状态',
  `total_price` int(11) not null comment '订单总价',
  `total_settlement_price` int(11) not null comment '订单结算总价',
  `address` mediumtext comment '收货地址',
  `receiver` varchar(128) not null comment '收件人',
  `phone` varchar(20) not null comment '电话',
  `pay_type` int(2) default '0' comment '支付方式',
  `create_time` datetime not null ,
  `update_time` datetime not null ,
  primary key ('id'),
  key `order_user_INDEX`(`user_id`)

)engine=InnoDB DEFAULT CHARSET=utf8;
