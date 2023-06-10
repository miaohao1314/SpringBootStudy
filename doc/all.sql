-- 创建ebook表
drop  table  if exists  test;
create  table  test(
                       id bigint not null  comment 'id',
                       name varchar(50) comment  '名称',
                       primary key (id)
)engine=innodb default charset = utf8mb4 comment='测试';

select *  from test;

-- 创建ebook
CREATE TABLE ebook(

                      `id`  bigint not NULL COMMENT 'id',
                      `name` varchar(50) COMMENT '名称',
                      `description` VARCHAR(200) COMMENT  '描述',
                      `cover` VARCHAR(200) COMMENT  '封面',
                      `doc_count` int not null default 0 COMMENT '文档数',
                      `view_count` int not null default 0 COMMENT '阅读数',
                      `vote_count` int not null default 0 COMMENT '点赞数',
                      PRIMARY KEY(id)

) engine=INNODB default charset=utf8mb4 COMMENT='电子书';

