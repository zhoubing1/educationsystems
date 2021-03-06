package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.GraduationStudentVisitRecord;

public interface GraduationStudentVisitRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduation_student_visit_record
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer graduationStudentVisitRecordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduation_student_visit_record
     *
     * @mbggenerated
     */
    int insert(GraduationStudentVisitRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduation_student_visit_record
     *
     * @mbggenerated
     */
    int insertSelective(GraduationStudentVisitRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduation_student_visit_record
     *
     * @mbggenerated
     */
    GraduationStudentVisitRecord selectByPrimaryKey(Integer graduationStudentVisitRecordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduation_student_visit_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GraduationStudentVisitRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduation_student_visit_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GraduationStudentVisitRecord record);
}