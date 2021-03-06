package com.example.rcp.mapper;

import com.example.rcp.domain.VisitorCompanys;
import com.example.rcp.domain.VisitorCompanysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitorCompanysMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table visitor_companys
	 * @mbg.generated  Sat Aug 28 02:17:07 JST 2021
	 */
	long countByExample(VisitorCompanysExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table visitor_companys
	 * @mbg.generated  Sat Aug 28 02:17:07 JST 2021
	 */
	int deleteByExample(VisitorCompanysExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table visitor_companys
	 * @mbg.generated  Sat Aug 28 02:17:07 JST 2021
	 */
	int deleteByPrimaryKey(Integer visitor_company_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table visitor_companys
	 * @mbg.generated  Sat Aug 28 02:17:07 JST 2021
	 */
	int insert(VisitorCompanys record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table visitor_companys
	 * @mbg.generated  Sat Aug 28 02:17:07 JST 2021
	 */
	int insertSelective(VisitorCompanys record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table visitor_companys
	 * @mbg.generated  Sat Aug 28 02:17:07 JST 2021
	 */
	List<VisitorCompanys> selectByExample(VisitorCompanysExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table visitor_companys
	 * @mbg.generated  Sat Aug 28 02:17:07 JST 2021
	 */
	VisitorCompanys selectByPrimaryKey(Integer visitor_company_id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table visitor_companys
	 * @mbg.generated  Sat Aug 28 02:17:07 JST 2021
	 */
	int updateByExampleSelective(@Param("record") VisitorCompanys record,
			@Param("example") VisitorCompanysExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table visitor_companys
	 * @mbg.generated  Sat Aug 28 02:17:07 JST 2021
	 */
	int updateByExample(@Param("record") VisitorCompanys record, @Param("example") VisitorCompanysExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table visitor_companys
	 * @mbg.generated  Sat Aug 28 02:17:07 JST 2021
	 */
	int updateByPrimaryKeySelective(VisitorCompanys record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table visitor_companys
	 * @mbg.generated  Sat Aug 28 02:17:07 JST 2021
	 */
	int updateByPrimaryKey(VisitorCompanys record);
}