package com.cskaoyan.javase.swing.manager.stage7.controller;

import com.cskaoyan.javase.swing.manager.stage7.model.Student;


/**
 * 与学生信息相关的,业务操作接口
 * @since 19:10
 * @author wuguidong@cskaoyan.onaliyun.com
 */
public interface StudentController {

    // 获取表格需要的学生信息二维数组
    String[][] getAllTableData();

    // 获取表格列数据
    String[] getTableColumns();

    // 删除学生信息
    boolean delStudent(String id);

    // 检查学号重复性
    boolean checkStuIdRepeat(String id);

    // 插入学生
    boolean addStudent(Student stu);

    // 检索: 通过学号获取一条表格数据
    String[][] getResultByStuId(String stuId);

    // 检索: 通过学号获取一条表格数据
    String[][] getResultByName(String name);

    // 修改一个单元格的内容
    boolean updateCellByStuId(String targetStuId, int targetCol, String newValue);

    // 修改一条学生信息
    int updateStudentByStuId(String targetStuId, Student stu);

    // 保存内存中的学生数组数据到文件中
    boolean saveDataToFile();
}
