package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.TeacherState;

public interface TeacherStateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_state
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer teacherStateId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_state
     *
     * @mbggenerated
     */
    int insert(TeacherState record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_state
     *
     * @mbggenerated
     */
    int insertSelective(TeacherState record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_state
     *
     * @mbggenerated
     */
    TeacherState selectByPrimaryKey(Integer teacherStateId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_state
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TeacherState record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_state
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TeacherState record);
}