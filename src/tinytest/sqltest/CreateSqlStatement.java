package tinytest.sqltest;

/**
 * @author tian.gao
 * @create 2018.12.11 6:22 PM
 **/
public class CreateSqlStatement {

    public static void main(String[] args) {

        for (int i = 1; i < 13; i++) {
            if (i < 10) {
                System.out.println("ALTER TABLE `tb_chat_message_record_20210" + i + "` MODIFY COLUMN `operate_type` tinyint(4) NOT NULL DEFAULT 0 COMMENT '操作类型（0 默认 1发送、2取消、3编辑）',\n" +
                        "ADD COLUMN `recommend_module` varchar(64) NOT NULL DEFAULT '' COMMENT '来源模块' AFTER `operator`;");
            }else {
                System.out.println("ALTER TABLE `tb_chat_message_record_2021" + i + "` MODIFY COLUMN `operate_type` tinyint(4) NOT NULL DEFAULT 0 COMMENT '操作类型（0 默认 1发送、2取消、3编辑）',\n" +
                        "ADD COLUMN `recommend_module` varchar(64) NOT NULL DEFAULT '' COMMENT '来源模块' AFTER `operator`;");
            }
        }
    }
}
